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
public class EnumVSNumericConstants_2 {
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
        /**  if(Season_1.SUMMER=="sumer"){

         }*/

        //compiler does not accept invalid ENUM.OTHER
        /**   if (Season_1.WITHER == Season_1.OTHER) {

         }
         */

        Season_1 s1 = Season_1.valueOf("SUMMER"); // SUMMER
        Season_1 s2 = Season_1.valueOf("summer"); // exception
    }


    public static void enumInSwitch() {
        Season_1 s = Season_1.SPRING; // is of type Season_1


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
