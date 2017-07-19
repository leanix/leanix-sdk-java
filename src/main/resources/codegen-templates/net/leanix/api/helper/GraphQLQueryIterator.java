package net.leanix.api.helper;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.common.collect.AbstractIterator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.leanix.api.GraphqlApi;
import net.leanix.api.common.ApiException;
import net.leanix.api.models.GraphQLRequest;
import net.leanix.api.models.GraphQLResult;

import org.apache.commons.lang3.StringUtils;

/**
 * Iterator for GraphQL/Relay paging logic.
 * Usable only on list type top level query fields which use queries of the form:
 * {@code query (variableDeclaration) { queryField(first:nn, after:"cursor", args) { pageInfo { hasNextPage endCursor } edges { node { <fields or fragments to query> } } } }}.
 *
 * @param <R> type of the list elements
 */
public class GraphQLQueryIterator<R> extends AbstractIterator<R> {

    private static final Logger LOG = Logger.getLogger("GraphQLQueryIterator");

    private static final String END_CURSOR_VARIABLE_NAME = "last";

    private final String queryField;
    private final String document;
    private final Map<String, Object> variables;

    private final ObjectMapper mapper;
    private final JavaType targetType;

    private final GraphqlApi graphqlApi;

    private Connection<R> fetchedConnection;
    private Iterator<Edge<R>> edgeIterator;

    /**
     * @param queryField the name of the top level field that is to be queried
     * @param args additional arguments used in top level query field
     * @param selections the selections (fields, inline fragments, fragment spreads) in the node to query. The string given here
     * will be put verbatim between the curly braces of the "node" field's selection set.
     * @param variableDeclaration the variables which will be used in the query
     * @param variables variables employed in the selections, may not contain a variable with a name given by {@code
     * END_CURSOR_VARIABLE_NAME}.
     * @param pageSize the page size to use in the query requests
     * @param modelClass the class of the list elements
     * @param graphqlApi used to send the GraphQL requests
     */
    public GraphQLQueryIterator(
            String queryField,
            Map<String, String> args,
            String selections,
            String fragmentDefinitions,
            String variableDeclaration,
            Map<String, Object> variables,
            int pageSize,
            Class<R> modelClass,
            GraphqlApi graphqlApi
    ) {
        if (variables != null && variables.containsKey(END_CURSOR_VARIABLE_NAME)) {
            throw new IllegalArgumentException(
                    "Variable " + END_CURSOR_VARIABLE_NAME + " may not be used---it is used internally in the paging iterator.");
        }

        if (pageSize <= 0) {
            throw new IllegalArgumentException("page size must be positive (is " + pageSize + ")");
        }

        Map<String, String> usedArgs = (args == null) ? new HashMap<>() : new HashMap<>(args);
        usedArgs.put("first", Integer.toString(pageSize));
        usedArgs.put("after", "$" + END_CURSOR_VARIABLE_NAME);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : usedArgs.entrySet()) {
            sb.append(' ').append(entry.getKey()).append(':').append(entry.getValue());
        }
        String arguments = sb.toString();

        this.queryField = queryField;
        sb.setLength(0);
        if (fragmentDefinitions != null) {
            sb.append(fragmentDefinitions);
        }
        sb.append("query ($").append(END_CURSOR_VARIABLE_NAME).append(":String");
        if (!StringUtils.isEmpty(variableDeclaration)) {
            sb.append(variableDeclaration);
        }
        sb.append("){").append(queryField).append("(").append(arguments)
                .append("){pageInfo{hasNextPage endCursor} edges{node{").append(selections).append("}}}}");
        document = sb.toString();

        this.variables = variables == null ? new HashMap<>() : new HashMap<>(variables);

        mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.setDateFormat(new ISO8601DateFormat());
        targetType = mapper.getTypeFactory().constructParametrizedType(Connection.class, Connection.class, modelClass);
        this.graphqlApi = graphqlApi;
    }

    @Override
    protected R computeNext() {
        if (edgeIterator != null && edgeIterator.hasNext()) {
            return edgeIterator.next().getNode();
        }

        if (fetchedConnection != null) {
            if (!fetchedConnection.getPageInfo().isHasNextPage()) {
                return endOfData();
            }
            variables.put(END_CURSOR_VARIABLE_NAME, fetchedConnection.getPageInfo().getEndCursor());
        }

        GraphQLRequest graphQLRequest = new GraphQLRequest()
                .query(document)
                .variables(variables);

        GraphQLResult graphQLResult;
        try {
            graphQLResult = graphqlApi.processGraphQL(graphQLRequest);
        } catch (ApiException e) {
            LOG.log(Level.SEVERE, "error calling graphql endpoint for " + document, e);
            throw new PFBusinessLogicException("error processing graphql", 500); // FIXME
        }

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> errors = graphQLResult.getErrors();

        if (errors != null && !errors.isEmpty()) {
            LOG.log(Level.SEVERE, "graphql request <" + document + "> returned errors:  " + errors);
            throw new PFBusinessLogicException("request for external id return errors", 500); // FIXME
        }

        @SuppressWarnings("unchecked")
        Object queryFieldValue = ((Map<String, Object>) graphQLResult.getData()).get(queryField);

        fetchedConnection = mapper.convertValue(queryFieldValue, targetType);

        edgeIterator = fetchedConnection.getEdges().iterator();
        if (edgeIterator.hasNext()) {
            return edgeIterator.next().getNode();
        } else {
            return endOfData();
        }
    }

    public static class Connection<T> {

        private List<Edge<T>> edges;
        private PageInfo pageInfo;

        public List<Edge<T>> getEdges() {
            return edges;
        }

        public PageInfo getPageInfo() {
            return pageInfo;
        }
    }

    public static class Edge<T> {

        private T node;
        private String cursor;

        public T getNode() {
            return node;
        }
    }

    public static class PageInfo {

        private boolean hasNextPage;
        private boolean hasPreviousPage;
        private String startCursor;
        private String endCursor;

        public boolean isHasNextPage() {
            return hasNextPage;
        }

        public String getEndCursor() {
            return endCursor;
        }
    }

    public static class PFBusinessLogicException extends RuntimeException {

        public PFBusinessLogicException(String message, int status) {
        }
    }
}
