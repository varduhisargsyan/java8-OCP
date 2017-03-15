package oop.enum_test;

/**
 * Created by varduhis on 3/15/2017.
 */
public class Enum_API {

    public static void main(String[] args) {

        //ENUM is a set of constants Season.values() return Season[]
        for (Season s : Season.values()) {

            System.out.println("enum "+ s); // prints enum constant

            System.out.println("index  " +s.ordinal()); // prints an index of enum

            System.out.println("name "+ s.name()); // prints name of enum as String

        }

        //create an enum from a String.
        Season s = Season.valueOf("FALL");


    }


}
