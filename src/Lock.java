import java.util.List;
import java.util.concurrent.TimeoutException;

public interface Lock {

    /**
     * 1. this method is always block until get the lock
     * 2. this method can be interrupted
     * @throws InterruptedException
     */
    void lock() throws InterruptedException;

    /**
     * 1. this method will block for times that @param times set,
     * then it will notify.
     * 2. this method can be interrupted
     * @param times wait times
     * @throws InterruptedException
     * @throws TimeoutException
     */
    void lock(long times) throws InterruptedException, TimeoutException;

    /**
     * release the lock
     */
    void unlock();

    /**
     * get the block Thread
     */
    List<Thread> getBlockedThreads();
}
