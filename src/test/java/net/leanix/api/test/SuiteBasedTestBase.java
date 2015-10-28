package net.leanix.api.test;

import net.leanix.api.ServicesApi;
import net.leanix.api.common.ApiClient;

import org.junit.ClassRule;

/**
 * Base class for tests that are based on a test suite,
 * fetching the leanix client from the setup rule performed in the test suite class.
 */
public class SuiteBasedTestBase {

    protected ApiClient getApiClient() {
        return SuiteBase.setupRule.getLeanixApiClient();
    }

}


