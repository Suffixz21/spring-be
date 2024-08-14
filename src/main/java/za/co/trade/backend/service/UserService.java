package za.co.trade.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import za.co.trade.backend.exception.UserAlreadyExistsException;
import za.co.trade.backend.model.User;
import za.co.trade.backend.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User createUser(User user) {
        Optional<User> existingUser = userRepository.findByUsername(user.getUsername());
        if (existingUser.isPresent()) {
            throw new UserAlreadyExistsException();
        }

        // Hash password
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Additional logic for default values, roles, etc.
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> getUsersByIds(List<Long> ids) {
        return userRepository.findAllById(ids);
    }

    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public List<User> getUserByFirstNameLike(String firstName) {
        return userRepository.findUsersByFirstNameLike(firstName);
    }

    public List<User> getUserBLastName(String lastName) {
        return userRepository.findUsersByLastName(lastName);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> updateUser(Long id, User updatedUser) {
        return userRepository.findById(id)
                .flatMap(existingUser -> {
                    existingUser.updateProfile(updatedUser);
                    return Optional.of(userRepository.save(existingUser));
                });
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    // Add methods for authentication, authorization, etc. as needed
}