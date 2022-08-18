package multithreading.sync;

public class Callme {
    /**
     * Note from "The Complete Reference 11th Edition": Any time that you have a method, or group of methods,
     * that manipulates the internal state of an object in a multithreaded situation, you should use the
     * synchronized keyword to guard the state from race conditions. Remember, once a thread enters any
     * synchronized method on an instance, no other thread can enter any other synchronized method
     * on the same instance. However, non-synchronized methods on that instance will continue to be callable."
     * @param message
     */
    synchronized void call(String message) {
        System.out.print("[" + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted");
        }
        System.out.println("]");
    }
}
