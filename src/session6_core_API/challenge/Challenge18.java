package session6_core_API.challenge;

import java.util.Scanner;

// 18. Pattern Recognition
//Description: Design a Java program using StringBuilder that checks if a given pattern repeats in a string. For instance, given the string "ababab", the repeating pattern is "ab".

// ah a backwards search tree, classic
// oh the pattern is given, then it's much simpler

public class Challenge18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());
        String pattern = sc.nextLine();
        boolean output = checkRepeatingPattern(input, pattern);
        System.out.println(output);
        sc.close();
    }

    static boolean checkRepeatingPattern(StringBuilder input, String pattern) {
        int idx1 = input.indexOf(pattern);
        if (idx1 != -1) {
            int idx2 = input.indexOf(pattern, idx1 + 1);
            if (idx2 != -1) {
                return true;
            }
        }
        return false;
    }
}
