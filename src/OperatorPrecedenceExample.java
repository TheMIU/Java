public class OperatorPrecedenceExample {
    public static void main(String[] args) {
        int result = 1 / 2 + 5 * 70 - 3 % 2 + 4 * 2 - 8 / 4;
        System.out.println("Result: " + result); // 355

        // Example 1: Arithmetic operators
        int result1 = 10 + 5 * 2;
        System.out.println("Result 1: " + result1); // 20

        // Example 2: Parentheses can be used to change precedence
        int result2 = (10 + 5) * 2;
        System.out.println("Result 2: " + result2); // 30

        // Example 3: Mix of addition, subtraction, and multiplication
        int result3 = 5 + 3 - 2 * 4 / 2;
        System.out.println("Result 3: " + result3); // 4

        // Example 4: Modulo and logical operators
        boolean result4 = (8 % 3 == 2) && (5 > 3);
        System.out.println("Result 4: " + result4); // true

        // Example 5: Ternary operator
        int a = 15;
        int b = 20;
        int result5 = (a > b) ? a : b;
        System.out.println("Result 5: " + result5); // 20

        // Example 6: Bitwise AND and OR
        int result6 = 7 & 3 | 1;
        System.out.println("Result 6: " + result6); // 3

        // Example 7: Bit Shift Operators
        // Bit shift operators shift the bits of a binary value and produce a result.
        int result7 = (8 << 2) + (16 >> 2) + (-16 >>> 2);
        System.out.println("Combined Bit Shift Result: " + result7);
    }
}

/*
 * 
 * precedence (from highest to lowest):
 * 
 * Postfix operators: ++, --
 * Unary operators: +, -, ++, --, !
 * Multiplication, division, and remainder: *, /, %
 * Addition and subtraction: +, -
 * Shift operators: <<, >>, >>>
 * Relational operators: <, <=, >, >=, instanceof
 * Equality operators: ==, !=
 * Bitwise AND, XOR, and OR: &, ^, |
 * Logical AND and OR: &&, ||
 * Conditional (Ternary) operator: ? :
 * Assignment operators: =, +=, -=, *=, /=, %= and others
 * 
 */

/*
 * Associativity
 * 
 * Assignment operators,
 * Ternary operator,
 * Unary operators,
 * Postfix operators are Right to Left
 * 
 * Others are Left to right
 */