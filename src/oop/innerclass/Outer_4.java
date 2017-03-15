package oop.innerclass;

/**
 * Created by varduhis on 3/15/2017.
 */
public class Outer_4 {
    private int field1 = 1;
    private static int field2 = 2;

    static class Inner {

        /**
         * Just as a static method does not have access to the instance variables and
         * nonstatic methods of the class, a static nested class does not have access to the instance
         * variables and nonstatic methods of the outer class. Look for static nested classes with
         * code that behaves like a nonstatic (regular inner) class.
         */
        void doStuff() {
            System.out.println("Called from static inner " + field2);
        }
    }


    public static void main(String[] args) {

        Outer_4.Inner static_inner = new Outer_4.Inner();
        static_inner.doStuff();


    }
}
