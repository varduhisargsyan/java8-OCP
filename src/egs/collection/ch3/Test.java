package egs.collection.ch3;

/**
 * Created by varduhis on 2/28/2017.
 */
public class Test {
    private int prop1;
    private static int prop2;


    public int getProp1(){
        return prop1;
    }

    public void  setProp1(int prop1){
        this.prop1=prop1;
    }

    public  static int getProp2(int i){
        return i+2;
    }
    //Write a Java method to compute the sum of the digits in an integer.
    public static int sumDigits(long n) {
        int result = 0;

        while(n > 0) {
            result += n % 10;
            n /= 10;
        }

        return result;
    }
    public static void main(String[] args) {
sumDigits(251);

    }
}


