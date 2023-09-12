package session3.hw;

// 11. Write a Java program that takes two boolean inputs from a user.
// Apply the logical negation operator (!) to each and print the result.

import java.util.Scanner;

public class HW11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.nextBoolean();
        boolean b2 = sc.nextBoolean();

        b1 = !b1;
        b2 = !b2;
        System.out.println(b1);
        System.out.println(b2);
    }
}
