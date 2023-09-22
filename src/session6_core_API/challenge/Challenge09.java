package session6_core_API.challenge;

import java.util.HashMap;
import java.util.Scanner;

//9. Frequency Counter
//Description: Using StringBuilder, write a program that counts the frequency of each character in a string.

public class Challenge09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Character, Integer> charFrequency = new HashMap<>();

        StringBuilder input = new StringBuilder(sc.nextLine());

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!charFrequency.containsKey(currentChar)) {
                charFrequency.put(currentChar, 0);
            }
            int freq = charFrequency.get(currentChar);
            charFrequency.put(currentChar, freq + 1);
        }

        System.out.println(charFrequency);
        sc.close();
    }
}
