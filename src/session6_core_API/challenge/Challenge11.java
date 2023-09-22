package session6_core_API.challenge;

import java.util.Scanner;

//11. Encode and Decode using Caesar Cipher
//Description: Implement a Caesar Cipher encoder and decoder using the StringBuilder class. The Caesar Cipher involves rotating letters a certain number of steps down or up the alphabet. For example, with a shift of 1, 'A' would be replaced by 'B', 'B' would become 'C', and so on.

public class Challenge11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());
        encodeCaesar(input, 3);
        System.out.println(input);
        decodeCaesar(input, 3);
        System.out.println(input);
        sc.close();
    }

    static void encodeCaesar(StringBuilder input, int shift) {
        if (shift < 0) {
            shift %= 26;
            shift = 26 + shift;
        }
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar)) {
                int charUpper = Character.toUpperCase(currentChar);
                int charUpperIndex = charUpper - 'A';
                int targetCharIndex = (charUpperIndex + shift) % 26;
                int offset = targetCharIndex - charUpperIndex;
                currentChar += offset;
                input.setCharAt(i, currentChar);
            }
        }
    }


    static void decodeCaesar(StringBuilder input, int shift) {
        encodeCaesar(input, -shift);
    }

}
