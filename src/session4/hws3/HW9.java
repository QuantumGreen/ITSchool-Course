package session4.hws3;

// 9. Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.

import java.util.Scanner;
import java.util.SortedSet;

public class HW9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input breadth");
        double breadth = sc.nextDouble();
        System.out.println("input width");
        double width = sc.nextDouble();
        System.out.println("Area:");
        System.out.println(breadth*width);
    }
}
