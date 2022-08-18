package multithreading.runnable;

/**
 * Multithreading example with implements Runnable interface
 *
 * @author Jeyhun Gasimov
 * @since 2022-08-17
 */
public class MultithreadingRunnableTest {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            MultithreadingRunnable multithreadingRunnable = new MultithreadingRunnable(i);
            Thread thread = new Thread(multithreadingRunnable);
            thread.start();
        }
    }
}
