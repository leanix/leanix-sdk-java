import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;
import org.springframework.util.StopWatch;
import org.springframework.util.StopWatch.TaskInfo;

import net.leanix.api.common.ApiException;
import net.leanix.benchmark.ConfigurationProvider;
import net.leanix.benchmark.WorkspaceHelper;
import net.leanix.benchmark.performance.ReportBuilder;
import net.leanix.benchmark.performance.TestSuite;

public abstract class BaseBenchmarkTests {

    private static final Logger LOG = LoggerFactory.getLogger(BaseBenchmarkTests.class);

    private static final String API_WORKSPACE_NAME = "api.workspaceName";
    private static final String KEEP_WORKSPACE = "keepWorkspace";

    protected String wsName;

    protected String apiKey;

    protected ConfigurationProvider configurationProvider;

    public abstract void runBenchmarkOnWorkspace(StopWatch stopWatch) throws JAXBException;

    protected void run(StopWatch stopWatch)
            throws ApiException, net.leanix.api.common.ApiException, JAXBException, InterruptedException,
            net.leanix.dropkit.apiclient.ApiException {

        SimpleDateFormat format = new SimpleDateFormat("yyyy'A'MM'A'dd'T'HH'A'mm'A'ss");
        wsName = BenchmarkA.class.getSimpleName() + format.format(new Date());

        // ensure workspace is present
        stopWatch.start("Initialize new workspace");
        apiKey = new WorkspaceHelper(wsName).initialize();
        stopWatch.stop();

        // run the concreate tests on new / existing WS
        runBenchmarkOnWorkspace(stopWatch);

        // Wait a little bit to give jobs time to end
        Thread.sleep(10000);
        if ("y".equals(System.getProperty(KEEP_WORKSPACE, "y").toLowerCase().substring(1)))
            ;
        new WorkspaceHelper(wsName).deleteWorkspace();
    }

    public BaseBenchmarkTests() {
        super();

        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();

        wsName = System.getProperty(API_WORKSPACE_NAME);

        configurationProvider = new ConfigurationProvider();
    }

    protected double getSumOfLastTasksInSeconds(StopWatch stopWatch, int count) {
        long sum = 0;
        for (TaskInfo taskInfo : getLastTasks(stopWatch, count)) {
            sum += taskInfo.getTimeMillis();
        }

        return sum / 1000.0;
    }

    protected List<TaskInfo> getLastTasks(StopWatch stopWatch, int count) {
        List<TaskInfo> tasks = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            tasks.add(stopWatch.getTaskInfo()[stopWatch.getTaskCount() - i - 1]);
        }
        return tasks;
    }

    protected void writeBenchmarkJUnitResultFile(Class<? extends BaseBenchmarkTests> benchmarkClass, TestSuite testSuite)
            throws JAXBException {
        File file = new File(String.format("target/TEST-BENCHMARK_%s.xml", benchmarkClass.getSimpleName()));

        JAXBContext jaxbContext = JAXBContext.newInstance(testSuite.getClass());
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        LOG.info("Writing benchmark results into file {}.", file.getAbsolutePath());
        jaxbMarshaller.marshal(testSuite, file);
        // System.out.println("output file: " + file.getName());
        // jaxbMarshaller.marshal(testSuite, System.out);

    }

    protected TestSuite createTestSuiteObjectBasedOnTaskInfo(Class<? extends BaseBenchmarkTests> benchmarkClass,
            List<TaskInfo> taskInfos) {
        ReportBuilder reportBuilder = new ReportBuilder().forTestClass(benchmarkClass);

        for (TaskInfo taskInfo : taskInfos) {
            reportBuilder.addSuccessfulTestResult(taskInfo.getTaskName(), taskInfo.getTimeSeconds());
        }

        return reportBuilder.build();
    }
}
