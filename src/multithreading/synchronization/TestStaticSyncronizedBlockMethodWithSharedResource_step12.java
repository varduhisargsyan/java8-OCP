package multithreading.synchronization;

import multithreading.synchronization.CustomThreadExplainingStaticSyncBlockMethodCallOFSharedObject_1;
import multithreading.synchronization.CustomThreadExplainingStaticSyncBlockMethodCallOFSharedObject_2;
import multithreading.synchronization.CustomThreadExplainingStaticSyncBlockMethodCallOFSharedObject_3;
import multithreading.synchronization.Table;

/**
 * Created by varduhis on 2/22/2017.
 */
public class TestStaticSyncronizedBlockMethodWithSharedResource_step12 {
    public static void main(String[] args) {
        Table table=new Table();
        CustomThreadExplainingStaticSyncBlockMethodCallOFSharedObject_1 t1=new CustomThreadExplainingStaticSyncBlockMethodCallOFSharedObject_1(table);
        CustomThreadExplainingStaticSyncBlockMethodCallOFSharedObject_2 t2=new CustomThreadExplainingStaticSyncBlockMethodCallOFSharedObject_2(table);
        CustomThreadExplainingStaticSyncBlockMethodCallOFSharedObject_3 t3=new CustomThreadExplainingStaticSyncBlockMethodCallOFSharedObject_3(table);

        t1.start();
        t2.start();
        t3.start();

    }
}
