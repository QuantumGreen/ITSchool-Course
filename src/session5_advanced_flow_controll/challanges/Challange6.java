package session5_advanced_flow_controll.challanges;

import java.util.Scanner;

//6. While Loop
//Write a program that asks the user to enter numbers. The program should continue prompting the user until they enter -1. After they enter -1, print the sum of all numbers entered (excluding -1).

public class Challange6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        while (num != -1) {
            sum += num;
            num = sc.nextInt();
        }
        System.out.println(sum);
        sc.close();
    }
}
