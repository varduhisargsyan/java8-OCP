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
        CustomThreadExplainingThreadAPI_step7 thread1 = new CustomThreadExplainingThreadAPI_step7("CustomThreadExplainingUnsyncMethodCallOFSharedObject_1");
        CustomThreadExplainingThreadAPI_step7 thread2 = new CustomThreadExplainingThreadAPI_step7("CustomThreadExplainingUnsyncMethodCallOFSharedObject_2");
        CustomThreadExplainingThreadAPI_step7 thread3 = new CustomThreadExplainingThreadAPI_step7("Thread3");

        thread1.start();

/**
 * The join() method waits for a thread to die.
 * In other words, it causes the currently running threads to stop executing until the thread it joins with completes it's task.
 t1 completes its task then t2 and t3 starts executing.
 * The  join(milliseconds) method waits for a thread to given time then start executing another thread

 */
        try {

            thread1.join();

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        thread2.start();
        thread3.start();
System.out.println("============================= PRIORITY ===============================");

/*
Each thread have a priority. Priorities are represented by a number between 1 and 10.
 In most cases, thread schedular schedules the threads according to their priority (known as preemptive scheduling).
 But it is not guaranteed because it depends on JVM specification that which scheduling it chooses.
*Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10.

 */
        thread1 = new CustomThreadExplainingThreadAPI_step7("thread1");
        thread2 = new CustomThreadExplainingThreadAPI_step7("thread2");
        thread3 = new CustomThreadExplainingThreadAPI_step7("thread3");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread3.setPriority(Thread.NORM_PRIORITY);


        thread1.start();
        thread2.start();
        thread3.start();
    }
}
