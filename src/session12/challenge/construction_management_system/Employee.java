package session12.challenge.construction_management_system;

public class Employee {
    String firstName;
    String lastName;
    String email;

    public void sendEmail(String sender, String title, String message) {
        System.out.println(sender + " sent an email to address: " + email);
    }
}
