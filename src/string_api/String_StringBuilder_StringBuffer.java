package string_api;

public class String_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        String str = "Hello";
        str += " World"; // Creates a new string object
        System.out.println(str);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Modifies the StringBuilder in place
        System.out.println(sb);

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World"); // Modifies the StringBuffer in place
        System.out.println(sbf);
    }
}
