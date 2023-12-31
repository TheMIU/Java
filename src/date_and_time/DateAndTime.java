package date_and_time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

class DateAndTime {
    public static void main(String[] args) {
        System.out.println("========== LocalDate, LocalTime, and LocalDateTime: ==========");
        LocalDate currentDate = LocalDate.now(); // Current date
        System.out.println("Current Date: " + currentDate);

        LocalDate specificDate = LocalDate.of(2000, 10, 31); // Specific date
        System.out.println("Specific Date: " + specificDate);

        LocalTime currentTime = LocalTime.now(); // Current time
        System.out.println("Current Time: " + currentTime);

        LocalTime specificTime = LocalTime.of(23, 59, 59, 999); // Specific time
        System.out.println("Specific Time: " + specificTime);

        LocalDateTime currentDateTime = LocalDateTime.now(); // Current date and time
        System.out.println("Current Date and Time: " + currentDateTime);

        LocalDateTime specificDateTime = LocalDateTime.of(2000, 10, 31, 23, 59, 59, 999); // Specific date and time
        System.out.println("Specific Date and Time: " + specificDateTime);


        System.out.println("\n========== Instant and Duration: ==========");
        // ( Instant -> Machine-Readable Time | Duration -> Amount of Time )

        Instant instant = Instant.now(); // Current instant (machine-readable)
        System.out.println("Current Instant: " + instant);

        Instant start = Instant.now(); // Start time
        
        System.out.println("Printing numbers");
        for (int i = 0; i < 100; i++) { // Perform some task...
            System.out.print(i + " ");
        }
        System.out.println();

        Instant end = Instant.now(); // End time

        Duration timeElapsed = Duration.between(start, end); // Duration between start and end
        System.out.println("Time Elapsed: " + timeElapsed.toMillis() + " milliseconds");


        System.out.println("\n========== ZonedDateTime and OffsetDateTime: ==========");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(); // Current date-time with time-zone
        System.out.println("Current Zoned Date-Time: " + zonedDateTime);

        OffsetDateTime offsetDateTime = OffsetDateTime.now(); // Current date-time with offset
        System.out.println("Current Offset Date-Time: " + offsetDateTime);
    }
}
