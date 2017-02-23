package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 * If any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked), calling the interrupt() method on the thread, breaks out the sleeping or waiting state throwing InterruptedException.
 * If the thread is not in the sleeping or waiting state, calling the interrupt() method performs normal behaviour and doesn't interrupt the thread but sets the interrupt flag to true.
 public void interrupt()
 public static boolean interrupted()
 public boolean isInterrupted()
 */
public class CustomThreadExplainingThreadAPI_step19 extends Thread {


    public CustomThreadExplainingThreadAPI_step19(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("task");


    }

    public static void main(String[] args) {
        CustomThreadExplainingThreadAPI_step19 thread3 = new CustomThreadExplainingThreadAPI_step19("Thread3");

        thread3.start();
/*
 if thread is not in sleeping or waiting state, calling the interrupt() method sets the interrupted flag to true
 that can be used to stop the thread by the java programmer later..
 */

        thread3.interrupt();

    }
}