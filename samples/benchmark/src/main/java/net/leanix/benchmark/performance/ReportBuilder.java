package net.leanix.benchmark.performance;

/**
 * The schema of outgoing junit TEST-<testname>.xml file is based on surefire's output and this documentation here:
 * http://stackoverflow.com/questions/3362304/where-can-i-find-the-dtd-or-xml-schema-of-surefire-generated-xml-test-testname
 * 
 * @author ralfwehner
 *
 */
public class ReportBuilder {

    private final TestSuite testSuite = new TestSuite();

    public ReportBuilder withName(String name) {
        testSuite.name = name;
        return this;
    }

    public ReportBuilder addSuccessfulTestResult(String testName, double duration) {
        testSuite.addTestCase(new TestCase(duration, testName, testSuite.name));
        testSuite.time += duration;
        return this;
    }

    public TestSuite build() {
        testSuite.tests = testSuite.testcases.size();
        return testSuite;
    }

    public ReportBuilder addErrorTestResult(String testName, double duration, String errorType) {
        TestCase testCase = new TestCase(duration, testName, testSuite.name);
        testCase.error = new Error(errorType);
        testSuite.addTestCase(testCase);
        testSuite.errors++;
        testSuite.time += duration;
        return this;
    }
}
