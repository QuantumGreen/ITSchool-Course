package session4.hw;

// 17. Write a Java program that simulates a simple authentication system. Declare a boolean variable hasUsername and hasPassword. Set up a series of logical conditions using these two variables that will check the following conditions:


public class hw17 {
    public static void main(String[] args) {
        boolean hasUsername = true;
        boolean hasPassword = true;

        if(hasUsername){
            if(hasPassword) {
                System.out.println("Authentication successful");
            } else {
                System.out.println("Password is incorrect");
            }
        }else{
            System.out.println("Authentication failed");
        }
    }
}
