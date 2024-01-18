package recursion;

public class FactorialExample {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    // Recursive method to calculate factorial
    static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case
        else {
            return n * factorial(n - 1);
        }
    }
}

