package session11_abstraction.challenge.smart_home;

public class User {
    public String username;
    public String password;
    public UserLevel level;

    public User(String username, String password, UserLevel level) {
        this.username = username;
        this.password = password;
        this.level = level;
    }
}
