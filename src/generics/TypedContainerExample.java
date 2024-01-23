package generics;

import java.util.ArrayList;
import java.util.List;

public class TypedContainerExample {
    public static void main(String[] args) {
        // Using a parameterized type to restrict the allowed types
        List<Integer> integerList = new ArrayList<>();
        integerList.add(42);
        integerList.add(200);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(12.5);
        doubleList.add(10.5);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");

        // Now, create a container that only accepts lists of Numbers or its subtypes
        List<? extends Number> heterogeneousList;

        // Assigning the integerList to the heterogeneousList
        heterogeneousList = integerList;
        printElements(heterogeneousList); // It can hold elements of Integer or its subtypes

        heterogeneousList = doubleList;
        printElements(heterogeneousList); // It can hold elements of Double or its subtypes

        // Uncommenting the line below would result in a compilation error
        // heterogeneousList = stringList; // Error: incompatible types
    }

    // A method to print elements from a list with an upper-bounded wildcard
    public static void printElements(List<? extends Number> list) {
        for (Number element : list) {
            System.out.println(element);
        }
    }
}
