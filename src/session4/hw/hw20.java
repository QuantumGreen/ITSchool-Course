package session4.hw;

// 20. Write a Java program that takes three integer variables a, b, and c as input. Use nested ternary operators to find and print the largest number among the three.

import java.util.Scanner;

public class hw20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int mrBigCheeseNumber = (a>b) ?
                (a>c) ? a : c
                :
                (b>c) ? b : c;
        System.out.println(mrBigCheeseNumber);
    }
}
