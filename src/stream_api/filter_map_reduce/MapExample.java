package stream_api.filter_map_reduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API");

        // Using map to transform each string to uppercase
        List<String> uppercasedWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercasedWords); // [JAVA, STREAM, API]
    }
}
