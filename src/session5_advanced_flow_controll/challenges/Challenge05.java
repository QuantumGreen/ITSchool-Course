package session5_advanced_flow_controll.challenges;

import java.util.Scanner;

//5. Fibonacci Series Generator
//Write a program that generates and prints the first n numbers of the Fibonacci series, where n is provided by the user.

public class Challenge05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long a = 0;
        long b = 1;

        for (int i = 0; i < n; i++) {
            if (a < 0) {
                System.out.println();
                System.out.println("Ran Outta' Numbers");
                System.out.println("Got to " + i + " before an overflow");
                System.out.println("the current number is now equal to " + a);
                System.out.println("fun fact: python may be slow, without bindings from c++ (see numpy)");
                System.out.println("but you don't get this problem in python numbers simply grow as big as they need");
                break;
            }
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }
}
