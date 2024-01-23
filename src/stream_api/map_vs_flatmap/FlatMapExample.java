package stream_api.map_vs_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9));

        // Using flatMap to flatten the nested lists into a single stream
        List<Integer> flattenedNumbers = numbers.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flattenedNumbers); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}

/*
 * flatMap transforms each element into a stream and then flattens these streams
 * into a single stream. The resulting stream may have a different size than the
 * original stream.
 */