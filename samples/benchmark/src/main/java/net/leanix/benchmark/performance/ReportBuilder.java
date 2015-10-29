package net.leanix.benchmark.performance;

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
