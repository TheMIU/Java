package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Demo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 5, 1, 3);
        Stream<Integer> stream = numbers.stream();

        // Filter even numbers using Stream API
        Stream<Integer> filteredStream = stream.filter(n -> n % 2 == 0);

        System.out.println(filteredStream.count()); // 2

        // Sort list using Stream API
        List<Integer> sortedList = numbers.stream()
                .sorted() // Sorting the numbers
                .collect(Collectors.toList()); // Collecting them into a list

        System.out.println(sortedList); // [1, 2, 3, 4, 5]
    }
}
