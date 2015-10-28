import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.util.StopWatch;
import org.springframework.util.StopWatch.TaskInfo;

import net.leanix.benchmark.ConfigurationProvider;

public abstract class BaseBenchmarkTests {

    protected String wsName;
    protected ConfigurationProvider configurationProvider;

    public BaseBenchmarkTests() {
        super();
        wsName = System.getProperty("api.workspaceName");
        if (StringUtils.isBlank(wsName)) {
            wsName = BenchmarkA.class.getSimpleName() + 'x' + RandomStringUtils.random(4, "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        }

        configurationProvider = new ConfigurationProvider();
    }

    protected double getSumOfLastTasksInSeconds(StopWatch stopWatch, int count) {
        List<TaskInfo> tasks = Arrays.asList(stopWatch.getTaskInfo());
        long sum = 0;
        for (int i = 0; i < count; i++) {
            sum += tasks.get(stopWatch.getTaskCount() - i - 1).getTimeMillis();
        }

        return TimeUnit.MILLISECONDS.toSeconds(sum);
    }

}
