package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 */
public class TestSyncronizedBlockMethodWithSharedResource_step11 {
    public static void main(String[] args) {
        Table table=new Table();
        ThreadS1 t1=new ThreadS1(table);
        ThreadS2 t2=new ThreadS2(table);
        t1.start();
        t2.start();

    }
}
