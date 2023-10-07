package session11_abstraction.practice.user_service;

public class UserServiceImpl implements UserService {
    @Override
    public User createUser(User user) {
        // validate user
        // set special properties user.setCreatedAt(LocalDateTime.now())
        // save user in database
        // return user

        return null;
    }

    @Override
    public void deleteUser(long id) {
        //...
    }
}
