package multithreading;

/**
 * Created by varduhis on 2/22/2017.
 */
public class ThreadS1 extends  Thread{

    private Table t;

    public ThreadS1(Table t){
        this.t=t;
    }


    @Override
    public void run() {

        t.printTable(this.getName(), 100);
    }

}
