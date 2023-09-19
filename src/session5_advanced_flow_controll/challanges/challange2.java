package session5_advanced_flow_controll.challanges;

import java.util.Scanner;

//2. Month Name Finder
//Write a program that asks the user to enter a number between 1 and 12. Print the name of the corresponding month or "Invalid Month" if out of range.

public class challange2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] months = new String[]{
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        int monthNumber = sc.nextInt();
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid Month");
        } else {
            System.out.println(months[monthNumber - 1]);
        }
        sc.close();
    }
}
