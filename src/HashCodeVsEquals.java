public class HashCodeVsEquals {
    public static void main(String[] args) {
       String s1 = "Hello";
       String s2 = "Hello";
       String s3 = "Hi";

       System.out.println(s1.equals(s2)); // true
       System.out.println(s1.equals(s3)); // false

       System.out.println(s1.hashCode()); // 69609650
       System.out.println(s2.hashCode()); // 69609650
       System.out.println(s3.hashCode()); // 2337
    }
}
