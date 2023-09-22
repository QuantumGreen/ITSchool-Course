package session6_core_API.challenge;

import java.util.Scanner;

//

public class ChallengeT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
        }
        System.out.println(input);
        sc.close();
    }
}
