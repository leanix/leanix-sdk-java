/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 3.9.132-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.models.Bookmark;
import net.leanix.api.models.BookmarkListResponse;
import net.leanix.api.models.BookmarkResponse;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BookmarksApi
 */
@Ignore
public class BookmarksApiTest {

    private final BookmarksApi api = new BookmarksApi();

    
    /**
     * createBookmark
     *
     * Saves a bookmark in the database
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBookmarkTest() throws ApiException {
        Bookmark body = null;
        BookmarkResponse response = api.createBookmark(body);

        // TODO: test validations
    }
    
    /**
     * deleteBookmark
     *
     * Deletes a bookmark identified by the given ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBookmarkTest() throws ApiException {
        UUID id = null;
        api.deleteBookmark(id);

        // TODO: test validations
    }
    
    /**
     * getBookmark
     *
     * Retrieves a bookmark by ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBookmarkTest() throws ApiException {
        UUID id = null;
        BookmarkResponse response = api.getBookmark(id);

        // TODO: test validations
    }
    
    /**
     * getBookmarks
     *
     * Retrieves all stored bookmarks a user can read.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBookmarksTest() throws ApiException {
        String bookmarkType = null;
        String groupKey = null;
        String sharingType = null;
        BookmarkListResponse response = api.getBookmarks(bookmarkType, groupKey, sharingType);

        // TODO: test validations
    }
    
    /**
     * updateBookmark
     *
     * Updates a bookmark stored in the database
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBookmarkTest() throws ApiException {
        UUID id = null;
        Bookmark body = null;
        BookmarkResponse response = api.updateBookmark(id, body);

        // TODO: test validations
    }
    
}
