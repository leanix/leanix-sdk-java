package net.leanix.api.sample.asyc;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractAsyncClient<MODEL extends Serializable> {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractAsyncClient.class);

    protected final ListeningExecutorService service;
    protected boolean doFirstCallSync = true;
    final List<ListenableFuture<MODEL>> listenableFutures = new ArrayList<>();

    public AbstractAsyncClient(ListeningExecutorService service) {
        super();
        this.service = service;
    }

    public List<ListenableFuture<MODEL>> getListenableFutures() {
        return listenableFutures;
    }

    protected ListenableFuture<MODEL> addFuture(ListenableFuture<MODEL> future) {
        // workaround to avoid: integrity constraint violation: 1062 Duplicate entry 'Manufacturer-1000089' for key 'unique_name'.
        // The SQL
        // statement executed was: INSERT INTO `tag` ...
        // The first call against leanix should be a single synchronous call.
        if (doFirstCallSync && listenableFutures.size() == 0) {
            // make first call synchronous
            waitUntilFutureIsDone(future, null);
        }

        listenableFutures.add(future);
        return future;
    }

    public void endTransmittion() {
        waitUntilAllRequestsAreFinished();
        listenableFutures.clear();
    }

    void waitUntilAllRequestsAreFinished() {
        // Call on each Future.get() to be sure this method will return only when all requests against pathfinder are processed
        try {
            Futures.successfulAsList(listenableFutures).get();
        } catch (InterruptedException | ExecutionException e) {
            LOG.error("internal error", e);
        }
    }

    public static <V> V waitUntilFutureIsDone(ListenableFuture<V> future, String errorMsg) {
        try {
            return Futures.getUnchecked(future);
        } catch (UncheckedExecutionException e) {
            LOG.error(errorMsg != null ? errorMsg : "Error during execution of asynchronous call.", e.getCause());
            return null;
        }
    }

}
