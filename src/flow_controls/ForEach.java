package flow_controls;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        /*
        * Purpose: Simplifies iteration over collections.
        *
        * Syntax
         
            for (ElementType element : collection) {
                // code
            }
        
        * ElementType: The data type of elements in the collection.
        * element: A variable that represents each element in the collection during each iteration.
        * collection: The array or iterable collection through which you want to iterate.
        
        */

        int[] numbers = { 1, 2, 3, 4, 5 };

        // ForEach loop
        for (int num : numbers) {
            System.out.println(num);
        }

        // also supports lambda expressions
        Arrays.stream(numbers).forEach(num -> {
            System.out.print(num);
        });
    }
}
