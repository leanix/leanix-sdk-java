package net.leanix.pathfinder.samples.simpleCalls;

import net.leanix.api.FactSheetsApi;
import net.leanix.api.GraphqlApi;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiClientBuilder;
import net.leanix.api.models.FactSheetResponse;
import net.leanix.api.models.GraphQLRequest;
import net.leanix.api.models.GraphQLResult;

import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        ApiClient apiClient = new ApiClientBuilder()
                .withApiToken("XUyvqWTYxLfJqdzpLs4M56UgmDHnSCXxCadAQJGY")
                .withTokenProviderHost("local-svc.leanix.net")
                .withBasePath("https://local-eam.leanix.net/beta/api/v1")
                .withDebugging(false)
                .build();

        FactSheetsApi factSheetsApi = new FactSheetsApi(apiClient);

        FactSheetResponse response = factSheetsApi.getFactSheet("03e065bc-e723-4f16-b2cd-69bb503193d9", "*", true);
        System.out.println(response.getData().getDisplayName());

        GraphqlApi graphqlApi = new GraphqlApi(apiClient);

        GraphQLRequest graphqlRequest = new GraphQLRequest();
        graphqlRequest.setQuery("{factSheet(id:\"03e065bc-e723-4f16-b2cd-69bb503193d9\"){displayName}}");
        GraphQLResult graphqlResult = graphqlApi.processGraphQL(graphqlRequest);
        if (graphqlResult.getErrors() != null) {
            System.out.println("GraphQL response includes errors");
        }

        if (graphqlResult.getData() != null) {
            Map<String, Object> data = (Map<String, Object>) graphqlResult.getData();
            Map<String, Object> factSheet = (Map<String, Object>) data.get("factSheet");
            System.out.println(factSheet.get("displayName"));
        }
    }
}
