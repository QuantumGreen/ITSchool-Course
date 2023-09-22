package session6_core_API.challenge;

import java.util.Scanner;

//1. Reverse a String
//Description: Use the StringBuilder class to write a program that reverses an input string. For example, the input "hello" should return "olleh".

public class Challenge01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        sc.close();
    }
}
