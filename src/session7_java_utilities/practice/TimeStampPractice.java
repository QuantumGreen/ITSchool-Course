package session7_java_utilities.practice;

import java.sql.Time;
import java.sql.Timestamp;

public class TimeStampPractice {

    public static void main(String[] args) {
        Timestamp currentTimeStamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Current timestamp: " + currentTimeStamp);

        Timestamp timesteamp1 = Timestamp.valueOf("2023-09=20 15:20:30.214");
        Timestamp timesteamp2 = Timestamp.valueOf("2023-09=20 15:21:30.214");

        long differenceInSeconds = timesteamp2.getTime() - timesteamp1.getTime()/1000;
        System.out.println(differenceInSeconds);
    }
}
