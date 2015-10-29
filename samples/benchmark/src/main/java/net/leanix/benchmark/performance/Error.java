package net.leanix.benchmark.performance;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Error {

    @XmlAttribute
    String type;

    @XmlValue
    String content = "unspecified error description";

    public Error(String errorType) {
        type = errorType;
    }

}
