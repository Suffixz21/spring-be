package za.co.trade.backend.security;

import za.co.trade.backend.model.User;

public class AuthenticationService implements IAuthentication {

    @Override
    public boolean authenticate(String username, String password) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'authenticate'");
    }

    @Override
    public String generateToken(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generateToken'");
    }

    @Override
    public User getUserFromToken(String token) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserFromToken'");
    }
}