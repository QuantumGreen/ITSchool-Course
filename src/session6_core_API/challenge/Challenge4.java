package session6_core_API.challenge;

import java.util.*;

//4. Removing Vowels
//Description: Create a Java program that uses the StringBuilder class to remove all the vowels from an input string.

public class Challenge4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> vowels = new HashSet<>();
        vowels.addAll(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        StringBuilder stringBuilder = new StringBuilder(sc.nextLine());

        for (int i = 0; i < stringBuilder.length(); i++) {
            char currentChar = stringBuilder.charAt(i);
            if (vowels.contains(currentChar)) {
                stringBuilder.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(stringBuilder);

        // a simple naive (yet more readable) approach would be to do
        // String[] vowels = new String[]{"a","e","i","o","u"};
        // for(String vowel : vowels){
        //     while(stringBuilder.indexOf(vowel)!=-1){
        //         stringBuilder.deleteCharAt(stringBuilder.indexOf(vowel));
        //     }
        // }

        sc.close();
    }
}
