package generics;

// A simple generic class
class MyGenericClass<T> {
    private T value;

    public MyGenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

// A class that extends the generic class
class MySubclass extends MyGenericClass<String> {
    public MySubclass(String value) {
        super(value);
    }
}

public class BridgeMethodTest {
    public static void main(String[] args) {
        MySubclass mySubclass = new MySubclass("Hello, Generics!");

        // The following two lines are equivalent due to the bridge method
        String value = mySubclass.getValue();
        Object valueAsObject = mySubclass.getValue();

        System.out.println(value);
        System.out.println(valueAsObject);
    }
}

/*
 * Compiler creates this bridge method in the same class
 * where the generic code is defined.
 *
 * class MySubclass extends MyGenericClass<java.lang.String> {
 *      MySubclass(java.lang.String);
 *      public java.lang.String getValue();
 *
 *      // Bridge method generated by the compiler
 *      public java.lang.Object getValue();
 * }
 * 
 * The bridge method's task is to ensure compatibility and maintain polymorphism
 * between generic and non-generic code during type erasure in Java.
 */