public class Bitwise_vs_Conditional_AND {
    public static void main(String[] args) {
        if (false & testMethod()) {
            // testMethod() will be invoked
            // output : Right side checked
        }

        if (false && testMethod()) {
            // testMethod() will not be invoked
        }

        // also & can use for binary calculations
        // 5 binary: 0101 , 3 binary: 0011
        System.out.println(5 & 3); // bitwise AND: 0001 (decimal 1)
    }

    static boolean testMethod() {
        System.out.println("Right side checked");
        return true;
    }
}

/*
 * & (Bitwise AND)
 * It always evaluates both sides of the expression, even if the left operand is false.
 * 
 * && (Conditional AND)
 * It performs a short-circuit logical AND operation.
 * If the left operand is false, the right operand is not evaluated
 * 
 * so && is good for performance.
 */