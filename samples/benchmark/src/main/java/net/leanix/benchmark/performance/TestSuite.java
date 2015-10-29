package net.leanix.benchmark.performance;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "testsuite")
public class TestSuite {

    @XmlAttribute
    String name;
    @XmlAttribute
    int failures = 0;
    @XmlAttribute
    double time = 0;
    @XmlAttribute
    int errors = 0;
    @XmlAttribute
    int skipped = 0;
    @XmlAttribute
    int tests = 0;

    @XmlElement(name = "testcase")
    List<TestCase> testcases = new ArrayList<>();

    public void addTestCase(TestCase testCase) {
        testcases.add(testCase);
        tests++;
    }
}