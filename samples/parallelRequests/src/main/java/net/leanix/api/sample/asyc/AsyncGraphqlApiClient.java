package net.leanix.api.sample.asyc;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import net.leanix.api.GraphqlApi;
import net.leanix.api.common.ApiClient;
import net.leanix.api.models.GraphQLRequest;

public class AsyncGraphqlApiClient extends AbstractAsyncClient<Serializable> {

    final GraphqlApi graphqlApi;

    public AsyncGraphqlApiClient(ApiClient apiClient, ListeningExecutorService service) {
        super(service);
        this.graphqlApi = new GraphqlApi(apiClient);
    }

    public ListenableFuture<Serializable> runRequest(final GraphQLRequest request) {
        ListenableFuture<Serializable> submit = service.submit(new Callable<Serializable>() {

            @Override
            public Serializable/* Map<String, Object> */ call() throws Exception {
                Map<String, Object> processGraphQL = graphqlApi.processGraphQL(request);
//                System.out.println("    -> "+request);
                return (Serializable) processGraphQL;
            }
        });

        return addFuture(submit);
    }
}
