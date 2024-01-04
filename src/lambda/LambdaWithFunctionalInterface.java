package lambda;

// functional interfaces <- interfaces with a single abstract method
// Runnable interface is a functional interfaces; it has only one abstract method, run()

//  In Java, lambda expressions can be used to represent instances of functional interfaces.
//  In this case, the Runnable interface is a functional interface with the method void run().

class LambdaWithFunctionalInterface {
    public static void main(String[] args) {
        // this lambda expression implements the run() method of Runnable interface
        Thread thread1 = new Thread(() -> {
            System.out.println("inside thread1");
        });

        thread1.start();
    }
}
