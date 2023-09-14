package session4.hw;

// 4. Write a Java program where you declare two integer variables heightOne and heightTwo with any values. Use a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the result.

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heightOne = sc.nextDouble();
        double heightTwo = sc.nextDouble();

        double maximumHeight = (heightOne>heightTwo) ? heightOne : heightTwo;
        System.out.println("The bigger height is "+maximumHeight);
    }
}
