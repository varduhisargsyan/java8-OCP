package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 */
public class ThreadStaticSB1 extends  Thread{

    private Table t;

    public ThreadStaticSB1(Table t){
        this.t=t;
    }


    @Override
    public void run() {

        t.syncronizedBlockPrintTable(this.getName(), 100);
    }

}
