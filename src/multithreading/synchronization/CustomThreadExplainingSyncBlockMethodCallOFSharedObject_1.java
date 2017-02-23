package multithreading.synchronization;

import multithreading.synchronization.Table;

/**
 * Created by varduhis on 2/22/2017.
 */
public class CustomThreadExplainingSyncBlockMethodCallOFSharedObject_1 extends  Thread{

    private Table t;

    public CustomThreadExplainingSyncBlockMethodCallOFSharedObject_1(Table t){
        this.t=t;
    }


    @Override
    public void run() {

        t.syncronizedBlockPrintTable(this.getName(), 100);
    }

}
