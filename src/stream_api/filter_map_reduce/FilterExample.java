package stream_api.filter_map_reduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using filter to get only even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers); // [2, 4, 6, 8, 10]
    }
}
