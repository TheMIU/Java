package custom_annotation;

import java.lang.reflect.Method;

class MyClass {

    @MyCustomAnnotation(value = "Hello, Custom Annotation!")
    public void myAnnotatedMethod() {
        System.out.println("Executing annotated method");
    }

    public void nonAnnotatedMethod() {
        System.out.println("Executing non-annotated method");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        MyClass myClass = new MyClass();
        myClass.myAnnotatedMethod(); // Will print the message and execute the annotated method
        myClass.nonAnnotatedMethod(); // Will only print the message

        // Retrieve and inspect annotations at runtime
        Method method = MyClass.class.getMethod("myAnnotatedMethod");
        if (method.isAnnotationPresent(MyCustomAnnotation.class)) {
            MyCustomAnnotation annotation = method.getAnnotation(MyCustomAnnotation.class);
            System.out.println("Annotation Value: " + annotation.value());
        }
    }
}

/*
 * output
 * 
 * Executing annotated method
 * Executing non-annotated method
 * Annotation Value: Hello, Custom Annotation!
 */