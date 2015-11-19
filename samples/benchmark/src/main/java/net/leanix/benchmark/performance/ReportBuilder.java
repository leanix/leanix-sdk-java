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
    private Class<?> testClass;

    public ReportBuilder forTestClass(Class<?> testClass) {
        this.testClass = testClass;
        testSuite.name = testClass.getSimpleName();
        return this;
    }

    public ReportBuilder addSuccessfulTestResult(String testName, double duration) {
        testSuite.addTestCase(new TestCase(testClass, testName, duration));
        testSuite.time += duration;
        return this;
    }

    public TestSuite build() {
        testSuite.tests = testSuite.testcases.size();
        // round the times
        testSuite.time = Math.round(testSuite.time * 100.0) / 100.0;
        for (TestCase testCase : testSuite.testcases) {
            testCase.time = Math.round(testCase.time * 100.0) / 100.0;
        }
        return testSuite;
    }

    /**
     * @param testName
     *            The name of the test method
     * @param duration
     * @param ex
     * @return
     */
    public ReportBuilder addErrorTestResult(String testName, double duration, Exception ex) {
        TestCase testCase = new TestCase(testClass, testName, duration);
        testCase.error = new Error(ex);
        testSuite.addTestCase(testCase);
        testSuite.errors++;
        testSuite.time += duration;
        return this;
    }
}
