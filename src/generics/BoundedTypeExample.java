package generics;

import java.util.ArrayList;
import java.util.List;

public class BoundedTypeExample {

    // Upper-bounded type parameter: T must be a subtype of Number
    public static <T extends Number> double sumOfList(List<T> list) {
        double sum = 0.0;
        for (T number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // Lower-bounded type parameter: T must be a supertype of Integer
    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args) {
        // Upper-bounded example
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        double result = sumOfList(integers);
        System.out.println("Sum of integers: " + result);

        // Lower-bounded example
        List<Number> numbers = new ArrayList<>();
        addIntegers(numbers);
        System.out.println("List of numbers: " + numbers);
    }
}
