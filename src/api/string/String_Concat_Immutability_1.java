package api.string;

/**
 * Created by varduhis on 3/20/2017.
 */
public class String_Concat_Immutability_1 {

    /*
        3. Immutability
        Once a String object is created, it is not allowed to change. It cannot be made larger or
            smaller, and you cannot change one of the characters inside it.
     */
    private String str = "initial str";

    public String getStr() {
        return str;
    }

    public void setStr(String str) { // setter makes str  mutable even though  the str object cant be altered by calling setter on it we actualy change the reference str to point to another object
        this.str = str;
    }

    public static void main(String[] args) {
      /*
        * 1. Initialization
        *
            Both give you a reference variable of type name pointing to the String object "Fluffy".
            They are subtly different
            1. used literal String  and is kept in string pool
            2. String object see later the notion of String pool
         */
        String name = "Fluffy"; //Goes into String pool and can be reused
        String name_1 = new String("Fluffy"); // Goes into Heap

        /* 2. String Pool

        *Since String are  used everywhere in applications and it's immutable, they  can use up 25–40 percent of the memory in the entire program.
        Java realizes that many strings can repeat in the program and solves this issue by reusing common ones.
         The string pool, also known as the intern pool, is a location in the Java virtual machine (JVM)
        that collects all these strings.The string pool contains literal values that appear in your program.
        For example, “name” is a literal and therefore goes into the string pool. myObject.toString() is a string but not a literal,
        so it does not go into the string pool. Strings not in the string pool are garbage collected just like any other object.


         */
        String name_2 = "Fluffy"; // for name_2  "Fluffy" is reused
/*
        2.1  String Equality

 */
        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y); // true

        String z=" Hello World".trim();  //any operation with string literal results to  String object creation
        /*
        In this example, we don’t have two of the same String literal. Although x and z happen
         to evaluate to the same string, one is computed at runtime. Since it isn’t the same at
         compile-time, a new String object is created.
         */
        System.out.println(x==z); // false

        /**
         * 3. Concatenation
         *
         * Placing one String before the other String and combining them together is called string
         concatenation.  the + operator can be used in two ways within the same line of code.
         Rules:
         1. If both operands are numeric, + means numeric addition.
         2. If either operand is a String, + means concatenation.
         3. The expression is evaluated left to right.
         *
         */
        System.out.println(1 + 2); // 3
        System.out.println("a" + "b"); // ab
        System.out.println("a" + "b" + 3); // ab3
        System.out.println(1 + 2 + "c"); // 3c

        /*
        what += does. s += "2" means the same thing as s =s+"2"
         */
        String s = "1"; //holds 1
        s += 2; // holds 12
        s += 6; //holds 126

        String_Concat_Immutability_1 obj = new String_Concat_Immutability_1();
        /*
         even though the String class is immutable it can be still used in mutable class
         String_Concat_Immutability_1 is mutable by calling setter on obj.str we actually change the reference str to point to another object
         You can even make the instance variable final so the compiler reminds you if you accidentally change str.

         */
        obj.setStr("Another string object ");


    }
}
