package oop.innerclass;

/**
 * Created by varduhis on 3/15/2017.
 * Polymorphism is in play when anonymous inner classes are involved
 * Anonymous inner classes are especially useful when you only need to override a small amount of functionality (like just one method)
 * in a superclass,and don’t want to deal with the overhead of creating an entire class for something so simple.
 */
public class Outer_3 {

    private interface Inner_Interface {
        void go();

    }

    private class Inner_class {
        void doStuff(Inner_Interface obj) {
            obj.go();

        }

        void doStuff() {
            System.out.print("Inner_class method");
        }
    }

    private void doAnonymousImplOfClass() {
/**
 *   annonyme reference variable refers not to an instance Inner_class but to an
 instance of an anonymous (unnamed) subclass of Inner_class.
 */
        Inner_class annonyme = new Inner_class() {
            void doStuff() {

                System.out.println("Hello Polymorphism:  Anonymous class overridden method");
            }
        };
        annonyme.doStuff();

    }

    private void doAnonymousImplOfInterface() {
        Inner_class obj = new Inner_class();
/**
 *   annonyme reference variable refers not to an instance Inner_interface but to an
 instance of an anonymous (unnamed) implem,entation  of Inner_interface.
 */

        Inner_Interface annonyme = new Inner_Interface() {
            @Override
            public void go() {
                System.out.println("Hello Polymorphism: Method override of anonyme interface instance");
            }
        };

        obj.doStuff(annonyme);
    }


    public static void main(String[] args) {
        Outer_3 outer = new Outer_3();
        outer.doAnonymousImplOfClass();
        outer.doAnonymousImplOfInterface();


        Outer_3.Inner_class inner = new Outer_3().new Inner_class();
        inner.doStuff();
        ;
        inner.doStuff(new Inner_Interface() {
            @Override
            public void go() {
                System.out.println("Hello Polymorphism: Another instance of Inner_interface");

            }
        });

    }
}
