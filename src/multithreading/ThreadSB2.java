package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 */
public class ThreadSB2 extends Thread {

    private Table t;

    public ThreadSB2(Table t){
        this.t=t;
    }

    @Override
    public void run() {

       t.printTable(this.getName(), 5);
    }
}
