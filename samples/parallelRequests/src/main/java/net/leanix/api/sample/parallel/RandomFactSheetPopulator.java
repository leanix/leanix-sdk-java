package net.leanix.api.sample.parallel;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import net.leanix.api.common.ApiClient;
import net.leanix.api.models.GraphQLRequest;
import net.leanix.api.sample.asyc.AsyncGraphqlApiClient;
import net.leanix.api.sample.parallel.config.ArgumentOptions;
import net.leanix.api.sample.util.StopWatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomFactSheetPopulator {

    private final static Logger LOG = LoggerFactory.getLogger(RandomFactSheetPopulator.class);

    private final ArgumentOptions argumentOptions;

    private final AsyncGraphqlApiClient graphQLApiClient;

    private final String template;

    AtomicInteger success = new AtomicInteger();
    AtomicInteger failures = new AtomicInteger();
    StopWatch stopWatch;

    public RandomFactSheetPopulator(ArgumentOptions argumentOptions, ApiClient apiClient,
        ListeningExecutorService executorService) {

        this.argumentOptions = argumentOptions;
        graphQLApiClient = new AsyncGraphqlApiClient(apiClient, executorService);
        template = Preconditions
            .checkNotNull(SearchPathUtil.getResourceAsString("classpath:/graphql/createFactSheet.mutation"));
        stopWatch = new StopWatch("Importing FactSheets into Pathfinder");
    }


    public void run() throws InterruptedException, ExecutionException {

        // create and send requests to create FactSheets
        stopWatch.start(String.format("Importing %d FactSheets using %d parallel threads", argumentOptions.factSheetCount,
            argumentOptions.threadCount));
        String suffix = LocalDateTime.now().toString();
        List<ListenableFuture<Serializable>> createMutationFutes = new ArrayList<>();
        for (int i = 0; i < argumentOptions.factSheetCount; i++) {
            GraphQLRequest createFactSheetMutation =
                    createFactSheetMutationString("Application", String.format("App %d %s", i, suffix));

            ListenableFuture<Serializable> future = graphQLApiClient.runRequest(createFactSheetMutation);

            Futures.addCallback(future, new FutureCallback<Serializable>() {

                @Override
                public void onSuccess(Serializable result) {
                    int i = success.incrementAndGet();
                    if (i % 50 == 0) {
                        System.out.println("created: " + i);
                    }
                }

                @Override
                public void onFailure(Throwable t) {
                    failures.incrementAndGet();
                }
            });

            createMutationFutes.add(future);
        }
        stopWatch.stop();

        stopWatch.start("Wait until all requests are finished");
        Futures.successfulAsList(createMutationFutes).get();
    }


    public void showSummary() {
        if (stopWatch.isRunning()) {
            stopWatch.stop();
        }

        // show summary of job
        System.out.println(stopWatch.prettyPrint());

        double throughput = (double) argumentOptions.factSheetCount / stopWatch.getTotalTimeSeconds();
        System.out.println(String.format("Successful requests: %d, Failed requests: %d", success.get(), failures.get()));
        System.out.println(String.format("Throughput: %f FactSheets / second", throughput));
        System.out.println(String.format("Throughput: %f FactSheets / minute", throughput * 60));
    }


    private GraphQLRequest createFactSheetMutationString(String type, String fsName) {
        String query = String.format(template, fsName);
        GraphQLRequest request = new GraphQLRequest();
        request.setQuery(query);
        return request;
    }
}
