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

    /*
    The isInterrupted() method returns the interrupted flag either true or false.
     The static interrupted() method returns the interrupted flag after that it sets the flag to false if it is true.
     */
    @Override
    public void run() {

        for(int i=1;i<=2;i++){
            System.out.println("IsInterupted  "+ Thread.currentThread().getName()+ " "+ Thread.currentThread().isInterrupted());
            if(Thread.interrupted()){
                System.out.println("Now isInterrupted set to : "+ Thread.currentThread().getName()+ " "+ Thread.currentThread().isInterrupted());

                System.out.println("code for interrupted thread  "+ Thread.currentThread().getName());
            }
            else{
                System.out.println("code for normal thread  "+ Thread.currentThread().getName());
            }

        }


    }

    public static void main(String[] args) {
        CustomThreadExplainingThreadAPI_step19 thread2 = new CustomThreadExplainingThreadAPI_step19("Thread2");
        CustomThreadExplainingThreadAPI_step19 thread3 = new CustomThreadExplainingThreadAPI_step19("Thread3");


        thread2.start();
        /*]
        after calling interrupth the interuppted flag is set to true for this thread
         */
        thread2.interrupt();

        thread3.start();




    }
}