package session6_core_API.challenge;

import java.util.Scanner;

//21. Leetcode problem, Integer To Roman: https://leetcode.com/problems/integer-to-roman/

//already did it :)

public class Challenge21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(intToRoman(sc.nextInt()));
        sc.close();
    }

    static int[] val = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    static String[] symb = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    static public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        for (int i = val.length - 1; i >= 0; i--) {
            int curval = val[i];
            while (num >= curval) {
                num -= curval;
                res.append(symb[i]);
            }
        }
        return res.toString();
    }
}
