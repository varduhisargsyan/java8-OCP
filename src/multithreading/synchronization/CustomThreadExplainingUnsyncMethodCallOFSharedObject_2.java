package multithreading.synchronization;

import multithreading.synchronization.Table;

/**
 * Created by varduhis on 2/22/2017.
 */
public class CustomThreadExplainingUnsyncMethodCallOFSharedObject_2 extends Thread {

    private Table t;

    public CustomThreadExplainingUnsyncMethodCallOFSharedObject_2(Table t){
        this.t=t;
    }

    @Override
    public void run() {

       t.printTable(this.getName(), 5);
    }
}
