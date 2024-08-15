package za.co.trade.backend.security;

import za.co.trade.backend.model.User;

public interface AuthenticationService {
    boolean authenticate(String username, String password);

    String generateToken(User user);

    User getUserFromToken(String token);
}