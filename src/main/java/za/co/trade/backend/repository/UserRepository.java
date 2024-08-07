package za.co.trade.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import za.co.trade.backend.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Add custom query methods here if needed
    Optional<User> findByUsername(String username);

}

