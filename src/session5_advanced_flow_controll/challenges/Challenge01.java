package session5_advanced_flow_controll.challenges;

//1. Even or Odd Checker
//Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd, print "Odd".

import java.util.Scanner;

public class Challenge01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }
}
