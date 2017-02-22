package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 */
public class CustomThreadExplainingThreadAPI_step7 extends Thread {


    public CustomThreadExplainingThreadAPI_step7(String name) {
        super(name);
    }

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
        CustomThreadExplainingThreadAPI_step7 thread1 = new CustomThreadExplainingThreadAPI_step7("Thread1");
        CustomThreadExplainingThreadAPI_step7 thread2 = new CustomThreadExplainingThreadAPI_step7("Thread2");
        CustomThreadExplainingThreadAPI_step7 thread3 = new CustomThreadExplainingThreadAPI_step7("Thread3");

        thread1.start();

/**
 * The join() method waits for a thread to die.
 * In other words, it causes the currently running threads to stop executing until the thread it joins with completes it's task.
 */
        try {

            thread1.join();

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        thread2.start();
        thread3.start();
    }
}
