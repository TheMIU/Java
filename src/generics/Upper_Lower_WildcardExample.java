package generics;

import java.util.ArrayList;
import java.util.List;

public class Upper_Lower_WildcardExample {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        integers.add(22);

        // Lower Bounded Wildcard - <? super T>
        addElement(numbers, 10); // Valid
        addElement(numbers, 3.14); // Valid

        // Upper Bounded Wildcard - <? extends T>
        Number number = getElement(numbers); // Valid
        // Integer integer = getElement(numbers);
        // Invalid - can't assign wildcard to specific type
        Integer integer = getElement(integers); // Valid if the list is not empty

        System.out.println(number); // 10
        System.out.println(integer); // 22
    }

    // Lower Bounded Wildcard - <? super T>
    public static <T> void addElement(List<? super T> list, T element) {
        list.add(element);
    }

    // Upper Bounded Wildcard - <? extends T>
    public static <T> T getElement(List<? extends T> list) {
        return list.get(0);
    }
}
