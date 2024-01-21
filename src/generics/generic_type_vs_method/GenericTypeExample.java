package generics.generic_type_vs_method;

/*
    Generic Type:
    Works with different data types in a class or interface.
*/

// Generic class
class Box<T> {
    private T value;

    // Constructor
    public Box(T value) {
        this.value = value;
    }

    // Getter and setter methods
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericTypeExample {
    public static void main(String[] args) {
        // Creating a Box for Integer
        Box<Integer> intBox = new Box<>(42);
        System.out.println("Integer Box Value: " + intBox.getValue());

        // Creating a Box for String
        Box<String> strBox = new Box<>("Hello, Generics!");
        System.out.println("String Box Value: " + strBox.getValue());
    }
}
