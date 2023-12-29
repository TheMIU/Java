package reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat myCat = new Cat("Kitty", 5);
        System.out.println(myCat.toString());

        System.out.println("\n--------- get declared fields -----------");

        Field[] declaredFields = myCat.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }

        // using reflection api, can access without getters / setters
        System.out.println("\n--------- change field values -----------");
        for (Field field : declaredFields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true); // to access private fields
                field.set(myCat, "Garfield");
            }
        }
        // check if changed
        System.out.println(myCat.toString());

        System.out.println("\n--------- get declared methods -----------");

        Method[] declaredMethods = myCat.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }

        System.out.println("\n--------- invoking methods -----------");
        for (Method method : declaredMethods) {
            if (method.getName().equals("talk")) {
                method.setAccessible(true); // to access private methods
                method.invoke(myCat);
            }
        }
    }
}

// more info : https://www.youtube.com/watch?v=bhhMJSKNCQY