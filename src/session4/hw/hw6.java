package session4.hw;

// 6. Write a Java program where you declare an integer variable temperature. Assign a value to it and print "Hot" if the temperature is more than 30, "Warm" if the temperature is between 20 and 30, and "Cold" if it's less than 20.

import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temperature = sc.nextDouble();

        if (temperature >= 30) {
            System.out.println("Hot");
        } else if (temperature < 30 && temperature >= 20) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }

    }
}
