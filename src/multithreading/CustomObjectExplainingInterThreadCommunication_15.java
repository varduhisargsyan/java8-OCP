package multithreading;

/**
 * Created by varduhis on 2/23/2017.
 *  * Inter-thread communication or Co-operation is all about allowing synchronized threads to communicate with each other.
 Cooperation (Inter-thread communication) is a mechanism in which a thread is paused running in its critical section and
 another thread is allowed to enter (or lock) in the same critical section to be executed.It is implemented by following methods of Object class:

 wait()
 notify()
 notifyAll()
 */
public class CustomObjectExplainingInterThreadCommunication_15 {

    int amount=10000;

/*
Threads enter to acquire lock.
Lock is acquired by on thread.
Now thread goes to waiting state if you call wait() method on the object. Otherwise it releases the lock and exits.
 */
    synchronized void withdraw(int amount){
        System.out.println("going to withdraw...");

        if(this.amount<amount){
            System.out.println("Less balance; waiting for deposit...");
            try{
                wait();
            }catch(Exception e){}
        }
        this.amount-=amount;
        System.out.println("withdraw completed...");
    }
/*
If you call notify() or notifyAll() method, thread moves to the notified state (runnable state).
Now thread is available to acquire lock.
After completion of the task, thread releases the lock and exits the monitor state of the object.
 */
    synchronized void deposit(int amount){
        System.out.println("going to deposit...");
        this.amount+=amount;
        System.out.println("deposit completed... ");

        notify();
    }

    public static void main(String[] args) {



        final CustomObjectExplainingInterThreadCommunication_15 c=new CustomObjectExplainingInterThreadCommunication_15();

        new Thread(){
            public void run(){
                c.withdraw(15000);
            }
        }.start();

        new Thread(){
            public void run(){
                c.deposit(10000);
            }
        }.start();
    }
}
