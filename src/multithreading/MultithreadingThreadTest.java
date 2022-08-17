package multithreading;

/**
 * Multithreading example with implements Runnable interface
 *
 * @author Jeyhun Gasimov
 * @since 2022-08-17
 */
public class MultithreadingThreadTest {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            MultithreadingThread multithreadingThread = new MultithreadingThread(i);
            multithreadingThread.start();
        }
    }
}
