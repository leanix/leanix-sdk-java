package net.leanix.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jersey.repackaged.com.google.common.base.Joiner;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiException;
import net.leanix.api.common.Configuration;
import net.leanix.api.filter.FacetFilter;
import net.leanix.api.filter.FacetGroup;
import net.leanix.api.filter.FacetListEntry;
import net.leanix.api.filter.PageRequest;
import net.leanix.api.models.GraphQLRequest;
import net.leanix.api.models.GraphQLResult;
import org.apache.commons.lang3.StringUtils;

/**
 * Provides a wrapper for the graphQL API to be able to use facet filters to create graphQL queries and retrieve the result.
 * Created by berndschoenbach on 28.06.17.
 */
public class FilterWrapper {
    private ApiClient apiClient;
    private GraphqlApi graphqlApi;

    public FilterWrapper() {
        this(Configuration.getDefaultApiClient());
    }

    public FilterWrapper(ApiClient apiClient) {
        this.apiClient = apiClient;
        graphqlApi = new GraphqlApi(apiClient);
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    private final String factSheetTypeFilter = "FactSheetTypes";
    private final String fallBackFSType = "Default";
    private String filterOptions = "filterOptions\n"
        + "      { facets\n"
        + "        {\n"
        + "          facetKey facetType facetSubType total\n"
        + "          possibleOperators operator\n"
        + "          results { name key count selected }\n"
        + "          dateFilter { from to type minDate maxDate }\n"
        + "          subscriptionFilter { type role { id name } }\n"
        + "          subFilter {\n"
        + "            facetFilters {\n"
        + "              facetKey operator\n"
        + "              keys\n"
        + "              dateFilter { from to type }\n"
        + "              subscriptionFilter { type role { id name } }\n"
        + "            }\n"
        + "          }\n"
        + "        }\n"
        + "      }";

    private String pageInfo = "pageInfo { hasNextPage hasPreviousPage startCursor endCursor }";

    private String factSheetsBlock = "edges { node { %s } }";

    /**
     * Processes the given filter request and returns the graphQL API response.
     *
     * @param filterList the list of filters to be applied, may be empty
     * @param fullTextSearchTerm the search term for full text search, may be null
     * @param pageRequest the page request
     * @param sortings the sorting the results should have
     * @param fieldList the list of fields which should be retrieved
     *
     * @return the result of the graphQL query built by this function, will be null if the request could not be performed
     */
    public GraphQLResult processFilterRequest(
        List<FacetFilter> filterList, String fullTextSearchTerm, PageRequest pageRequest, String sortings, List<String> fieldList
    ) throws ApiException {
        // Transform FacetFilter to Facet Group, and determine Fact Sheet Type
        List<FacetGroup> groups = createGroupsFromFacetFilter(filterList);

        String factSheetType = getFactSheetTypeFromFilter(groups);
        String query = buildQuery(factSheetType, fieldList, pageRequest);
        Map<String, Object> variables = buildVariables(filterList, sortings, fullTextSearchTerm);

        GraphQLRequest request = new GraphQLRequest();
        request.setQuery(query);
        request.setVariables(variables);

        return graphqlApi.processGraphQL(request);
    }

    private List<FacetGroup> createGroupsFromFacetFilter(List<FacetFilter> filterList) {
        List<FacetGroup> result = new ArrayList<>();
        for (FacetFilter filter: filterList) {
            FacetGroup facetGroup = new FacetGroup();
            facetGroup.setFacetKey(filter.getFacetKey());
            facetGroup.setOperator(filter.getOperator());
            facetGroup.setFacetType("UNKNOWN");
            if (facetGroup.getResults() == null) {
                facetGroup.setResults(new ArrayList<>());
            }
            for(String currentKey: filter.getKeys()) {
                FacetListEntry listEntry = new FacetListEntry();
                listEntry.setKey(currentKey);
                listEntry.setName(currentKey);
                listEntry.setNumber(0);
                listEntry.setSelected(true);
                facetGroup.getResults().add(listEntry);
            }

            result.add(facetGroup);
        }

        return result;
    }

    private String getFactSheetTypeFromFilter(List<FacetGroup> groups) {
        for(FacetGroup currentGroup: groups) {
            if (currentGroup.getFacetKey().equals(factSheetTypeFilter)) {
                java.util.Optional<FacetListEntry> fsTypeEntry = currentGroup.getResults()
                    .stream().findFirst().filter(f -> f.isSelected());

                if (fsTypeEntry.isPresent()) {
                    return fsTypeEntry.get().getName();
                }
            }
        }

        return fallBackFSType;
    }

    private Map<String,Object> buildVariables(List<FacetFilter> filterList, String sortings, String fullTextSearchTerm) {
        Map<String, Object> result = new HashMap<>();
        if (StringUtils.isNotEmpty(sortings)) {
            result.put("sortings", sortings);
        } else {
            result.put("sortings", new ArrayList<>());
        }

        Map<String,Object> facetFilterMap = new HashMap<>();
        if (StringUtils.isNotEmpty(fullTextSearchTerm)) {
            facetFilterMap.put("fullTextSearch", fullTextSearchTerm);
        }

        if (filterList.size() > 0) {
            facetFilterMap.put("facetFilters", filterList);
            result.put("filter", facetFilterMap);
        }

        return result;
    }

    private String buildQuery(String factSheetType, List<String> attributes, PageRequest pageRequest) {
        String factSheetFieldsQuery = getFactSheetFieldsQuery(factSheetType, attributes);

        return "query allFactSheetsQuery($filter: FilterInput!, $sortings: [Sorting]) { allFactSheets(" +
            pageRequest.toQuery() +
            "filter: $filter, sort: $sortings) {" + pageInfo +
            String.format(factSheetsBlock, factSheetFieldsQuery)
            + filterOptions
            + "} }";
    }

    private String getFactSheetFieldsQuery(String factSheetType, List<String> attributes) {
        String result;
        if (factSheetType.isEmpty()) {
            result = Joiner.on(" ").join(attributes);
        } else {
            result = "...on " + factSheetType + " { " + Joiner.on(" ").join(attributes) + "}";
        }

        return result;
    }
}
