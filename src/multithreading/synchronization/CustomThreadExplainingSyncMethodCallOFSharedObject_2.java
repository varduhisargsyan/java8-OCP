package multithreading.synchronization;

import multithreading.synchronization.Table;

/**
 * Created by varduhis on 2/22/2017.
 */
public class CustomThreadExplainingSyncMethodCallOFSharedObject_2 extends Thread {

    private Table t;

    public CustomThreadExplainingSyncMethodCallOFSharedObject_2(Table t){
        this.t=t;
    }

    @Override
    public void run() {

        t.syncronizedPrintTable(this.getName(), 5);
    }
}
