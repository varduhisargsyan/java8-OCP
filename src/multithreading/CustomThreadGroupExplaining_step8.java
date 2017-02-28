package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 *
 * Java provides a convenient way to group multiple threads in a single object.
 * In such way, we can suspend, resume or interrupt group of threads by a single method call.
 * Note: Now suspend(), resume() and stop() methods are deprecated.
 */
public class CustomThreadGroupExplaining_step8 implements Runnable{


    @Override
    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("Thread is in running state : " +  i);
                Thread.sleep(10);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {


        ThreadGroup tg=new ThreadGroup("Group1");
/*
 all 3 threads belong to one group.

 */
        Thread thread1=new Thread(tg, new CustomThreadGroupExplaining_step8(), "CustomThreadExplainingUnsyncMethodCallOFSharedObject_1");
        Thread thread2=new Thread(tg, new CustomThreadGroupExplaining_step8(), "CustomThreadExplainingUnsyncMethodCallOFSharedObject_2");
        Thread thread3=new Thread(tg, new CustomThreadGroupExplaining_step8(),"Thread3");

        thread1.start();
        thread2.start();
        thread3.start();


        System.out.println("Tread group name "+ tg.getName());
        tg.list();
/*
    Now we can interrupt all threads by a single line of code only.
 */
        Thread.currentThread().getThreadGroup().interrupt();
    }
}
