package generics;

import java.util.List;

// Example interface with a method using a wildcard generic type
interface DataProcessor {
    void process(List<?> items);
}

// Example implementation of the interface
class StringProcessor implements DataProcessor {
    @Override
    public void process(List<?> items) {
        // Process items (printing in this case)
        for (Object item : items) {
            System.out.println(item);
        }
    }
}

public class WildcardGenericInterfaceExample {
    public static void main(String[] args) {
        // Create an instance of the implementation class
        StringProcessor stringProcessor = new StringProcessor();

        // Create a list of strings
        List<String> stringList = List.of("Apple", "Banana", "Cherry");

        // Call the method with the list of strings
        stringProcessor.process(stringList);

        // Create a list of integers
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);

        // Call the method with the list of integers
        stringProcessor.process(integerList);
    }
}

