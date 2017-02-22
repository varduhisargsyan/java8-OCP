package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 * This class represents thread states
 */

public class CustomThreadExplainingThreadStates_step3 extends Thread {


    @Override
    public void run() {
        super.run();
    }

    public static void main(String[] args) throws InterruptedException{
/*
1) New
The thread is in new state if you create an instance of Thread class
 */
        CustomThreadExplainingThreadStates_step3 thread = new CustomThreadExplainingThreadStates_step3();
/*
 2) Runnable
The thread is in runnable state after invocation of start() method, but the thread scheduler has not selected it to be the running thread.
 3) Running
The thread is in running state if the thread scheduler has selected it.
*/
        thread.start();

/*
4) Non-Runnable (Blocked)
This is the state when the thread is still alive, but is currently not eligible to run.
*/
Thread.sleep(20);

/*

After  20 miliseconds thread will become runnable, and thes can be selected by thread scheduler to enter to running state.
5) Terminated
 A thread is in terminated or dead state when its run() method exits.
  */

    }
}
