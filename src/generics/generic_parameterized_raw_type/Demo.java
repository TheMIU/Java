package generics.generic_parameterized_raw_type;

public class Demo {
    public static void main(String[] args) {
        // Parameterized Type
        Box<Integer> integerBox = new Box<>(42);
        Box<String> stringBox = new Box<>("Hello");

        // Raw Type
        Box rawBox = new Box("Raw"); // Using raw type without specifying the type parameter
    }
}

/*
 * Box<T> is a generic type.
 * Box<Integer> and Box<String> are parameterized types.
 * Box rawBox is an example of using the raw type. It lacks the type parameter (<T>).
 */