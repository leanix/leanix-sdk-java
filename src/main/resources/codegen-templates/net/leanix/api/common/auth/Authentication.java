package net.leanix.api.common.auth;

import java.util.List;
import java.util.Map;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.Pair;

public interface Authentication {
    /** Apply authentication settings to header and query params. */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) throws ApiException;

}
