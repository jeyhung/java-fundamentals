package multithreading.sync;

public class Caller implements Runnable {
    String message;
    Callme target;
    Thread thread;

    public Caller(String message, Callme target) {
        this.message = message;
        this.target = target;
        thread = new Thread(this);
    }

    @Override
    public void run() {
        target.call(message);
    }

    /**
     * Another way to synchronize
     */
//    @Override
//    public void run() {
//        synchronized (target){
//            target.call(message);
//        }
//    }
}
