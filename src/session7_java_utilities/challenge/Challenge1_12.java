package session7_java_utilities.challenge;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.TimeZone;

public class Challenge1_12 {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("1. Displaying Today's Date");
        displayTodaysDate();
        System.out.println();

        System.out.println("2. Date Decomposition");
        displayDateComponents(LocalDate.now());
        System.out.println();

        System.out.println("3. Create a Specific Date");
        System.out.println(createSpecificDate());
        System.out.println();

        System.out.println("4. Comparing User-Entered Dates");
        System.out.println(areDatesEqual());
        System.out.println();

        System.out.println("5. Is Today a Specific Date?");
        System.out.println(isTodaySpecificDate());
        System.out.println();

        System.out.println("6. Getting Current Time");
        displayCurrentTime();
        System.out.println();

        System.out.println("7. Date Arithmetic");
        System.out.println("Adding 1 week to " + LocalDate.now());
        System.out.println(addWeeksToToday(1));
        System.out.println();

        System.out.println("8. Weekday Identifier");
        System.out.println(findDayOfWeek(LocalDate.now()));
        System.out.println();

        System.out.println("9. Interval Between Dates");
        System.out.println(daysBetween());
        System.out.println();

        System.out.println("10. Date Authenticator");
        System.out.println(isValidDate());
        System.out.println();

        System.out.println("11. Duration Since");
        elapsedTimeSince(LocalTime.now().minusHours(1).minusMinutes(2).minusSeconds(3));
        System.out.println();

        System.out.println("12. Time Conversion Across Zones");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String dateTimeString = scanner.nextLine();
//        String ZoneIdString = scanner.nextLine();
//        LocalDateTime date = LocalDateTime.parse(dateTimeString,dateFormatter);
        String ZoneIdString = "EST";
        LocalDateTime date = LocalDateTime.now();
        System.out.println();
        System.out.println(dateFormatter.format(convertToTimeZone(LocalDateTime.now(), ZoneIdString)));

        scanner.close();
    }

    // 1. Displaying Today's Date
    //Description: Write a method named displayTodaysDate that, when called, prints the current date to the console.
    //Expected Output: Today's date in the format YYYY-MM-DD.
    static void displayTodaysDate() {
        System.out.println(LocalDate.now());
    }

    //2. Date Decomposition
    //Description: Write a method named displayDateComponents that accepts a date as an argument and prints its year, month, and day components separately.
    //Input: A date in the format YYYY-MM-DD.
    //Expected Output:
    //makefile
    //Copy code
    //Year: YYYY
    //Month: MM
    //Day: DD
    static void displayDateComponents(LocalDate date) {
        System.out.printf("Year: %04d\n", date.getYear());
        System.out.printf("Month: %02d\n", date.getMonthValue());
        System.out.printf("Day: %02d\n", date.getDayOfMonth());
    }

    //3. Create a Specific Date
    //Description: Write a method named createSpecificDate that returns a date object representing 19th August 2025.
    //Expected Output: A date object for 2025-8-19.
    static LocalDate createSpecificDate() {
        return LocalDate.of(2025, Month.AUGUST, 19);
    }

    //4. Comparing User-Entered Dates
    //Description: Write a method named areDatesEqual that reads two dates from the console and returns true if they are equal, and false otherwise.
    //Input: Two dates entered by the user in the format YYYY-MM-DD.
    //Expected Output:
    //true if both dates are equal.
    //false if they are different.
    static boolean areDatesEqual() {
        // LocalDate date1 = LocalDate.parse(scanner.nextLine());
        // LocalDate date2 = LocalDate.parse(scanner.nextLine());
        LocalDate date1 = LocalDate.parse("2000-12-02");
        LocalDate date2 = LocalDate.parse("2000-12-02");
        return date1.isEqual(date2); // looked up difference, isEqual is better because it checks the day instead of checking a hashcode
    }

    //5. Is Today a Specific Date?
    //Description: Write a method named isTodaySpecificDate that checks if today's date is 10th December 2019.
    //Expected Output:
    //true if today's date is 2019-12-10.
    //false otherwise.
    static boolean isTodaySpecificDate() {
        LocalDate date = LocalDate.of(2019, Month.DECEMBER, 10);
        System.out.println(date);
        return LocalDate.now().isEqual(date);
    }

    //6. Getting Current Time
    //Description: Write a method named displayCurrentTime that prints the current time to the console.
    //Expected Output: The current time in the format HH:MM:SS.
    static void displayCurrentTime() {
        System.out.println(LocalTime.now());
    }

    // 7. Date Arithmetic
    //Description: Write a method named addWeeksToToday that accepts an integer as its argument. This integer denotes the number of weeks. The method should add this number of weeks to today's date and return the resultant date.
    //Input: An integer n (e.g., 4).
    //Expected Output: A date object that is n weeks from today.
    static LocalDate addWeeksToToday(int weeks) {
        return LocalDate.now().plusWeeks(weeks);
    }

    //8. Weekday Identifier
    //Description: Construct a method named findDayOfWeek that takes in a date and returns the specific day of the week (e.g., Monday, Tuesday, etc.) for that date.
    //Input: A date in the format YYYY-MM-DD.
    //Expected Output: The day of the week in string format (e.g., "Wednesday").
    static DayOfWeek findDayOfWeek(LocalDate date) {
        return date.getDayOfWeek();
    }

    //9. Interval Between Dates
    //Description: Design a method titled daysBetween that reads two dates from the console and computes the total number of days between them.
    //Input: Two dates given by the user in the format YYYY-MM-DD.
    //Expected Output: An integer showcasing the difference in days between the two dates.
    static long daysBetween() {
        // LocalDateTime date1 = LocalDate.parse(scanner.nextLine()).atStartOfDay();
        // LocalDateTime date2 = LocalDate.parse(scanner.nextLine()).atStartOfDay();
        LocalDateTime date1 = LocalDate.now().atStartOfDay();
        LocalDateTime date2 = LocalDate.now().atStartOfDay().plusDays(1);
        // Duration.between doesnt work with LocalDate, needs
        return Duration.between(date1, date2).toDays();
        // could do
        // return ChronoUnit.DAYS.between(date1, date2);
        // instead
    }

    // 10. Date Authenticator
    //Description: Engineer a method named isValidDate that captures a date string from the console and assesses if it conforms to a valid date format (YYYY-MM-DD). The method should also consider leap years when validating February dates.
    //Input: A string of a date from the console.
    //Expected Output:
    //true if the input adheres to the date format and denotes a genuine date.
    //false if otherwise.
    static boolean isValidDate() {
        // getting an error "java.util.NoSuchElementException: No line found" due to closing scanner in other functions,
        // found solution close scanner only once
        // String dateString = scanner.nextLine();
        String dateString = "2000-13-21";
        try {
            LocalDate.parse(dateString);
        } catch (DateTimeException e) {
            return false;
        }
        return true;
    }

    //11. Duration Since
    //Description: Construct a method dubbed elapsedTimeSince that ingests a prior time (in the HH:MM:SS format) as its input and displays the time duration from that moment to the present.
    //Input: A time given in the format HH:MM:SS.
    //Expected Output: The time span given as X hours, Y minutes, Z seconds.
    static void elapsedTimeSince(LocalTime priorTime) {
        Duration duration = Duration.between(priorTime, LocalTime.now());
        System.out.println(duration.toHours() + " hours");
        System.out.println(duration.toMinutesPart() + " minutes");
        System.out.println(duration.toSecondsPart() + " seconds");
    }

    //12. Time Conversion Across Zones
    //Description: Develop a method named convertToTimeZone that collects a date and time from the console in the pattern YYYY-MM-DD HH:MM:SS and a timezone (like "EST", "PST"). The objective is to transmute the specified date and time to align with the provided timezone and then showcase the result.
    //Input:
    //Date and time structured as YYYY-MM-DD HH:MM:SS.
    //A string indicating the timezone (e.g., "EST").
    //Expected Output: The recalibrated date and time synchronized with the inputted timezone.
    static LocalDateTime convertToTimeZone(LocalDateTime dateTime, String ZoneIdString) {
        ZoneId zoneid = ZoneId.of(ZoneId.SHORT_IDS.get(ZoneIdString));
        System.out.println(dateTime);
        System.out.println(zoneid);
        ZonedDateTime zonedDateTimeHere = dateTime.atZone(ZoneId.systemDefault());
        ZonedDateTime zonedDateTimeOther = zonedDateTimeHere.withZoneSameInstant(zoneid);
        return zonedDateTimeOther.toLocalDateTime();
    }
}
