/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.396
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.models.BookmarkSuggestionsResponse;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchbookmarksApi
 */
@Ignore
public class SearchbookmarksApiTest {

    private final SearchbookmarksApi api = new SearchbookmarksApi();

    
    /**
     * getBookmarkSuggestions
     *
     * Returns a list of bookmark suggestions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBookmarkSuggestionsTest() throws ApiException {
        String type = null;
        List<String> subtype = null;
        String q = null;
        Boolean personalized = null;
        String sort = null;
        List<String> cursor = null;
        Integer pageSize = null;
        String sortDirection = null;
        UUID factSheetId = null;
        Boolean ownedByMe = null;
        Boolean predefinedOnly = null;
        Boolean userdefinedOnly = null;
        BookmarkSuggestionsResponse response = api.getBookmarkSuggestions(type, subtype, q, personalized, sort, cursor, pageSize, sortDirection, factSheetId, ownedByMe, predefinedOnly, userdefinedOnly);

        // TODO: test validations
    }
    
}
