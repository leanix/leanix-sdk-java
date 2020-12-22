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
import net.leanix.api.models.BookmarkShareInputData;
import net.leanix.api.models.BookmarkSharesResponse;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BookmarkSharesApi
 */
@Ignore
public class BookmarkSharesApiTest {

    private final BookmarkSharesApi api = new BookmarkSharesApi();

    
    /**
     * createBookmarkShares
     *
     * Saves a bookmark share in the database
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBookmarkShareTest() throws ApiException {
        BookmarkShareInputData bookmarkShare = null;
        BookmarkSharesResponse response = api.createBookmarkShare(bookmarkShare);

        // TODO: test validations
    }
    
    /**
     * deleteBookmarkShares
     *
     * Deletes a bookmark share by the calling user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBookmarkShareTest() throws ApiException {
        UUID bookmarkId = null;
        UUID sharedWithUserId = null;
        api.deleteBookmarkShare(bookmarkId, sharedWithUserId);

        // TODO: test validations
    }
    
    /**
     * getBookmarkShares
     *
     * Retrieves all stored bookmark shared by the calling user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBookmarkSharesTest() throws ApiException {
        UUID bookmarkId = null;
        BookmarkSharesResponse response = api.getBookmarkShares(bookmarkId);

        // TODO: test validations
    }
    
}
