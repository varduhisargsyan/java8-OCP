package multithreading.synchronization;

import multithreading.synchronization.CustomThreadExplainingSyncBlockMethodCallOFSharedObject_1;
import multithreading.synchronization.CustomThreadExplainingSyncBlockMethodCallOFSharedObject_2;
import multithreading.synchronization.Table;

/**
 * Created by varduhis on 2/22/2017.
 */
public class TestSyncronizedBlockMethodWithSharedResource_step11 {
    public static void main(String[] args) {
        Table table=new Table();
        CustomThreadExplainingSyncBlockMethodCallOFSharedObject_1 t1=new CustomThreadExplainingSyncBlockMethodCallOFSharedObject_1(table);
        CustomThreadExplainingSyncBlockMethodCallOFSharedObject_2 t2=new CustomThreadExplainingSyncBlockMethodCallOFSharedObject_2(table);
        t1.start();
        t2.start();

    }
}
