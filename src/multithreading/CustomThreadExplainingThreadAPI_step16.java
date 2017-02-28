package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 * If any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked), calling the interrupt() method on the thread, breaks out the sleeping or waiting state throwing InterruptedException.
 * If the thread is not in the sleeping or waiting state, calling the interrupt() method performs normal behaviour and doesn't interrupt the thread but sets the interrupt flag to true.
 public void interrupt()
 public static boolean interrupted()
 public boolean isInterrupted()
 */
public class CustomThreadExplainingThreadAPI_step16 extends Thread {


    public CustomThreadExplainingThreadAPI_step16(String name) {
        super(name);
    }

    @Override
    public void run() {
        try{
            Thread.sleep(1000);
            System.out.println("task");

        }catch(InterruptedException e){
            throw new RuntimeException("Thread interrupted..."+e);
        }
    }

    public static void main(String[] args) {
        CustomThreadExplainingThreadAPI_step16 thread3 = new CustomThreadExplainingThreadAPI_step16("Thread3");

        thread3.start();
/*
 after interrupting the thread it will stop working.
 */
        try{
            thread3.interrupt();
        }catch(Exception e){
            System.out.println("Exception handled "+e);}

    }

}
