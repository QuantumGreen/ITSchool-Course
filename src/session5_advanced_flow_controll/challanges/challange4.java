package session5_advanced_flow_controll.challanges;

import java.util.Scanner;

//4. String Reverser
//Ask the user to enter a string. Print the reversed version of this string.

public class challange4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a string: ");
        String userString = sc.nextLine();
        StringBuilder userStringReversedBuilder = new StringBuilder(userString.length());
        for (int i = userString.length() - 1; i >= 0; i--) {
            userStringReversedBuilder.append(userString.charAt(i));
        }
        String userStringReversed = userStringReversedBuilder.toString();
        System.out.println(userStringReversed);

//        :p
//        StringBuilder userStringReversedBuilder = new StringBuilder(userString);
//        userStringReversedBuilder.reverse();
//        String userStringReversed = userStringReversedBuilder.toString();
//        System.out.println(userStringReversed);
        sc.close();
    }
}
