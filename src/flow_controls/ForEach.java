package flow_controls;

public class ForEach {
    public static void main(String[] args) {
        /*
        * Syntax
         
            for (ElementType element : collection) {
                // code
            }
        
        * ElementType: The data type of elements in the collection.
        * element: A variable that represents each element in the collection during each iteration.
        * collection: The array or iterable collection through which you want to iterate.
        
        */
        
        int[] numbers = {1, 2, 3, 4, 5};

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
