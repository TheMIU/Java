package generics;

import java.util.List;

// Generic class to represent a type token
class TypeToken<T> {
    private final Class<T> type;

    public TypeToken(Class<T> type) {
        this.type = type;
    }

    public Class<T> getType() {
        return type;
    }
}

// Generic method using a type token
class TypeTokenExample {
    public static <T> void printType(List<T> list, TypeToken<T> typeToken) {
        Class<?> elementType = typeToken.getType();
        System.out.println("Type: " + elementType.getSimpleName());

        for (T item : list) {
            System.out.println(item);
        }
    }
}

public class TypeTokenDemo {
    public static void main(String[] args) {
        // Creating a type token for String
        TypeToken<String> stringToken = new TypeToken<>(String.class);

        // Creating a list of strings
        List<String> stringList = List.of("Apple", "Banana", "Cherry");

        // Using the generic method with the type token
        TypeTokenExample.printType(stringList, stringToken);

        // Creating a type token for Integer
        TypeToken<Integer> integerToken = new TypeToken<>(Integer.class);

        // Creating a list of integers
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);

        // Using the generic method with the type token
        TypeTokenExample.printType(integerList, integerToken);
    }
}
