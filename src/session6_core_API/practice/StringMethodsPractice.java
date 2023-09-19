package session6_core_API.practice;

public class StringMethodsPractice {

    public static void main(String[] args) {
        printStringLength("test");
        printStringCharAt("Alice", 1);
        printStringIndexAt("Alice", "i");
        printSubstring("hello world", 6, 6 + 5);

        String name = "John Doe";
        System.out.println(name.substring(5, 5 + 3));
        System.out.println(name.substring(5));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name + "contains Doe: " + name.contains("Doe"));

        System.out.println("Replaced 'e' from Hello with 'a': "+"Hello".replace('e','a'));

        String email = "user@google.com";
        String domain = email.substring(email.indexOf('@') + 1);
        System.out.println("The domain name is: " + domain);
    }

    private static void printStringLength(String input) {
        System.out.println("String input length: " + input.length());
    }

    private static void printStringCharAt(String input, int index) {
        System.out.println("The character at index " + index + " is: " + input.charAt(index));
    }

    private static void printStringIndexAt(String input, String target) {
        System.out.println("The index of <" + target + "> is: " + input.indexOf(target));
    }

    private static void printSubstring(String input, int startIndex, int endIndex) {
        System.out.println(input.substring(startIndex, endIndex));
    }
}
