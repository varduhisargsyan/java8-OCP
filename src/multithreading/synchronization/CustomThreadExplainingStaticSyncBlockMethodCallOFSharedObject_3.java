package multithreading.synchronization;

import multithreading.synchronization.Table;

/**
 * Created by varduhis on 2/22/2017.
 */
public class CustomThreadExplainingStaticSyncBlockMethodCallOFSharedObject_3 extends  Thread{

    private Table t;

    public CustomThreadExplainingStaticSyncBlockMethodCallOFSharedObject_3(Table t){
        this.t=t;
    }


    @Override
    public void run() {

        Table.staticSyncronizedBlockPrintTable(this.getName(), 100);
    }

}
