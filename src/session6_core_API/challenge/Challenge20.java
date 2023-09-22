package session6_core_API.challenge;

import java.util.ArrayList;
import java.util.Scanner;

//20. Balanced Parenthesis Checker
//Description: Develop a program that checks if a string has balanced parentheses ((, ), {, }, [, and ]) using StringBuilder. The program should return true if the parentheses in the string are balanced and false otherwise.

public class Challenge20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(checkParenthesis(input));
        sc.close();
    }


    static boolean checkParenthesis(String input) {
        ArrayList<Character> parenthesis = new ArrayList<>(); // could use a stack instead
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // if open add to list
            boolean isOpen = currentChar == '(' || currentChar == '[' || currentChar == '{';
            if (isOpen) {
                parenthesis.add(currentChar);
            }

            // if closed check if it breaks rules
            boolean isClosed = currentChar == ')' || currentChar == ']' || currentChar == '}';
            if (isClosed) {
                if (parenthesis.size() == 0) {
                    return false;
                }
                char lastOpened = parenthesis.remove(parenthesis.size() - 1);
                char currentMirrored = getParenthesisMirrored(currentChar);
                if (lastOpened != currentMirrored) {
                    return false;
                }
            }
        }
        // check if list is empty (remaining opened braces)
        if (parenthesis.size() != 0) {
            return false;
        }
        return true;
    }

    static char getParenthesisMirrored(char parenthesis) {
        switch (parenthesis) {
            case ')' -> {
                return '(';
            }
            case ']' -> {
                return '[';
            }
            case '}' -> {
                return '{';
            }
            case '(' -> {
                return ')';
            }
            case '[' -> {
                return ']';
            }
            case '{' -> {
                return '}';
            }
            default -> {
                return ' ';
            }
        }
    }

}
