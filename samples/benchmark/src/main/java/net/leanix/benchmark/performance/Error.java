package net.leanix.benchmark.performance;

import javax.xml.bind.annotation.XmlAttribute;

public class Error {

    @XmlAttribute
    String type;

    public Error(String errorType) {
        type = errorType;
    }

}
