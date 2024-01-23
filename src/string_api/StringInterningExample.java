package string_api;
public class StringInterningExample {
    public static void main(String[] args) {
        // Automatic Interning
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        // str1 and str2 reference the same string in the pool
        System.out.println("str1 == str2: " + (str1 == str2)); // true

        // str1 and str3 reference different objects in memory
        System.out.println("str1 == str3: " + (str1 == str3)); // false

        // Explicit Interning
        String str4 = str3.intern();

        // str1 and str4 now reference the same string in the pool
        System.out.println("str1 == str4: " + (str1 == str4)); // true
    }
}