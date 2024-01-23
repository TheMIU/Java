package generics;

import java.util.ArrayList;
import java.util.List;

public class HeapPollutionExample {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        addToList(intList, 42);
        addToList(stringList, "Hello");

        // Attempting to retrieve elements from the lists
        // The following lines will not compile, but let's imagine they do
        Integer intValue = getElement(intList, 0);
        String stringValue = getElement(stringList, 0);

        System.out.println(intValue); // 42
        System.out.println(stringValue);// Hello
    }

    // Method to add an element to a list
    public static <T> void addToList(List<T> list, T element) {
        list.add(element);
    }

    // Method to retrieve an element from a list
    public static <T> T getElement(List<T> list, int index) {
        // This method is not type-safe and may cause heap pollution
        return list.get(index);
    }
}

/*
 * 
 * Heap pollution occurs in Java when a variable of a parameterized type
 * (generics) references an object not of that type, potentially leading to
 * unexpected runtime errors.
 * 
 * this code will compile and run without any runtime exceptions because Java's
 * type erasure
 * makes it challenging to catch these issues at runtime.
 * 
 * The key point here is that even though the example runs successfully, it is
 * not type-safe. The getElement method retrieves elements from the list without
 * knowing their actual types, which could lead to heap pollution.
 */