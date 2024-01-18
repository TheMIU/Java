package string_api;

public class StringPool {
    public static void main(String[] args) {
        // Creating two strings using string literal, both refer to the same string pool location
        String s1 = "hello";
        String s2 = "hello";

        System.out.println(s1 == s2); // true
        /* Because these strings share the same reference in the string pool */

        // Creating two strings using the 'new' keyword, they are in different memory locations
        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println(s3 == s4); // false
        /* They are created as separate objects and have different references */
    }
}
