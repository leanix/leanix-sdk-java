package net.leanix.api.sample.parallel;

import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.SettableFuture;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.leanix.api.common.ApiClient;
import net.leanix.api.models.GraphQLRequest;
import net.leanix.api.sample.parallel.config.ArgumentOptions;
import net.leanix.api.sample.util.FactSheetGraphQLUtil;
import net.leanix.api.sample.util.StopWatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HierarchyFactSheetPopulator extends AbstractRunner {

    private final static Logger LOG = LoggerFactory.getLogger(HierarchyFactSheetPopulator.class);

    public HierarchyFactSheetPopulator(ArgumentOptions argumentOptions, ApiClient apiClient,
        ListeningExecutorService executorService) {

        super(argumentOptions, apiClient, executorService, new StopWatch("Importing FactSheets in hierarchy into Pathfinder"));
    }

    @Override
    public int getSumFactSheetsCreated() {
        return (int) Math.pow(argumentOptions.factSheetCount, argumentOptions.hierarchyLevel - 1) + 1;
    }

    @Override
    public void run() throws InterruptedException, ExecutionException {

        ExecutorService executorService2 = Executors.newFixedThreadPool(argumentOptions.hierarchyLevel * 2);

        // create and send requests to create FactSheets
        stopWatch.start(String.format("Importing %d FactSheets using %d parallel threads", argumentOptions.factSheetCount,
            argumentOptions.threadCount));
        String suffix = LocalDateTime.now().toString();

        List<ListenableFuture<Integer>> futuresToSignalFinish = new ArrayList<>();

        // create parent FactSheets in level 1 and its children
        for (int i = 0; i < argumentOptions.factSheetCount; i++) {

            // create the parent App
            GraphQLRequest createFactSheetMutation = FactSheetGraphQLUtil.createApplicationRequest(createAppName(1, suffix, i));
            ListenableFuture<Serializable> createFSFuture = graphQLApiClient.runRequest(createFactSheetMutation);

            ListenableFuture<Integer> clientFuture =
                    Futures.transformAsync(createFSFuture, new AsyncFunction<Serializable, Integer>() {

                        @Override
                        public ListenableFuture<Integer> apply(Serializable input) throws Exception {
                            @SuppressWarnings("unchecked")
                            String fsGid = FactSheetGraphQLUtil.parseFactSheetId((Map<String, Object>) input);

                            Integer num = createClientApplications(fsGid, 2, suffix, executorService2);
                            SettableFuture<Integer> future = SettableFuture.create();
                            future.set(num);
                            return future;
                        }


                    },
                        executorService2);

            futuresToSignalFinish.add(clientFuture);
        }
        stopWatch.stop();

        stopWatch.start("Wait until all requests are finished");
        Futures.successfulAsList(futuresToSignalFinish).get();

        try {
            LOG.info("Stopping Executor Service2...");
            executorService2.awaitTermination(10, TimeUnit.SECONDS);
            List<Runnable> shutdownNow = executorService2.shutdownNow();
            System.out.println(shutdownNow.size());
            LOG.info("Stopping Executor Service...DONE");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    private Integer createClientApplications(String parentFsId, int level, String suffix,
        ExecutorService executorService2)
        throws InterruptedException, ExecutionException {

        if (level > argumentOptions.hierarchyLevel) {
            return 0;
        }

        // create childs
        List<ListenableFuture<Serializable>> createChildFutures = new ArrayList<>();
        for (int i = 0; i < argumentOptions.factSheetCount; i++) {
            // create a child FactSheet
            GraphQLRequest createFactSheetMutation =
                    FactSheetGraphQLUtil.createApplicationRequest(createAppName(level, suffix, i));
            ListenableFuture<Serializable> createChildFuture = graphQLApiClient.runRequest(createFactSheetMutation);

            createChildFutures.add(createChildFuture);
        }

        // create relations
        List<ListenableFuture<Serializable>> createRelationFutures = new ArrayList<>();
        for (ListenableFuture<Serializable> createChildFuture : createChildFutures) {

            // combine finish of child creation with next tasks
            ListenableFuture<Serializable> createRelationFuture =
                    Futures.transformAsync(createChildFuture, new AsyncFunction<Serializable, Serializable>() {

                        @Override
                        public ListenableFuture<Serializable> apply(Serializable input) {
                            String childId = FactSheetGraphQLUtil.parseFactSheetId((Map<String, Object>) input);
                            // System.out.println(String.format(" Created child (L%d) with id: %s", level, childId));

                            // add relation from child to parent
                            GraphQLRequest graphQLRequest = FactSheetGraphQLUtil
                                .updateFactSheetRequest_AddNewChildToParentRelation(childId, 0, parentFsId);
                            ListenableFuture<Serializable> createRelationFuture = graphQLApiClient.runRequest(graphQLRequest);
                            // System.out.println(String.format(" send child - parent relation request (L%d) : %s -> %s", level,
                            // childId, parentFsId));

                            Futures.addCallback(createRelationFuture, new FutureCallback<Serializable>() {

                                @Override
                                public void onSuccess(Serializable result) {
                                    System.out
                                        .println(
                                            String.format("   added relation parent (L%d) -- child (L%d)", level - 1, level));
                                }

                                @Override
                                public void onFailure(Throwable t) {
                                    System.out
                                        .println(String.format("*** FAILURE added relation parent (L%d) -- child (L%d)",
                                            level - 1, level));
                                }
                            });

                            return createRelationFuture;
                        }

                    });
            createRelationFutures.add(createRelationFuture);
        }

        Futures.successfulAsList(createRelationFutures).get();

        // create relations
        for (ListenableFuture<Serializable> createChildFuture : createChildFutures) {

            // create sub-childs for each child
            Serializable createChildResponse = createChildFuture.get();

            String childId = FactSheetGraphQLUtil.parseFactSheetId((Map<String, Object>) createChildResponse);
            // System.out.println(String.format(" Created child (L%d) with id: %s", level, childId));

            // add relation from child to parent
            try {
                createClientApplications(childId, level + 1, suffix, executorService2);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
                return 0;
            }
        }

        return createChildFutures.size();
    }


}
