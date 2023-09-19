package session3_operators.challage;

import java.util.Scanner;

// 1. Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Input First Number:");
        n1 = sc.nextInt();
        System.out.println("Input Second Number:");
        n2 = sc.nextInt();

        System.out.println(n1+n2);
        System.out.println(n1-n2);
        System.out.println(n1*n2);
        System.out.println(n1/n2);
        System.out.println(n1%n2);
    }
}
