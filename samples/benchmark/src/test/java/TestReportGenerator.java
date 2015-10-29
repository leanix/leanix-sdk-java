import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Test;

import net.leanix.benchmark.performance.ReportBuilder;
import net.leanix.benchmark.performance.TestSuite;

public class TestReportGenerator {

    @Test
    public void testJaxb() throws JAXBException {

        ReportBuilder reportBuilder = new ReportBuilder();
        reportBuilder.withName("FakeTest-rwe");
        reportBuilder.addSuccessfulTestResult("testRwe", 22.5);
        reportBuilder.addErrorTestResult("testRwe", 22.5, "java.lang.RuntimeException");
        
        TestSuite testSuite = reportBuilder.build();

        File file = new File("target/TEST-benchmarkreport.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(testSuite.getClass());
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(testSuite, file);
        jaxbMarshaller.marshal(testSuite, System.out);
    }
}
