package session7_java_utilities.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimePractice {

    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime currentPlusSome = current.plusHours(10);
        currentPlusSome = current.plusMinutes(32);
        System.out.println("Current date and time: " + current);
        System.out.println("Current date and time + 10h and 32 min: " + current);
        System.out.println();

        LocalDate datePart = current.toLocalDate();
        LocalTime TimePart = current.toLocalTime();
        System.out.println("Date :" + datePart);
        System.out.println("Time :" + TimePart);

        checkBeforeAndAfter();

        System.out.println("Trying to find something");

        String dateTimeValue = "2025-01-01 10:30";
        long start = System.currentTimeMillis();
        convertStringToLocalDateTime(dateTimeValue);
        long end = System.currentTimeMillis();
        System.out.println("Total time of execution: " + (end-start));
    }

    private static void convertStringToLocalDateTime(String dateTime){
        //2025-01-01 10:30;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTimeConverted = LocalDateTime.parse(dateTime,formatter);
        System.out.println("Parsed LocalDateTime: " + dateTimeConverted);
    }

    public static void checkBeforeAndAfter() {
        LocalDateTime dateTime = LocalDateTime.of(2022,10,2,3,43,2,32);
        System.out.println(dateTime);
        if (dateTime.isBefore(LocalDateTime.now())){
            System.out.println(dateTime + " is before" + LocalDateTime.now());
        }
    }
}
