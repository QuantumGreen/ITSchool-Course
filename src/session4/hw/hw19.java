package session4.hw;

// 19. Write a Java program that takes an integer variable age as input. Use a ternary operator to classify the person into one of the following categories: "Child" (age < 12), "Teenager" (age between 12 and 17), "Adult" (age between 18 and 64), and "Senior" (age 65 and above). Print the resulting classification.

import java.util.Scanner;

public class hw19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // "Child" (age < 12),
        // "Teenager" (age between 12 and 17),
        // "Adult" (age between 18 and 64), and
        // "Senior" (age 65 and above).

        if (age < 12) {
            System.out.println("Child");
        } else if (age <= 17) {
            System.out.println("Teenager");
        } else if (age <= 64) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }
}
