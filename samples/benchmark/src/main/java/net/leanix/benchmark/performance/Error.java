package net.leanix.benchmark.performance;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Error {

    @XmlAttribute
    String type;

    @XmlAttribute
    String message;

    @XmlValue
    String content = "unspecified error description";

    public Error(Exception ex) {
        type = ex.getClass().getName();
        message = ex.getMessage();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ex.printStackTrace(new PrintWriter(outputStream, true));
        try {
            outputStream.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        content = outputStream.toString();
    }

}
