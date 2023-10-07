package session11_abstraction.practice.user_service;

public interface UserService {

    /**
     * Creates a user
     *
     * @param user
     * @return
     */
    User createUser(User user);

    void deleteUser(long id);
}
