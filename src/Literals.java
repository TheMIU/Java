class Literals {
    public static void main(String[] args) {
        // Any constant value which can be assigned to the variable is called
        // literal/constant.

        // 1. Integer Literals
        int intValue = 42;
        int octalValue = 052;
        int hexValue = 0x2A;
        int binaryValue = 0b101010;

        // 2. Floating-Point Literals
        double doubleValue = 3.14;
        float floatValue = 3.14f;

        // 3. Character Literals
        char charValue = 'A';
        char unicodeValue = '\u0041';

        // 4. String Literals
        String stringValue = "Hello, Java!";

        // 5. Boolean Literals
        boolean trueValue = true;
        boolean falseValue = false;


        System.out.println("1. Integer Literals       : " + intValue + ", " + octalValue + ", " + hexValue + ", " + binaryValue);
        System.out.println("2. Floating-Point Literals: " + doubleValue + ", " + floatValue);
        System.out.println("3. Character Literals     : " + charValue + ", " + unicodeValue);
        System.out.println("4. String Literals        : " + stringValue);
        System.out.println("5. Boolean Literals       : " + trueValue + ", " + falseValue);
    }
}