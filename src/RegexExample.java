import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExample {
    public static void main(String[] args) {
        String input = "Hello, Java! Regular expressions are powerful.";

        // Define a pattern to match words
        Pattern wordPattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = wordPattern.matcher(input);

        // Find and print all words in the input
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}

/*
 * Output
 * 
 * Found: Hello
 * Found: Java
 * Found: Regular
 * Found: expressions
 * Found: are
 * Found: powerful
 */