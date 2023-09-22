package session6_core_API.challenge;

import java.util.Scanner;

//13. Expand Compressed Strings
//Description: Given a compressed string like "a3b2c4", expand it to "aaabbc", making use of the StringBuilder class.

public class Challenge13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i += 2) {
            char currentChar = input.charAt(i);
            int repeatNum = Character.getNumericValue(input.charAt(i + 1));
            for (int j = 0; j < repeatNum; j++) {
                output.append(currentChar);
            }
        }
        System.out.println(output);
        sc.close();
    }
}
