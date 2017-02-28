package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 * If any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked), calling the interrupt() method on the thread, breaks out the sleeping or waiting state throwing InterruptedException.
 * If the thread is not in the sleeping or waiting state, calling the interrupt() method performs normal behaviour and doesn't interrupt the thread but sets the interrupt flag to true.
 public void interrupt()
 public static boolean interrupted()
 public boolean isInterrupted()
 */
public class CustomThreadExplainingThreadAPI_step17 extends Thread {


    public CustomThreadExplainingThreadAPI_step17(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("task");

        } catch (InterruptedException e) {
            System.out.println("Exception handling mechnism , no runtime exception is thrown , " +
                    "so that thread continue to work, after interrupt method call");
        }

        System.out.println("The thread is running..... ");
    }

    public static void main(String[] args) {
        CustomThreadExplainingThreadAPI_step17 thread3 = new CustomThreadExplainingThreadAPI_step17("Thread3");

        thread3.start();
/*
 after interrupting the thread it will not  stop working as the Interrupted exception is caught and handlen in run method.
 */
        thread3.interrupt();


    }
}