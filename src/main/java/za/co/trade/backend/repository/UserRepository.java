package za.co.trade.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import za.co.trade.backend.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    //  todo remove this is implemented in create read update delete

    @Query("select u from User where u.username = ?1")
    Optional<User> findByUsername(String username);

    @Query("SELECT u FROM User u WHERE u.firstName LIKE %?1%")
    List<User> findUsersByFirstNameLike(String firstName);

    @Query("SELECT u FROM User u WHERE u.lastName = ?1")
    List<User> findUsersByLastName(String lastName);
}