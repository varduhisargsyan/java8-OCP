package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 */
public class TestStaticSyncronizedBlockMethodWithSharedResource_step12 {
    public static void main(String[] args) {
        Table table=new Table();
        ThreadStaticSB1 t1=new ThreadStaticSB1(table);
        ThreadStaticSB2 t2=new ThreadStaticSB2(table);

        t1.start();
        t2.start();

    }
}
