package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 */
public class CustomThreadExplainingThreadAPI_step4 extends Thread {


    /**
     * Step 1. The Thread class provides two methods for sleeping a thread:
     * public static void sleep(long miliseconds)throws InterruptedException
     * public static void sleep(long miliseconds, int nanos)throws InterruptedException
     */
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
        CustomThreadExplainingThreadAPI_step4 thread1 = new CustomThreadExplainingThreadAPI_step4();
        CustomThreadExplainingThreadAPI_step4 thread2 = new CustomThreadExplainingThreadAPI_step4();
        thread1.start();
        thread2.start();

    }
}
