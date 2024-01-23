package stream_api.filter_map_reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using reduce to get the sum of all elements
        Optional<Integer> sum = numbers.stream()
                .reduce(Integer::sum);

        sum.ifPresent(System.out::println); // Output: 15
    }
}
