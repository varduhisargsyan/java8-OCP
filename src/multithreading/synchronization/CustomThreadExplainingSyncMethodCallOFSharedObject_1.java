package multithreading.synchronization;

import multithreading.synchronization.Table;

/**
 * Created by varduhis on 2/22/2017.
 */
public class CustomThreadExplainingSyncMethodCallOFSharedObject_1 extends  Thread{

    private Table t;

    public CustomThreadExplainingSyncMethodCallOFSharedObject_1(Table t){
        this.t=t;
    }


    @Override
    public void run() {

        t.syncronizedPrintTable(this.getName(), 100);
    }

}
