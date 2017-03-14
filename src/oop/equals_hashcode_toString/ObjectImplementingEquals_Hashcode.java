package oop.equals_hashcode_toString;

/**
 * Created by varduhis on 3/14/2017.
 */
public class ObjectImplementingEquals_Hashcode {

    private int field1;
    private int field2;
    private String field3;

    public ObjectImplementingEquals_Hashcode(int field1, int field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    /**
     * Java uses == to compare primitives and for checking if two variables refer
     * to the same object.
     * the method signature : It takes an Object as the method parameter rather than a ObjectImplementingEquals_Hashcode.
     * <p>
     * The equals() method implements an equivalence relation on non‐null object references:
     * <p>
     * ■■ It is reflexive: For any non‐null reference value x, x.equals(x) should return true.
     * <p>
     * ■■ It is symmetric: For any non‐null reference values x and y, x.equals(y) should return
     * true if and only if y.equals(x) returns true.
     * <p>
     * ■■ It is transitive: For any non‐null reference values x, y, and z, if x.equals(y) returns
     * true and y.equals(z) returns true, then x.equals(z) should return true.
     * <p>
     * ■■ It is consistent: For any non‐null reference values x and y, multiple invocations of
     * x.equals(y) consistently return true or consistently return false, provided no
     * information used in equals comparisons on the objects is modified.
     * <p>
     * ■■ For any non‐null reference value x, x.equals(null) should return false.
     * It should be obvious that an object and null aren’t equal. The key is that equals()
     * needs to return false when this occurs rather than throw a NullPointerException
     */

    @Override
    public boolean equals(Object o) {
        //this and o refere to the same object ex . ObjectImplementingEquals_Hashcode obj=new ObjectImplementingEquals_Hashcode(); Object o=obj;
        if (this == o) return true;

        //obviously this is an instance of ObjectImplementingEquals_Hashcode, but the object passed to  equals can be any type
        //if not instanceof ObjectImplementingEquals_Hashcode equaliyy fails

        if (!(o instanceof ObjectImplementingEquals_Hashcode)) return false;

        ObjectImplementingEquals_Hashcode that = (ObjectImplementingEquals_Hashcode) o;

        // Passing to the field check one by one
        //check primitive fields first.

        if (field1 != that.field1) return false;
        if (field2 != that.field2) return false;
        return field3 != null ? field3.equals(that.field3) : that.field3 == null;

    }

    /**
     *  Whenever you override equals(), you are also expected to override hashCode()
     *
     *  The three points of hashCode contract are important to retain
     ■■ Within the same program, the result of hashCode() must not change. This means that
     you shouldn’t include variables that change in figuring out the hash code.

     ■■ If equals() returns true when called with two objects, calling hashCode() on each of
     those objects must return the same result. This means hashCode() can use a subset of
     the variables that equals() uses.

     ■■ If equals() returns false when called with two objects, calling hashCode() on each of
     those objects does not have to return a different result. This means hashCode() results
     do not need to be unique when called on unequal objects.
     */
    @Override
    public int hashCode() {
        int result = field1;
        result = 31 * result + field2;
        result = 31 * result + (field3 != null ? field3.hashCode() : 0);
        return result;
    }


    public static void main(String[] args) {

        ObjectImplementingEquals_Hashcode obj1 = new ObjectImplementingEquals_Hashcode(10, 20, "F3");
        ObjectImplementingEquals_Hashcode obj2 = new ObjectImplementingEquals_Hashcode(10, 20, "F3");
        ObjectImplementingEquals_Hashcode obj3 = new ObjectImplementingEquals_Hashcode(10, 20, "F3");

        System.out.println( "obj1 equals to obj2 "+ obj1.equals(obj2));
        System.out.println( "obj2 equals to obj3 "+ obj2.equals(obj3));
        System.out.println( "obj1 equals to obj3 "+ obj1.equals(obj3));

        System.out.println( "*********************************************************** ");
        System.out.println( "obj1 hashcode "+ obj1.hashCode());
        System.out.println( "obj2 hashcode "+ obj2.hashCode());
        System.out.println( "obj3 hashcode "+ obj3.hashCode());

    }
}
