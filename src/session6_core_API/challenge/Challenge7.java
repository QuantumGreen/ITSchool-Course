package session6_core_API.challenge;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//7. Duplicate Character Remover
//Description: Design a program using StringBuilder that removes duplicate characters from a string. For example, "balloon" should become "balon".

public class Challenge7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> foundChars = new HashSet<>();

        StringBuilder input = new StringBuilder(sc.nextLine());

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (foundChars.contains(currentChar)) {
                input.deleteCharAt(i);
                i--;
            } else {
                foundChars.add(currentChar);
            }
        }

        System.out.println(input);

        sc.close();
    }
}
