public class FinallyVsFinalize {
    public static void main(String[] args) {
        // finally
        try {
            int x = 5 / 0;
            System.out.println(x);
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("exception trowed or not, finally block will execute");
        }

        // output
        // java.lang.ArithmeticException: / by zero
        // exception trowed or not, finally block will execute

        // ==================

        // finalize() method
        Object obj = new Object();
        obj = null;
        System.gc(); // this will invoke finalize()

        /*
         * While calling System.gc() suggests the Java Virtual Machine (JVM) to run the
         * garbage collector, it does not guarantee that the finalize() method will be
         * invoked immediately or at all. The garbage collector operates on its own
         * schedule, and the decision to collect an object, including invoking its
         * finalize() method, depends on various factors.
         */
    }
}
