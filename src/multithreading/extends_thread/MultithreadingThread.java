package multithreading.extends_thread;

/**
 * Multithreading example with extends from Thread class
 *
 * @author Jeyhun Gasimov
 * @since 2022-08-17
 */
public class MultithreadingThread extends Thread {
    private final int threadNumber;

    public MultithreadingThread(int threadNumber) {
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
