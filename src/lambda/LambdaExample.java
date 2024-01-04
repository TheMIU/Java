package lambda;

// Example : Using lambda expression with a functional interface
interface MyInterface {
    void myMethod(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Lambda expression to implement MyInterface
        MyInterface myObj1 = (x, y) -> System.out.println("Sum: " + (x + y));
        MyInterface myObj2 = (x, y) -> System.out.println("Multiply: " + (x * y));

        MyInterface myObj3 = (x,y)-> {
            System.out.println("Max number is: "+ ((x > y) ? x : y));
        };

        // Calling the method using the lambda expression
        myObj1.myMethod(5, 10); // Sum: 15
        myObj2.myMethod(5, 10); // Multiply: 50
        myObj3.myMethod(5, 10); // Max number is: 10


        // without lambda we want to create another class to implement the interface
        Test test = new Test();
        test.myMethod(5, 10); // Max number is: 10
    }
}

// no need this class with lambda expressions
class Test implements MyInterface{

    @Override
    public void myMethod(int a, int b) {
        System.out.println("Max number is: " + ((a > b) ? a : b));
    }
    
}