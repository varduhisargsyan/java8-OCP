package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 *
 *
 */
public class CustomThreadExplainingThreadAPI_step5 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("Thread is in running state : "+ this.getName()+ " "+ i);
                Thread.sleep(10);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        CustomThreadExplainingThreadAPI_step5 thread=new CustomThreadExplainingThreadAPI_step5();
        thread.start();

        /**
         * After starting a thread, it can never be started again. If you does so,
         * an IllegalThreadStateException is thrown. In such case, thread will run once but for second time, it will throw exception.
         */


        thread.start();
    }
}
