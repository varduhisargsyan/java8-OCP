package oop.equals_hashcode_toString;

/**
 * Created by varduhis on 3/14/2017.
 */
public class ObjectImplementingToString {

    private int field1;
    private int field2;
    private String field3;


    public ObjectImplementingToString(int field1, int field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    //can be commented to show the Object's toString() output
    @Override
    public String toString() {
        return "ObjectImplementingToString{" +
                "field1=" + field1 +
                ", field2=" + field2 +
                ", field3='" + field3 + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ObjectImplementingToString obj = new ObjectImplementingToString(10, 20, "F3");

        // For obj it calls it's toString() method . Class  ObjectImplementingToString overrids Object's toString
        //  the output excpected is ObjectImplementingToString{field1=10, field2=20, field3='F3'}
        System.out.println(obj); // common mistake is to call redundant obj.toString() in sysout  System.out.println(obj.toString());
    }
}
