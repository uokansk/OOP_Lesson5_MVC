package personal.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);
    void deleteUser(String userId);
//    String deleteUser(User user);
}
