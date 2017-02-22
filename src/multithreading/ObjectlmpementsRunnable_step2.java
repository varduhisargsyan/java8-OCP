package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 * for the thread implements Runnable, the ObjectlmpementsRunnable_step2 can use inheritance capability and expends the other class at the same time
 * to ensure the custom logic to be executed in this class ,
 * run() must be overridden and the logic placed in run method
 */
public class ObjectlmpementsRunnable_step2 implements Runnable {

    @Override
    public void run() {
        //logic of the thread goes here
        // by calling start method  the run method's body is executed
    }

    public static void main(String[] args) {
        ObjectlmpementsRunnable_step2 runnable = new ObjectlmpementsRunnable_step2();

        Thread thread = new Thread(runnable);

        //Calling the empty constructor thread
        Thread thread1 = new Thread();


        //Calling the constructor Runnambe, threadName
        Thread thread2 = new Thread(runnable, "MyThread");

    }
}
