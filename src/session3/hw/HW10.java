package session3.hw;

// 10. Write a program that reverses the sign of an entered integer using unary minus operator.

import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = -n;
        System.out.println(n);
    }
}
