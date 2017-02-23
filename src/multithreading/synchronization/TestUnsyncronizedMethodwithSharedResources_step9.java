package multithreading.synchronization;

import multithreading.synchronization.CustomThreadExplainingUnsyncMethodCallOFSharedObject_1;
import multithreading.synchronization.CustomThreadExplainingUnsyncMethodCallOFSharedObject_2;
import multithreading.synchronization.Table;

/**
 * Created by varduhis on 2/22/2017.
 */
public class TestUnsyncronizedMethodwithSharedResources_step9 {

    public static void main(String[] args) {
        //the same object is used by two different threads
        Table table=new Table();

        CustomThreadExplainingUnsyncMethodCallOFSharedObject_2 t2=new CustomThreadExplainingUnsyncMethodCallOFSharedObject_2(table);
        CustomThreadExplainingUnsyncMethodCallOFSharedObject_1 t1=new CustomThreadExplainingUnsyncMethodCallOFSharedObject_1(table);

        t1.start();
        t2.start();
    }
}
