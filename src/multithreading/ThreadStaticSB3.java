package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 */
public class ThreadStaticSB3 extends  Thread{

    private Table t;

    public ThreadStaticSB3(Table t){
        this.t=t;
    }


    @Override
    public void run() {

        t.staticSyncronizedBlockPrintTable(this.getName(), 1);
    }

}
