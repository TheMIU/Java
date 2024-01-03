package exceptions.exception_handling;

class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println(result);

        } catch (Exception e) {
            System.out.println("An arithmetic exception: " + e.getMessage());

        } finally {
            System.out.println("Exception or not, anyway 'Finally' block will execute.");
        }
    }
}
