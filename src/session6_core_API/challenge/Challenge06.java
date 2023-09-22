package session6_core_API.challenge;

import java.util.Scanner;

//6. String Replacement
//Description: Use the StringBuilder class to replace every occurrence of a substring within a given string with another substring. For instance, replace "cat" with "dog" in the string "The cat sat on the mat."

public class Challenge06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input String");
        StringBuilder input = new StringBuilder(sc.nextLine());
        System.out.println("Enter find String");
        String find = new String(sc.nextLine());
        System.out.println("Enter replace String");
        String replace = new String(sc.nextLine());

        int foundIndex = input.indexOf(find);
        while (foundIndex != -1) {
            input.replace(foundIndex, foundIndex + find.length(), replace);
            foundIndex = input.indexOf(find);
        }

        System.out.println("resulting string is:" + input);
        sc.close();
    }
}
