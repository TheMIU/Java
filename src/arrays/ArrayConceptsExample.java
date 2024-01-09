package arrays;

import java.util.Arrays;

public class ArrayConceptsExample {
    public static void main(String[] args) {
        // Creating an array of integers
        int[] numbers = {5, 2, 9, 1, 7};

        // Accessing elements by index
        System.out.println("Element at index 2: " + numbers[2]); // Output: 9

        // Modifying an element
        numbers[3] = 10;
        System.out.println("Modified array: " + Arrays.toString(numbers)); // Output: [5, 2, 9, 10, 7]

        // Finding array length
        int length = numbers.length;
        System.out.println("Array length: " + length); // Output: 5

        // Iterating through the array
        System.out.print("Array elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // Output: 5 2 9 10 7

        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers)); // Output: [2, 5, 7, 9, 10]

        // Searching for an element
        int searchElement = 7;
        int index = Arrays.binarySearch(numbers, searchElement);
        System.out.println("Index of " + searchElement + ": " + index); // Output: Index of 7: 2

        // Creating an array of strings
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        // Multi-dimensional array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Element at row 1, column 2: " + matrix[1][2]); // Output: 6
    }
}

