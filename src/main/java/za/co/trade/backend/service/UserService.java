package za.co.trade.backend.service;

import aj.org.objectweb.asm.commons.Remapper;
import za.co.trade.backend.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);

    Optional<User> getUserById(Long id);

    List<User> getAllUsers();

    Optional<User> updateUser(Long id, User updatedUser);

    void deleteUser(Long id);
}
