package session5_advanced_flow_controll.challanges;

import java.util.Scanner;

//11. Break Statement
//Write a program that prompts the user to enter numbers. Calculate the average of these numbers. If the user enters 0, break out of the input loop and then print the average of the numbers entered so far.

public class challange11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float avr = 0;
        int count = 0;
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            avr += num;
            count++;
        }
        avr /= count;
        System.out.println(avr);
        sc.close();
    }
}
