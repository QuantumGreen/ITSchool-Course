package session4_boolean_algebra.challege;

// 21. Write a Java program that takes a double variable score representing a student’s score on a test. Use a ternary operator to classify the score into letter grades A, B, C, D, or F according to the following scale:
//
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
//
//Print the resulting letter grade.

import java.util.Scanner;

public class hw21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the score:");
        double score = sc.nextDouble();

        char grade =
                (score>=90) ? 'A' :
                        (score>=80) ? 'B' :
                                (score>=70) ? 'C' :
                                        (score>=60) ? 'D' : 'F'
        ;
        System.out.println(score+" restults in "+grade);
    }
}
