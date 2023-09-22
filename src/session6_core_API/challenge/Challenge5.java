package session6_core_API.challenge;

import java.util.Scanner;

//5. Word Capitalizer
//Description: Write a program that capitalizes the first letter of every word in a sentence using the StringBuilder class.

public class Challenge5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());

        char prevChar = ' ';
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z' && prevChar == ' ') {
                currentChar -= 32;
                input.setCharAt(i, currentChar);
            }
            prevChar = currentChar;
        }

        System.out.println(input);
        sc.close();
    }
}
