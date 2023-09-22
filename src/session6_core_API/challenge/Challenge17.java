package session6_core_API.challenge;

import java.util.Scanner;

//17. String Interleaver
//Description: Write a program using StringBuilder that interleaves two strings. For instance, given "abc" and "123", the result should be "a1b2c3".

public class Challenge17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input1 = new StringBuilder(sc.nextLine());
        StringBuilder input2 = new StringBuilder(sc.nextLine());
        StringBuilder output = new StringBuilder();

        boolean in1Smaller = input1.length() <= input2.length();
        int minLen = in1Smaller ? input1.length() : input2.length();
        for (int i = 0; i < minLen; i++) {
            output.append(input1.charAt(i));
            output.append(input2.charAt(i));
        }
        if (in1Smaller) {
            output.append(input2.substring(input1.length(), input2.length()));
        } else {
            output.append(input1.substring(input2.length(), input1.length()));
        }
        System.out.println(output);
        sc.close();
    }
}
