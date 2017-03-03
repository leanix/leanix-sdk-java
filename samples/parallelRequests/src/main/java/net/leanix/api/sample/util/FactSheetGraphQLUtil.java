package net.leanix.api.sample.util;

import com.google.common.base.Preconditions;
import java.util.Map;
import net.leanix.api.models.GraphQLRequest;
import net.leanix.api.sample.parallel.SearchPathUtil;

public class FactSheetGraphQLUtil {

    private static final String APPLICATION = "Application";

    public static final String templateCreateFS;
    public static final String templateCreateParentToChildRelation;
    public static final String templateCreateChildToParentRelation;

    static {
        templateCreateFS = Preconditions
            .checkNotNull(SearchPathUtil.getResourceAsString("classpath:/graphql/createFactSheet.mutation"));
        templateCreateParentToChildRelation = Preconditions
            .checkNotNull(SearchPathUtil.getResourceAsString("classpath:/graphql/createParentToChildRelation.mutation"));
        templateCreateChildToParentRelation = Preconditions
            .checkNotNull(SearchPathUtil.getResourceAsString("classpath:/graphql/createChildToParentRelation.mutation"));
    }

    public static GraphQLRequest createApplicationRequest(String fsName) {
        String query = String.format(templateCreateFS, fsName, APPLICATION);
        GraphQLRequest request = new GraphQLRequest();
        request.setQuery(query);
        return request;
    }

    public static GraphQLRequest updateFactSheetRequest_AddNewParentToChildRelation(String parentFsId, String childFsId) {
        String query = String.format(templateCreateParentToChildRelation, parentFsId, 0, childFsId);
        GraphQLRequest request = new GraphQLRequest();
        request.setQuery(query);
        return request;
    }

    public static GraphQLRequest updateFactSheetRequest_AddNewChildToParentRelation(String childFsId, int dbRevChild, String parentFsId) {
        String query = String.format(templateCreateChildToParentRelation, childFsId, dbRevChild, parentFsId);
        GraphQLRequest request = new GraphQLRequest();
        request.setQuery(query);
        return request;
    }

    public static String parseFactSheetId(Map<String, Object> createFactSheetMutationResponse) {
        Map<String, Object> data = getData(createFactSheetMutationResponse);
        Map<String, Object> factSheet =
                (Map<String, Object>) ((Map<String, Object>) data.values().iterator().next()).get("factSheet");
        return (String) factSheet.get("id");
    }

    @SuppressWarnings("unchecked")
    public static Map<String, Object> getData(Map<String, Object> gqlResponse) {
        return (Map<String, Object>) gqlResponse.get("data");
    }

}
