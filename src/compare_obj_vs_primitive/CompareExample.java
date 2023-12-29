package compare_obj_vs_primitive;

public class CompareExample {
    public static void main(String[] args) {
        // primitive
        int x = 5;
        int y = 5;
        System.out.println(x == y); // true

        // objects (equals() overridden)
        TestObj test1 = new TestObj(1);
        TestObj test2 = new TestObj(1);

        System.out.println(test1 == test2); // false (different memory locations)
        System.out.println(test1.equals(test2)); // true (same id)

        // Strings
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str1 == str2); // false (different memory locations)
        System.out.println(str1.equals(str2)); // true (same content)

        // but,
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2)); // true

        // that happen because, "String interning"
        // multiple string literals with the same value are stored in a one "string pool"
        // and share same memory locations in all variables (s1 and s2)
        // so s1 and s2 have same memory location.
    }
}
