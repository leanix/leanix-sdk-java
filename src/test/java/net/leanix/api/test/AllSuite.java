package net.leanix.api.test;

import org.junit.Ignore;
import org.junit.runners.Suite;

/**
 * This class can be augmented to perform tests in many test classes,
 * but these need to be listed manually below in @Suite.SuiteClasses.
 * These classes must then inherit from SuiteBasedTestBase instead of NotSuiteBasedTestBase.
 * To run all test classes in this suite, list them below and change class TestBase to inherit form SuiteBasedTestBase.
 * Then, one workspace will be created for all tests instead of one workspace per test class.
 */
@Suite.SuiteClasses({
    // unfinished / undesired
})
@Ignore
public class AllSuite extends SuiteBase {
}
