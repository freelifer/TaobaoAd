package freelifer.sdk.taobaoad.internal.request;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author kzhu on 2017/11/19.
 */
public class ThreadPool {

    public ThreadPool() {
        ExecutorService poolExecutor = new ThreadPoolExecutor(3, 5,
                1, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(128));
    }
}
