package oop.enum_test;

/**
 * Created by varduhis on 3/13/2017.
 * <p>
 * An enumeration is like a fixed set of constants. In Java, an enum is a class that represents an
 * enumeration. It is much better than a bunch of constants because it provides type‐safe
 * checking. With numeric or string  constants, you can pass an invalid value and not find out until
 * runtime. With enums, it is impossible to create an invalid enum type without introducing a
 * compiler error.
 */
public class EnumVSNumericConstants {
    //Constants
    public static final String SUMMER = "SUMMER";
    public static final String WINTER = "WITHER";
    public static final String FALL = "FALL";
    public static final String SPRING = "SPRING";


    public static void testInvalidConstantVSenum() {
        //Error in the string and no compilation error
        if (SUMMER == "Sumer") {

        }

        //compiler does not accept invalid String as "sumer" is not type ENUM
        /**  if(Season.SUMMER=="sumer"){

         }*/

        //compiler does not accept invalid ENUM.OTHER
        /**   if (Season.WITHER == Season.OTHER) {

         }
         */

        Season s1 = Season.valueOf("SUMMER"); // SUMMER
        Season s2 = Season.valueOf("summer"); // exception
    }


    public static void enumInSwitch() {
        Season s = Season.SPRING; // is of type Season


        switch (s) {
            case FALL:
                System.out.print("Fall is coming in yerevan");
                break;
            case SUMMER:
                System.out.print("Fall is coming in yerevan");
                break;
            //  case 0:System.out.print("DOES NOT COMPILE"); break;

        }
    }

    public static void main(String[] args) {

    }
}
