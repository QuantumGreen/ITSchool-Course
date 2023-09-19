package session4_boolean_algebra.challage;

// 8. Write a Java program to calculate the factorial of a number using a for loop. Declare an integer variable number and assign a value to it. Then calculate and print the factorial of number.

import java.util.Scanner;

public class hw8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int res = 1;
        for(int i=1;i<=number;i++){
            res *= i;
        }
        System.out.printf("Factorial of %d is %d\n",number,res);
    }
}
