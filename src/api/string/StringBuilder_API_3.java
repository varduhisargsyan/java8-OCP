package api.string;

/**
 * Created by varduhis on 3/20/2017.
 */
public class StringBuilder_API_3 {
    public static void main(String[] args) {
        /*
         1. Initialization

         there are 3 way to  construct stringBuilder

         The first says to create a StringBuilder containing an empty sequence of characters and
        assign sb1 to point to it.
        The second says to create a StringBuilder containing a specific value and assign sb2 to point to it.
        For the first two, it tells Java to manage the implementation
        details. The final example tells Java that we have some idea of how big the eventual value
        will be and would like the StringBuilder to reserve a certain number of slots for characters.

         */
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(5);


        /*
        2. Size vs Capacity

        Size is the number of characters currently in the sequence, and capacity is the number
        of characters the sequence can currently hold. Since a String is immutable, the size and
        capacity are the same. The number of characters appearing in the String is both the size
        and capacity.For StringBuilder, Java knows the size is likely to change as the object is used. When
        StringBuilder is constructed, it may start at the default capacity (which happens to be
        16) or one of the programmer’s choosing. In the example, we request a capacity of 5. At
        this point, the size is 0 since no characters have been added yet, but we have space for 5.
        if it happens to append > characters then the capacity , java automatically increases the capacity to hold extra characters
         */
        sb3.append("123456789777");
        System.out.println(sb3.length());


        /*
         3.  charAt(), indexOf(), length(), and substring()-These four methods work exactly the same as in the String class
      */

        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);


        /*
            4. StringBuilder append(String str)
            t
            there are more then 10 methods that take different kind of parameters

            append() is called directly after the constructor. By having
            all these method signatures, you can just call append() without having to convert your
        parameter to a String first.
         */

        sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb); // 1c-true

    /*
        5. StringBuilder insert(int offset, String str)

        method adds characters to the StringBuilder at the requested index and
        returns a reference to the current StringBuilder. Just like append(), there are lots of
        method signatures for different types.
    */

        sb = new StringBuilder("animals");
        sb.insert(7, "-"); // sb = animals-
        sb.insert(0, "-"); // sb = -animals-
        sb.insert(4, "-"); // sb = -ani-mals
        System.out.println(sb);




        /*
            6.  StringBuilder delete(int start, int end)
                StringBuilder deleteCharAt(int index)
         */

        sb = new StringBuilder("abcdef");
        sb.delete(1, 3); // sb = adef
        //  sb.deleteCharAt(5); // throws an exception StringOutOfBounds

        /*
         7.    StringBuilder reverse()
        The reverse() method reverse the characters in the sequences and returns a reference to the current
        StringBuilder
         */

        sb = new StringBuilder("ABC");
        sb.reverse();
        System.out.println(sb); //CBA


        /*
        8. String toString()
        method converts a StringBuilder into a String. The method signature is as follows:
        Often StringBuilder is used internally for performance purposes but the end result
            needs to be a String. For example, maybe it needs to be passed to another method that is
            expecting a String.
        */
        String s = sb.toString();


        /*
        StringBuilder vs. StringBuffer


        When writing new code that concatenates a lot of String objects together, you should
        use StringBuilder. StringBuilder was added to Java in Java 5. If you come across older
        code, you will see StringBuffer used for this purpose. StringBuffer does the same thing
        but more slowly because it is thread safe.
         */

    }
}
