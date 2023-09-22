package session7_java_utilities.online_store;

import java.time.LocalDateTime;

public class OnlineStore {

    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Johny");
        user.setLastName("Doey");
        user.setAge(55);
        user.setEmail("johnydoey@gmail.com");
        user.setCreatedAt(LocalDateTime.now());

        System.out.println("User created: " + user);
    }
}
