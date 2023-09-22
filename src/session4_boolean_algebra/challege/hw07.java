package session4_boolean_algebra.challege;

// 7. Write a Java program that determines the type of a triangle based on its sides. Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle. Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".

import java.util.Scanner;

public class hw07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        int uniqueSides = 3;
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
