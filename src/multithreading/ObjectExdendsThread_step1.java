package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 *
 * for the thread extends Thread, the object cant extends the other object
 * to ensure the custom logic to be executed in this class ,
 * parrent's run() must be overridden and the logic placed in run method
 */
public class ObjectExdendsThread_step1 extends  Thread {



    @Override
    public void run() {
       //logic of the thread goes here
        // by calling start method  the run method's body is executed
    }

    public static void main(String[] args) {
        ObjectExdendsThread_step1 threadExdendsThread=new ObjectExdendsThread_step1();


        threadExdendsThread.start();
    }
}
