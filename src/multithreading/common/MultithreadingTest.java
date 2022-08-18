package multithreading.common;

public class MultithreadingTest {
    public static void main(String[] args) throws InterruptedException {
        Multithreading multithreading = new Multithreading();
        Thread thread = new Thread(multithreading);

        System.out.println("Thread Id: " + thread.getId());

        System.out.println("Thread state: " + thread.getState());
        thread.start();
        System.out.println("Thread state: " + thread.getState());
        Thread.sleep(3000);
        System.out.println("Thread state: " + thread.getState());

        System.out.println("Thread priority: " + thread.getPriority());
        System.out.println("Thread alive: " + thread.isAlive());
    }
}
