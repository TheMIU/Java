package generics.generic_type_vs_method;

import java.util.Arrays;

/*
    Generic Method:
    Operates on different types independently with its own set of type parameters
*/

public class GenericMethodExample {
    // Generic method to swap elements in an array
    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // Creating an array of integers
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));

        // Swapping elements using the generic method
        swap(intArray, 1, 3);

        System.out.println("After Swapping: " + Arrays.toString(intArray));

        // Creating an array of strings
        String[] strArray = { "apple", "banana", "cherry" };
        System.out.println("Original String Array: " + Arrays.toString(strArray));

        // Swapping elements using the generic method
        swap(strArray, 0, 2);

        System.out.println("After Swapping: " + Arrays.toString(strArray));
    }
}

// Original Integer Array: [1, 2, 3, 4, 5]
// After Swapping: [1, 4, 3, 2, 5]
// Original String Array: [apple, banana, cherry]
// After Swapping: [cherry, banana, apple]