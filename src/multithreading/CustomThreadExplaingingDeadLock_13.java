package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 * Deadlock can occur in a situation when a thread is waiting for an object lock, that is acquired by another thread
 * and second thread is waiting for an object lock that is acquired by first thread.
 * Since, both threads are waiting for each other to release the lock, the condition is called deadlock.
 *
 *
 */
public class CustomThreadExplaingingDeadLock_13 {

    public static void main(String[] args) {

        final String resource1 = "Hello";
        final String resource2 = "Gyumri";
        // t1 tries to lock resource1 then resource2
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };


        t1.start();
        t2.start();
    }
}
