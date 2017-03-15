package oop.enum_test;

/**
 * Created by varduhis on 3/15/2017.
 */
public class Enum_API_3 {

    public static void main(String[] args) {

        //ENUM is a set of constants Season_1.values() return Season_1[]
        for (Season_1 s : Season_1.values()) {

            System.out.println("enum "+ s); // prints enum constant

            System.out.println("index  " +s.ordinal()); // prints an index of enum

            System.out.println("name "+ s.name()); // prints name of enum as String

        }

        //create an enum from a String.
        Season_1 s = Season_1.valueOf("FALL");


    }


}
