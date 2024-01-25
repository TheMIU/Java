public class EqualsMethod_vs_EqualSymbol {
    public static void main(String[] args) {
        // .equals vs ==
        String str1 = new String("hello");
        String str2 = new String("hello");

        // Using equals for content comparison
        boolean equalsResult = str1.equals(str2);
        System.out.println("Using equals(): " + equalsResult); // Output: true

        // Using == for reference comparison
        boolean doubleEqualResult = (str1 == str2);
        System.out.println("Using ==: " + doubleEqualResult); // Output: false

        int num1 = 5;
        int num2 = 5;

        // Using == for primitive values comparison
        boolean result = (num1 == num2);
        System.out.println("Using == for primitive comparison: " + result); // Output: true
    }
}