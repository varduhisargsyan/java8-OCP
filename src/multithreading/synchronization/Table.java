package multithreading.synchronization;

/**
 * Created by varduhis on 2/22/2017.
 */
public class Table {
    private int count;
    //method not synchronized
    void printTable(String threadName, int n ){
        for(int i=1;i<=5;i++){
            System.out.println(threadName);
            System.out.println(i*n);
            try{
                Thread.sleep(800);
            }catch(Exception e){
                System.out.println(e);}
        }

    }

    synchronized  void syncronizedPrintTable(String threadName, int n ){
        for(int i=1;i<=5;i++){
            System.out.println(threadName);
            System.out.println(i*n);
            try{
                Thread.sleep(800);
            }catch(Exception e){
                System.out.println(e);}
        }

    }
    void syncronizedBlockPrintTable(String threadName, int n ){
      synchronized (this) {
          for (int i = 1; i <= 5; i++) {
              System.out.println(threadName);
              System.out.println(i * n);
              try {
                  Thread.sleep(800);
              } catch (Exception e) {
                  System.out.println(e);
              }
          }
      }
    }

    /*
    Suppose there are two objects of a shared class(e.g. Table) named object1 and object2.
    In case of synchronized method and synchronized block there cannot be interference between t1 and t2 or t3 and t4 because t1 and t2 both refers to a common object that have a single lock.
    But there can be interference between t1 and t3 or t2 and t4 because t1 acquires another lock and t3 acquires another lock.
    I want no interference between t1 and t3 or t2 and t4.Static synchronization solves this problem.
     */
    synchronized static void staticSyncronizedBlockPrintTable(String threadName, int n ){

            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName);
                System.out.println(i * n);
                try {
                    Thread.sleep(800);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

}
