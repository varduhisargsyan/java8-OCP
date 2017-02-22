package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 */
public class ThreadSB1 extends  Thread{

    private Table t;

    public ThreadSB1(Table t){
        this.t=t;
    }


    @Override
    public void run() {

        t.syncronizedPrintTable(this.getName(), 100);
    }

}
