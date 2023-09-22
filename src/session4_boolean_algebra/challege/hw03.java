package session4_boolean_algebra.challege;

// 3. Write a Java program that declares an integer variable age with a value of 20. Print a statement saying "I am adult" if age is 18 or more, else print "I am not an adult".

import java.util.Scanner;

public class hw03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("I'm an adult");
        } else {
            System.out.println("I'm a minor");
        }
    }
}
