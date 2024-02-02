package singletone.threadsafe;

/**
 * several client application will check if the instance is null
 * thread safe instantiation will prevent several client application to instantiate
 *
 * @author Mallika Dey
 */
public class ThreadSafeSingletone {
    private static ThreadSafeSingletone threadSafeSingletone = null;

    private ThreadSafeSingletone() {
    }

    /**
     * overhead of synchronization is high, reduces performance
     * if already instantiation happen doesn't need to run the synchronized method
     * Double locking for reducing overhead
     */
    public static ThreadSafeSingletone getThreadSafeSingletone() {
        if (threadSafeSingletone == null) {
            synchronized (ThreadSafeSingletone.class) {
                if (threadSafeSingletone == null) {
                    threadSafeSingletone = new ThreadSafeSingletone();
                }
            }
        }
        return threadSafeSingletone;
    }
}
