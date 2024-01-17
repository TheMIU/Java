public class TypeCasting {
    public static void main(String[] args) {
        // TypeCasting => convert a value from one data type to another data type
        // 1. Conversion <- force is not needed
        // 2. Casting <- need a force ()

        // =======================================
        // 1. Conversion (Without force)

        // Wider Conversion (small to large data type)
        byte a = 10;
        int b = a;
        printType(b); // 10 is integer

        // Narrow Conversion (large to small data type)
        int c = 10;
        byte d = 5;
        d += c;
        printType(d); // 15 is byte

        // =======================================
        // 2. Casting (With force)

        // Wider Casting (small to large data type)
        int z = 5;
        int y = 2;
        double x = (double) z / y; // without casting answer is not correct.
        printType(x); // 2.5 is double

        // Narrow Casting (large to small data type)
        int j = 10;
        byte k = (byte) j;
        printType(k); // 10 is byte
    }

    // a method to print the primitive data type name
    // (not a type casting stuff, just for previewing the type)
    private static void printType(Object a) {
        String typeName = a.getClass().getName();
        if (typeName.startsWith("java.lang.")) {
            typeName = typeName.substring("java.lang.".length()).toLowerCase();
        }
        System.out.println(a + " is " + typeName);
    }
}