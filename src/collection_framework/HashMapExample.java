package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("Alice", 25);
        hashMap.put("Charlie", 22);
        hashMap.put("Bob", 30);

        // Accessing elements - Constant-time complexity
        int ageOfBob = hashMap.get("Bob");
        System.out.println("Age of Bob: " + ageOfBob);

        // Note: HashMap does not guarantee any specific order
        System.out.println("Elements in HashMap: " + hashMap);
    }
}
