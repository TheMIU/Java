package date_and_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DateTimeParserExample {
     public static void main(String[] args) {
        String dateTimeStr = "2023-12-31 23:59:59";
        
        // Define a DateTimeFormatter pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Parse String to LocalDateTime
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeStr, formatter);
        System.out.println("Parsed Date-Time: " + parsedDateTime);
    }
}
