package session6_core_API.challenge;

import java.util.Scanner;
import java.util.Stack;

//8. Inserting at Index
//Description: Write a Java program that inserts a given string into another string at a specified index using the StringBuilder class.

public class Challenge8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());
        String strInsert = new String(sc.nextLine());
        int indexToInsert = sc.nextInt();
        input.insert(indexToInsert, strInsert);
        System.out.println(input);
        sc.close();
    }
}
