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

        ReportBuilder reportBuilder = new ReportBuilder().forTestClass(getClass());
        reportBuilder.addSuccessfulTestResult("testRweSuccess", 22.6666666666);
        reportBuilder.addErrorTestResult("testRweError", 10.7, new java.lang.RuntimeException("message"));

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
    public void testJaxb_onlyFail() throws JAXBException {

        try {
            @SuppressWarnings("unused")
            int i = 5 / 0;
        } catch (Exception e) {
            ReportBuilder reportBuilder = new ReportBuilder().forTestClass(getClass());
            reportBuilder.addErrorTestResult("testJaxb_onlyFail", 1.0, e);

            TestSuite testSuite = reportBuilder.build();

            File file = new File("target/TEST-benchmarkreport_2.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(testSuite.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(testSuite, file);
            System.out.println("output file: " + file.getName());
            jaxbMarshaller.marshal(testSuite, System.out);
        }
    }

    @Test
    public void testThatTakesALittleTime() throws InterruptedException {
        Thread.sleep(2500);
    }
}
