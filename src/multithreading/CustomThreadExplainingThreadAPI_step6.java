package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 */
public class CustomThreadExplainingThreadAPI_step6 extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("Thread is in running state : " + this.getName() + " " + i);
                Thread.sleep(10);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void main(String[] args) {
        /*
         to print the  thread name of the main method thread (thread name is main),
         and to ensure that the second thread will be executed ath the same thread as main
         */
        System.out.print(Thread.currentThread().getName());
        CustomThreadExplainingThreadAPI_step6 thread1 = new CustomThreadExplainingThreadAPI_step6();
       /*
       *but does not start a separate call stack
        */
        thread1.run();

    }
}
