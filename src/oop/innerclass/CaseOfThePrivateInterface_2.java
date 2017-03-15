package oop.innerclass;

/**
 * Created by varduhis on 3/15/2017.
 */
public class CaseOfThePrivateInterface_2 {

    /**
     * Just like any inner class, an inner
     interface can be private. This means that the interface can only be referred to within the
     current outer class.
     */
    private interface InnerInterface {

        /**
         * The rule that all methods in an interface are public still applies. A class that implements
         the interface must define that method as public.
         */
        void go();
    }

    class Inner implements InnerInterface {
        @Override
        public void go() {
            System.out.print("Private Interface method override");
        }
    }

    public static void main(String[] args) {
        Inner inner=new CaseOfThePrivateInterface_2().new Inner();
       inner.go();

    }
}
