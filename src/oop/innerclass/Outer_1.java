package oop.innerclass;

/**
 * Created by varduhis on 3/15/2017.
 * <p>
 * <p>
 * Compiling the Outer.java class with which we have been working creates two class
 * files. Outer.class you should be expecting. For the inner class, the compiler creates
 * Outer$Inner.class. You don’t need to know this syntax for the exam. We mention it so
 * that you aren’t surprised to see files with $ appearing in your directories. You do need to
 * understand that multiple class files are created.
 */
public class Outer_1 {

    private String greeting = "Hi";
    private int x = 10;

    /**
     * A member inner class is defined at the member level of a class (the same level as the methods,
     * instance variables, and constructors). Member inner classes have the following properties:
     * ■■ Can be declared public, private, or protected or use default access
     * ■■ Can extend any class and implement interfaces
     * ■■ Can be abstract or final
     * ■■ Cannot declare static fields or methods
     * ■■ Can access members of the outer class including private member
     */

    protected class Inner {
        public int repeat = 3;
        //inner class can have the same variables as outer class
        private int x = 10;

        public void go() {
            for (int i = 0; i < repeat; i++)
                System.out.println(greeting);
        }


        private class Inner_inner {
            //inner class can have the same variables as outer class
            private int x = 5;


            // To access all x variables of enclosing classed  by calling className.this.varName
            public void getVar() {
                System.out.println("Print inner x " + x); // prints 5
                System.out.print("Print outer x" + Inner.this.x); // 10
                System.out.print("Print outer x" + Outer_1.this.x); //20
            }
        }


    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        Outer_1 outer = new Outer_1();
        outer.callInner();
/**
 * We need an instance of Outer in order to create Inner.
 We can’t just call new Inner() because Java won’t know with which instance of Outer it is
 associated. Java solves this by calling new as if it were a method on the outer variable.
 IMPORTANT : to initialize inner object outside of  this class the pattern  Outer_1.Inner inner =new Outer().nwe Inner(); should be used
 */

        Inner inner = new Outer_1().new Inner();
        inner.go();
    }
}
