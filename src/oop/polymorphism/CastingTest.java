package oop.polymorphism;

import oop.inheritance.*;

/**
 * Created by varduhis on 3/13/2017.
 * <p>
 * 1. A reference variable can be of only one type, and once declared, that type
 * can never be changed (although the object it references can change).
 * 2. A reference is a variable, so it can be reassigned to other objects (unless the
 * reference is declared final).
 * 3. A reference variable's type determines the methods that can be invoked on
 * the object the variable is referencing.
 * 4. A reference variable can refer to any object of the same type as the declared
 * reference, or it can refer to any subtype of the declared
 * type!
 * 5. A reference variable can be declared as a class type or an interface type. If
 * the variable is declared as an interface type, it can reference any object of any
 * class that implements the interface.
 */
public class CastingTest {
    public static void main(String[] args) {

        Lion lion = new Lion();
        Animal lionReferenceByAnimalSupertype = new Lion();
        Canin lionReferencedByCaninSupertype = new Lion();
        Wild lionReferencedByInterfaceType = new Lion();


/** UPCAST (Object is referenced by it's supertype). In this case no explicit casting is performed .
 * RULE 5:  A reference variable can refer to any object of the same type as the declared
 reference, or it can refer to any subtype of the declared
 type.

 */
        Dog dog = new Dog();
        Animal animal1 = dog; // upcast ok with no explicit cast
        Animal animal2 = (Animal) dog; // upcast ok with explicit cast

/**
 *DOWNCAST: Downcast is the opposite of the RULE 5 , the compiler does not perform casting , to be provided explicitly.
 * animal1 object is referenced by Animal type , indeed the real object is DOG type
 */
        Animal animal3 = new Dog();
        Dog dog1 = (Dog) animal3; // DOWNCAST  is ok as at run type the real object is Dog type

        Canin canin = new Canin();
        Dog dog2=(Dog)canin;    // DOWNCAST is ok , but fails at runtime as real object is Canin type , Canin is not Dog
    }


}
