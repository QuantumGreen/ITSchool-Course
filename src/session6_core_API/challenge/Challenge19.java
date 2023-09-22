package session6_core_API.challenge;

import java.util.Scanner;

//19. Encode Strings with Run-Length Encoding (RLE)
//Description: Using StringBuilder, write a program that implements the Run-Length Encoding algorithm. For instance, the string "AAABBBCCDAA" would be encoded as "3A3B2C1D2A".

public class Challenge19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());
        StringBuilder output = new StringBuilder();

        //breaks if input is empty
        char prevChar = input.charAt(0);
        int counter = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == prevChar) {
                counter++;
            } else {
                output.append(counter);
                output.append(prevChar);
                counter = 1;
            }
            prevChar = currentChar;
        }
        output.append(counter);
        output.append(prevChar);


        System.out.println(output);
        sc.close();
    }
}
