package session3_operators.challage;

// 6. Write a Java program that takes two numbers from the user and uses relational operators
// to display whether the first number is greater than, less than, or equal to the second number.

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.printf("%d is bigger than %d\n", n1, n2);
        } else if (n1 == n2) {
            System.out.printf("%d is equal to %d\n", n1, n2);
        } else {
            System.out.printf("%d is smaller than %d\n", n1, n2);
        }

    }
}
