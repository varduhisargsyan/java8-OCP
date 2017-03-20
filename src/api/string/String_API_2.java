package api.string;

/**
 * Created by varduhis on 3/20/2017.
 */
public class String_API_2 {

    public static void main(String[] args) {

        /* 1.  int   length()

        returns the number of characters in the String.
        */


        String string = "animals";
        System.out.println(string.length()); // 7

    /* 2 . char charAt(int index)

    returns character at specified index : indexes start counting with 0
    Since, charAt(0) returns the “fi rst” character in the
    sequence. Similarly, charAt(6) returns the “seventh” character in the sequence. charAt(7)
    java.lang.StringIndexOutOfBoundsException: String index out of range: 7
    */

        string = "animals";
        System.out.println(string.charAt(0)); // a
        System.out.println(string.charAt(6)); // s
     //   System.out.println(string.charAt(7)); // throws exception

        /* 3. indexOf()

        The method indexOf()looks at the characters in the string and finds the first index that
        matches the desired value.
        A. int indexOf(char ch)
        B.int indexOf(char ch, index fromIndex)
        C.int indexOf(String str)
        D.int indexOf(String str, index fromIndex)

     Since indexes begin with 0, the first 'a' matches at that position. The second statement
    looks for a more specific string and so matches later on. The third statement says Java
    shouldn’t even look at the characters until it gets to index 4. The fi nal statement doesn’t
    fi nd anything because it starts looking after the match occurred. Unlike charAt(), the
    indexOf() method doesn’t throw an exception if it can’t fi nd a match. indexOf() returns
    –1 when no match is found. Because indexes start with 0, the caller knows that –1 couldn’t
    be a valid index. This makes it a common value for a method to signify to the caller that no
    match is found.

      */


        string = "animals";
        System.out.println(string.indexOf('a')); // 0
        System.out.println(string.indexOf("al")); // 4
        System.out.println(string.indexOf('a', 4)); // 4
        System.out.println(string.indexOf("al", 5)); // -1


    /* 4. substring()

    The method substring() also looks for characters in a string. It returns parts of the string.
    The fi rst parameter is the index to start with for the returned string. As usual, this is a
    zero-based index. There is an optional second parameter, which is the end index you want
    to stop at.Notice “stop at” rather than “include.” This means the endIndex parameter is exclusive.
    A.int substring(int beginIndex)
    B.int substring(int beginIndex, int endIndex)
    */
        string = "animals";
        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 7)); // mals
        System.out.println(string.substring(3, 3)); // empty string
      //  System.out.println(string.substring(3, 2)); // throws exception
     //   System.out.println(string.substring(3, 8)); // throws exception

    /*
        5.  String toLowerCase(String str)
            String toUpperCase(String str)
     */

        string = "animals";
        System.out.println(string.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123

    /*
        6.    boolean equals(String str)
              boolean equalsIgnoreCase(String str)

             method checks whether two String objects contain exactly the same characters
            in the same order. The equalsIgnoreCase() method checks whether two String
            objects contain the same characters with the exception that it will convert the characters’
            case if needed
    */
        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        /*
          7. boolean startsWith(String prefix)
             boolean endsWith(String suffix)
         */

        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

        /*
         8. boolean contains(String str)

         it looks for matches anywhere in the string .we have a case-sensitive search in the String. The contains() method is a convenience
            method so you don’t have to write str.indexOf(otherString) != -1.

        */

        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false


        /*
            9.   String replace(char oldChar, char newChar)
                String replace(CharSequence oldChar, CharSequence newChar)

                There’s a version that takes char parameters as well as a version that takes CharSequence parameters.
                A CharSequence is an interface and  general way of representing several classes, including String and
                StringBuilder_API_3.
                The first example uses the fi rst method signature, passing in char parameters. The
            second example uses the second method signature, passing in String parameters.
         */

        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc


        /*  10.public String trim()

         The trim() method removes whitespace from the beginning and end of a String.
         whitespace consists of spaces along with the \t (tab) and \n (newline) characters.
         Other characters, such as \r (carriage return), are also included in
         The fist example prints the original string because there are no whitespace characters
        at the beginning or end. The second example gets rid of the leading tab, subsequent spaces,
        and the trailing newline. It leaves the spaces that are in the middle of the string.
         */

        System.out.println("abc".trim()); // abc
        System.out.println("\t a b c\n".trim()); // a b c
    }
}
