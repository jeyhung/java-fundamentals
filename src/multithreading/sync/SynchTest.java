package multithreading.sync;

public class SynchTest {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller caller1 = new Caller("Hello", target);
        Caller caller2 = new Caller("Synchronized", target);
        Caller caller3 = new Caller("World", target);

        caller1.thread.start();
        caller2.thread.start();
        caller3.thread.start();

        try {
            caller1.thread.join();
            caller2.thread.join();
            caller3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
