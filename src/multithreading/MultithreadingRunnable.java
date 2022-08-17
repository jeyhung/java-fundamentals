package multithreading;

/**
 * Multithreading example with implements Runnable interface
 *
 * @author Jeyhun Gasimov
 * @since 2022-08-17
 */
public class MultithreadingRunnable implements Runnable {
    private final int threadNumber;

    public MultithreadingRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {

        if (threadNumber == 2) {
            throw new RuntimeException("Thread 2 died!");
        }

        try {
            for (int i = 0; i < 3; i++) {
                System.out.printf("Thread %d: %d\n", threadNumber, i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
