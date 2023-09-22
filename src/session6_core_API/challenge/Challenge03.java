package session6_core_API.challenge;

//3. Concatenate Multiple Strings
//Description: Given a list of strings, use StringBuilder to concatenate them into a single string efficiently.

public class Challenge03 {

    public static void main(String[] args) {
        System.out.println(concatStrings(new String[]{"str1", "str2", "str3"}));
    }

    static String concatStrings(String[] strArr) {
        StringBuilder result = new StringBuilder();
        for (String str : strArr) {
            result.append(str);
        }
        return result.toString();
    }
}
