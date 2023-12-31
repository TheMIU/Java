package date_and_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        
        // Define a DateTimeFormatter pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format LocalDateTime to String
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date-Time: " + formattedDateTime);
    }
}
