package session6_core_API.challenge;

import java.util.Scanner;

//12. CamelCase to Snake_case Converter
//Description: Write a program using StringBuilder to convert a given CamelCase string to snake_case. For instance, "thisIsCamelCase" would become "this_is_camel_case".

public class Challenge12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                input.replace(i, i + 1, "_" + Character.toLowerCase(currentChar));
                i++;
            }
        }
        System.out.println(input);
        sc.close();
    }
}
