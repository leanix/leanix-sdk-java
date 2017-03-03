package net.leanix.api.sample.parallel;

import com.google.common.util.concurrent.ListeningExecutorService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import net.leanix.api.common.ApiClient;
import net.leanix.api.sample.asyc.AsyncGraphqlApiClient;
import net.leanix.api.sample.parallel.config.ArgumentOptions;
import net.leanix.api.sample.util.StopWatch;

public abstract class AbstractRunner {

    final ArgumentOptions argumentOptions;
    final StopWatch stopWatch;
    final AsyncGraphqlApiClient graphQLApiClient;

    final AtomicInteger success = new AtomicInteger();
    final AtomicInteger failures = new AtomicInteger();


    public AbstractRunner(ArgumentOptions argumentOptions, ApiClient apiClient, ListeningExecutorService executorService,
        StopWatch stopWatch) {
        super();
        this.argumentOptions = argumentOptions;
        this.stopWatch = stopWatch;
        this.graphQLApiClient = new AsyncGraphqlApiClient(apiClient, executorService);
    }

    abstract public void run() throws InterruptedException, ExecutionException;

    public int getSumFactSheetsCreated() {
        return argumentOptions.factSheetCount;
    }

    public void showSummary() {
        if (stopWatch.isRunning()) {
            stopWatch.stop();
        }

        // show summary of job
        System.out.println(argumentOptions.toString());
        System.out.println(stopWatch.prettyPrint());

        double throughput = (double) getSumFactSheetsCreated() / stopWatch.getTotalTimeSeconds();
        System.out.println(String.format("Sum of FactSheets:   %d", getSumFactSheetsCreated()));
        System.out.println(String.format("Successful requests: %d, Failed requests: %d", success.get(), failures.get()));
        System.out.println(String.format("Throughput: %f FactSheets / second", throughput));
        System.out.println(String.format("Throughput: %f FactSheets / minute", throughput * 60));
    }

    public String createAppName(int level, String suffix, int number) {

        String shortSuffix = Integer.toHexString(suffix.hashCode());
        String fsName = String.format("App L%d-%d (%s)", level, number, shortSuffix);
        return fsName;
    }


}
