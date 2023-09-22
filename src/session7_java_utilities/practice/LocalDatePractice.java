package session7_java_utilities.practice;

import java.time.LocalDate;

public class LocalDatePractice {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();

        LocalDate gabiBirthdate = LocalDate.parse("2000-09-22");
        System.out.println(gabiBirthdate.getMonth());

                // la multi ani gabi!
        LocalDate tenDaysAfter = ld.plusDays(10);
        if(ld.isBefore(tenDaysAfter)){
            System.out.println("it is Before");
        }
    }
}
