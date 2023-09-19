package session1_java_basics.practice;

import java.util.Scanner;

public class User {
    static String firstName;
    static String lastName;
    static String email;
    static String password;

    static byte age;
    static boolean isMajor;

    public static void main(String[] args) {
        age = 0b00100001;
        System.out.println(age);

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name:");
        firstName = sc.nextLine();
        System.out.println("Hello "+firstName+"!");


        sc.nextLine();
        sc.close();
    }
}
