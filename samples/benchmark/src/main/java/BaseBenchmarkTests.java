import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.bridge.SLF4JBridgeHandler;
import org.springframework.util.StopWatch;
import org.springframework.util.StopWatch.TaskInfo;

import net.leanix.benchmark.ConfigurationProvider;
import net.leanix.benchmark.performance.ReportBuilder;
import net.leanix.benchmark.performance.TestSuite;

public abstract class BaseBenchmarkTests {

    protected String wsName;
    protected ConfigurationProvider configurationProvider;

    public BaseBenchmarkTests() {
        super();

        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();

        wsName = System.getProperty("api.workspaceName");
        if (StringUtils.isBlank(wsName)) {
            wsName = BenchmarkA.class.getSimpleName() + 'x' + RandomStringUtils.random(4, "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        }

        configurationProvider = new ConfigurationProvider();
    }

    protected double getSumOfLastTasksInSeconds(StopWatch stopWatch, int count) {
        long sum = 0;
        for (TaskInfo taskInfo : getLastTasks(stopWatch, count)) {
            sum += taskInfo.getTimeMillis();
        }

        return TimeUnit.MILLISECONDS.toSeconds(sum);
    }

    protected List<TaskInfo> getLastTasks(StopWatch stopWatch, int count) {
        List<TaskInfo> tasks = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            tasks.add(stopWatch.getTaskInfo()[stopWatch.getTaskCount() - i - 1]);
        }
        return tasks;
    }

    protected void writeBenchmarkJUnitResultFile(Class<? extends BaseBenchmarkTests> benchmarkClass, List<TaskInfo> taskInfos)
            throws JAXBException {
        File file = new File(String.format("target/TEST-BENCHMARK_%s.xml", benchmarkClass.getSimpleName()));
        ReportBuilder reportBuilder = new ReportBuilder().withName(benchmarkClass.getSimpleName());

        for (TaskInfo time : taskInfos) {
            reportBuilder.addSuccessfulTestResult(time.getTaskName(), time.getTimeSeconds());
        }

        TestSuite testSuite = reportBuilder.build();

        JAXBContext jaxbContext = JAXBContext.newInstance(testSuite.getClass());
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(testSuite, file);
        // System.out.println("output file: " + file.getName());
        // jaxbMarshaller.marshal(testSuite, System.out);

    }
}
