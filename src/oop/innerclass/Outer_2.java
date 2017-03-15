package oop.innerclass;

/**
 * Created by varduhis on 3/15/2017.
 * Local inner classes have the following properties:
 * ■ They do not have an access specifier.
 * ■ They cannot be declared static and cannot declare static fields or methods.
 * ■ They have access to all fields and methods of the enclosing class.
 * ■ They do not have access to local variables of a method unless those variables are final
 * or effectively final. More on this shortly.
 */
public class Outer_2 {
    private int length = 5;

    public void calculate() {
        final int width = 20;
        /**
         * The compiler is generating a class file from inner class.
         * A separate class has no way to refer to local variables here width. If the local variable is final ,
         Java can handle it by passing it to the constructor of the inner class or by storing it in the class
         file.
         method-local inner class object shares a special
         relationship with the enclosing (outer) class object, and can access its private (or
         any other) members. However, the inner class object cannot use the local variables
         of the method the inner class is in. Why not?
         The local variables of the method live on the stack, and exist only for
         the lifetime of the method. The scope of a local variable is
         limited to the method the variable is declared in. When the method ends, the stack
         frame is blown away and the variable is history. But even after the method
         completes, the inner class object created within it might still be alive on the heap if,
         for example, a reference to it was passed into some other code and then stored in an
         instance variable. Because the local variables aren't guaranteed to be alive as long
         as the method-local inner class object, the inner class object can't use them. Unless
         the local variables are marked final!
         */
        class Inner {
            public void multiply() {
                System.out.println(length * width);
            }
        }
        /*
        A method-local inner class can be instantiated only within the method where the inner
        class is defined.
         */
        Inner inner = new Inner();
        inner.multiply();

/**
 * When method calculate ends , the tack of the method is blown up.
 * But the  local object inner is still alive in the heap , as it's passed to outer's method
 * That's the reason why method local inner class cant use local vars , which are not final or effectively final
 */
        holdReference(inner);
    }

    public void holdReference(Object o) {
        Object[] objectHoder = new Object[1];
        objectHoder[0] = o;
    }

    public static void main(String[] args) {
        Outer_2 outer = new Outer_2();
        outer.calculate();
    }

}
