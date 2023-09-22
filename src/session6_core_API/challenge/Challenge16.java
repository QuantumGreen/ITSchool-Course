package session6_core_API.challenge;

import java.util.Scanner;

//16. Toggling Case
//Description: Design a program using StringBuilder that toggles the case of every character in a given string. For example, "HelLo" should become "hELlO".

public class Challenge16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                currentChar = Character.toLowerCase(currentChar);
            } else {
                currentChar = Character.toUpperCase(currentChar);
            }

            input.setCharAt(i, currentChar);
        }
        System.out.println(input);
        sc.close();
    }
}
