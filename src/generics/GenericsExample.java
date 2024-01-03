package generics;

// A generic class using a type parameter T
class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        // Box for Integer type
        Box<Integer> intBox = new Box<>();
        intBox.setValue(10);
        int value = intBox.getValue(); // No need to cast, type safety ensured
        System.out.println(value);

        // Box for String type
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello");
        String strValue = stringBox.getValue(); // Type safety enforced
        System.out.println(strValue);
    }
}