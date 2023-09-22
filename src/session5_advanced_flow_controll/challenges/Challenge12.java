package session5_advanced_flow_controll.challenges;

import java.util.Scanner;

//12. Continue Statement
//Create a program that asks the user for 10 numbers. Print the sum of all numbers that are greater than 5. If the user enters a number less than or equal to 5, use the continue statement to skip the addition for that number.

public class Challenge12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num <= 5) {
                continue;
            }
            sum += num;
        }
        System.out.println(sum);
        sc.close();
    }
}
