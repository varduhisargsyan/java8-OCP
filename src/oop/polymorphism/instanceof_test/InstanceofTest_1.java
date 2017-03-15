package oop.polymorphism.instanceof_test;

/**
 * Created by varduhis on 3/13/2017.
 */
public class InstanceofTest_1 {
    public static void main(String[] args) {
        /**
         * The variable reference is HeavyAnimal, so there could
         be an Elephant in there. At runtime, Java knows that the variable is in fact pointing to
         a Hippo
         */
        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof Hippo; // true
        boolean b2 = hippo instanceof HeavyAnimal; // true because hippo is an instance of its superclass HeavyAnimal
        boolean b3 = hippo instanceof Elephant; // false hippo is not an Elephant

        /**
        * All objects in java pass instancof Object to true , except one case when reference points to null:
         * null instanceof Object return false
         */
        boolean b4 = hippo instanceof Object; // true
        hippo = null;
        boolean b5 = hippo instanceof Object;  // false


        /**
         * for intance of test objects MUST be in  the same inheritance tree, otherwise it does not compile
         *  The compiler knows that there is no possible way for a Hippo
            variable reference to be an Elephant, since Hippo doesn’t extend Elephant directly or
             indirectly.
         */
        Hippo hippo1 = new Hippo();
        //  boolean b6=hippo1 instanceof Elephant; // Does not compile

/**
 * The compilation check only applies when instanceof is called on a class. When checking
 whether an object is an instanceof an interface, Java waits until runtime to do the
 check. The reason is that a subclass could implement that interface and the compiler
 wouldn’t know it. There is no way for Hippo to be a subclass of Elephant.
 */


        HeavyAnimal heavyAnimalNotImlementMotherInterface=new HeavyAnimal();
        boolean b7=heavyAnimalNotImlementMotherInterface instanceof Mother; // returns false, compiles indeed the object does not implement the Mother


        HeavyAnimal heavyAnimalNotImlementMotherInterface1=new Hippo();
        boolean b8=heavyAnimalNotImlementMotherInterface1 instanceof Mother; // returns true
    }

}

