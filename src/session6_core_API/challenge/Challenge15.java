package session6_core_API.challenge;

import java.util.Scanner;

//15. Anagram Checker
//Description: Develop a program that checks if two provided strings are anagrams of each other using the StringBuilder class. Anagrams are words or phrases made up of the same characters.

public class Challenge15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        int[] input1LetterFreq = getLetterFrequency(input1);
        int[] input2LetterFreq = getLetterFrequency(input2);

        boolean isAnagram = true;
        for (int i = 0; i < input1LetterFreq.length; i++) {
            int freq1 = input1LetterFreq[i];
            int freq2 = input2LetterFreq[i];
            if (freq1 != freq2) {
                isAnagram = false;
            }
        }

        System.out.println(isAnagram);
        sc.close();
    }

    // could reuse code from challange 9 Frequency Counter but i want to do something else instead
    static int[] getLetterFrequency(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char currentChar = Character.toUpperCase(str.charAt(i));
            if (Character.isLetter(currentChar)) {
                freq[currentChar - 'A']++;
            }
        }
        return freq;
    }
}
