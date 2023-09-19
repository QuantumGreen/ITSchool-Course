package session6_core_API.practice;

import java.util.UUID;

public class StringPractice {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str2 == str3);
        System.out.println(str2.equals(str3));

        UUID userId = UUID.randomUUID();

        User userJohn = new User();
        userJohn.setUserID(userId);
        userJohn.setFirstName("John");

        System.out.println(userJohn.getFirstName() + ": " + userJohn.getUserID());
    }
}
