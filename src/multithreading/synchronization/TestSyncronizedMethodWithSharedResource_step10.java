package multithreading.synchronization;

import multithreading.synchronization.CustomThreadExplainingSyncMethodCallOFSharedObject_1;
import multithreading.synchronization.CustomThreadExplainingSyncMethodCallOFSharedObject_2;
import multithreading.synchronization.Table;

/**
 * Created by varduhis on 2/22/2017.
 */
public class TestSyncronizedMethodWithSharedResource_step10 {
    public static void main(String[] args) {
        Table table=new Table();
        CustomThreadExplainingSyncMethodCallOFSharedObject_1 t1=new CustomThreadExplainingSyncMethodCallOFSharedObject_1(table);
        CustomThreadExplainingSyncMethodCallOFSharedObject_2 t2=new CustomThreadExplainingSyncMethodCallOFSharedObject_2(table);
        t1.start();
        t2.start();

    }
}
