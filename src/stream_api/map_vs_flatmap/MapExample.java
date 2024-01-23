package stream_api.map_vs_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API");

        // Using map to transform each element to uppercase
        List<String> uppercasedWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercasedWords); // [JAVA, STREAM, API]
    }
}

/*
 * map transforms each element independently and results in a new stream of the
 * same size.
 */