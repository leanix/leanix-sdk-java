package net.leanix.benchmark.performance;

public class ReportBuilder {

    private final TestSuite testSuite = new TestSuite();

    public ReportBuilder withName(String name) {
        testSuite.name = name;
        return this;
    }

    public ReportBuilder addSuccessfulTestResult(String testName, double duration) {
        testSuite.testcases.add(new TestCase(duration, testName, testSuite.name));
        testSuite.tests++;
        testSuite.time += duration;
        return this;
    }

    public TestSuite build() {

        return testSuite;
    }

    public ReportBuilder addErrorTestResult(String testName, double duration, String errorType) {
        TestCase testCase = new TestCase(duration, testName, testSuite.name);
        testCase.error = new Error(errorType);
        testSuite.testcases.add(testCase);
        testSuite.tests++;
        testSuite.time += duration;
        return this;
    }
}
