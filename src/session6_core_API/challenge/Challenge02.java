package session6_core_API.challenge;

import java.util.Scanner;

//2. Palindrome Checker
//Description: Write a program that checks whether a given string is a palindrome using the StringBuilder class. A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward.

public class Challenge02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        if (isPalindrome(inputString)) {
            System.out.println("its a palindrome");
        } else {
            System.out.println("its NOT a palindrome");
        }
        sc.close();
    }

    static boolean isPalindrome(String input) {
        boolean foundDiff = false;
        for (int i = 0; i < input.length() / 2; i++) {
            char ch1 = input.charAt(i);
            char ch2 = input.charAt(input.length() - 1 - i);
            if (ch1 != ch2) {
                return false;
            }
        }
        return true;
    }
}
