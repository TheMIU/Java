package generics;

import java.util.ArrayList;
import java.util.List;

class WildcardExample {
    public static void main(String[] args) {
        List<?> myList; // A list of an unknown type
        List<? extends Number> numberList; // A list of elements that are instances of Number or its subclasses
        List<? super Integer> integerList; // A list of elements that are instances of Integer or its superclasses
        
        // Using the wildcard types
        myList = new ArrayList<>();
        numberList = new ArrayList<Integer>();
        integerList = new ArrayList<Number>();
        
        // Cannot add elements to lists with wildcards (except null)
        // myList.add("Some element"); // Error: Cannot add to a list with an unknown type
        // numberList.add(10); // Error: Cannot add to a list with an unknown subtype
        integerList.add(5); // Valid, because Integer is a superclass of Integer
        
        // Wildcard list iteration (can only read from the lists)
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        
        myList = integers;
        numberList = integers;
        integerList = integers;
        
        // Read from the wildcard lists
        for (Object obj : myList) {
            System.out.println(obj); // Can read elements, but their type is unknown
        }
        
        for (Number num : numberList) {
            System.out.println(num); // Can read elements as Numbers or its subclasses
        }
        
        for (Object obj : integerList) {
            System.out.println(obj); // Can read elements, but their specific type is unknown
        }
    }
}

