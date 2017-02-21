package net.leanix.api.sample.parallel;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import net.leanix.api.common.ApiClient;
import net.leanix.api.models.GraphQLRequest;
import net.leanix.api.sample.asyc.AsyncGraphqlApiClient;
import net.leanix.api.sample.parallel.config.ArgumentOptions;

public class RandomFactSheetPopulator {

    private final ArgumentOptions argumentOptions;

    private final AsyncGraphqlApiClient graphQLApiClient;

    private final String template;

    public RandomFactSheetPopulator(ArgumentOptions argumentOptions, ApiClient apiClient,
        ListeningExecutorService executorService) {

        this.argumentOptions = argumentOptions;
        graphQLApiClient = new AsyncGraphqlApiClient(apiClient, executorService);
        template = Preconditions
            .checkNotNull(SearchPathUtil.getResourceAsString("src/main/resources/graphql/createFactSheet.mutation"));
    }


    public void run() throws InterruptedException, ExecutionException {

        String suffix = LocalDateTime.now().toString();
        for (int i = 0; i < argumentOptions.factSheetCount; i++) {
            GraphQLRequest createFactSheetMutation =
                    createFactSheetMutationString("Application", String.format("App %d %s", i, suffix));

            ListenableFuture<Serializable> requestFuture = graphQLApiClient.runRequest(createFactSheetMutation);
            System.out.println(requestFuture.get());
        }
    }


    private GraphQLRequest createFactSheetMutationString(String type, String fsName) {
        String query = String.format(template, fsName);
        GraphQLRequest request = new GraphQLRequest();
        request.setQuery(query);
        return request;
    }
}
