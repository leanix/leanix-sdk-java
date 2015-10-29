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

        ReportBuilder reportBuilder = new ReportBuilder().withName("FakeTestRwe");
        reportBuilder.addSuccessfulTestResult("testRweSuccess", 22.5);
        reportBuilder.addErrorTestResult("testRweError", 10.7, "java.lang.RuntimeException");

        TestSuite testSuite = reportBuilder.build();

        File file = new File("target/TEST-benchmarkreport.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(testSuite.getClass());
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(testSuite, file);
        System.out.println("output file: " + file.getName());
        jaxbMarshaller.marshal(testSuite, System.out);
    }

    @Test
    public void testThatTakesALittleTime() throws InterruptedException {
        Thread.sleep(2500);
    }
}
