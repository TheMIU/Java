import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Example data: a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Define a predicate to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Use the predicate to filter even numbers from the list
        System.out.println("Even numbers:");
        numbers.stream()
               .filter(isEven)
               .forEach(System.out::println);

        // Define a predicate to check if a number is greater than 5
        Predicate<Integer> isGreaterThan5 = number -> number > 5;

        // Use the predicate to filter numbers greater than 5 from the list
        System.out.println("Numbers greater than 5:");
        numbers.stream()
               .filter(isGreaterThan5)
               .forEach(System.out::println);
    }
}

