package static_members;

import static_members.OuterClass.NestedStaticClass;

public class DemoStatic {
    public static void main(String[] args) {

        // 1. static variable : no need to create object, can call using class name
        System.out.println(Counter.count); // 0
        Counter.count++;
        System.out.println(Counter.count); // 1

        // 2. static methods : can call using class name
        System.out.println(Sum.getSum(5, 3)); // 8

        // 3. static block : Invoked when class loaded into memory, 
        // they usually used to initialize static variables
        new Block(); // class load to memory
        System.out.println(Counter.count); // 10

        // 4. Nested Classes
        // "NestedStaticClass" is inside of "OuterClass.java"
        // no need to create OuterClass object to access the NestedStaticClass 
        // its independent of its outer class instances
        NestedStaticClass.sayHello();
    }
}
