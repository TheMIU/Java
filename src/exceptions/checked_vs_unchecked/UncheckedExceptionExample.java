package exceptions.checked_vs_unchecked;

// Unchecked Exceptions (run time exceptions)
// we can write, compiler don't give error, but if run the code, throws an exception
class UncheckedExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        System.out.println(numbers[3]); // This line will throw ArrayIndexOutOfBoundsException
    }
}
