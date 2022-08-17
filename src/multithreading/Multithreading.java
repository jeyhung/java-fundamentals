package multithreading;

public class Multithreading implements Runnable {
    @Override
    public void run() {
        for (int i = 0;i<3;i++) {
            System.out.println("i: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
