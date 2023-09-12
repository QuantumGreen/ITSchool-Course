package session4;

public class StringMemoryReference {
    public static void main(String[] args) {
        String greeting = new String("Hello");
        String greetingOne = "Hello";
        String greetingTwo = "Hello";
        System.out.println(greetingOne == greetingTwo);
        System.out.println(greetingOne.equals(greetingTwo));

        System.out.println(greeting == greetingOne);
        System.out.println(greeting.equals(greetingOne));

    }
}
