package collection_framework;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs
        treeMap.put("Alice", 25);
        treeMap.put("Charlie", 22);
        treeMap.put("Bob", 30);

        // Accessing elements - Logarithmic-time complexity
        int ageOfBob = treeMap.get("Bob");
        System.out.println("Age of Bob: " + ageOfBob);

        // TreeMap maintains elements in sorted order based on keys
        System.out.println("Elements in TreeMap: " + treeMap);
    }
}
