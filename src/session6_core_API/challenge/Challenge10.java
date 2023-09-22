package session6_core_API.challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

//10. Morse Code Converter
//Description: Create a program that takes in a string and converts it to Morse code using the StringBuilder class. For simplicity, you can assume the input string only contains alphabets and numbers.

public class Challenge10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, String> morseMap = new HashMap<>();
        StringBuilder input = new StringBuilder(sc.nextLine());

        File morseFile = new File("src/session6_core_API/challenge/morse code.in");
        try {
            Scanner morseScanner = new Scanner(morseFile);
            while (morseScanner.hasNext()) {
                char currentChar = morseScanner.next().charAt(0);
                String morseCode = morseScanner.next();
                morseMap.put(currentChar, morseCode);
            }
            morseScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == ' ') {
                input.replace(i, i + 1, "/ ");
                i++;
                continue;
            }
            if (currentChar >= 'a' && currentChar <= 'z') {
                currentChar -= 32;
            }
            if (morseMap.containsKey(currentChar)) {
                String morseCode = morseMap.get(currentChar);
                input.replace(i, i + 1, morseCode);
                i += morseCode.length();
                input.insert(i, ' ');
            }
        }

        System.out.println(input);

        sc.close();
    }
}
