package net.leanix.benchmark.performance;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class TestCase {

    @XmlAttribute
    double time;

    @XmlAttribute
    String classname;

    @XmlAttribute
    String name;

    @XmlElement
    Error error;

    public TestCase(double duration, String testName, String testSuiteName) {
        time = duration;
        classname = testSuiteName;
        name = testName;
    }

}
