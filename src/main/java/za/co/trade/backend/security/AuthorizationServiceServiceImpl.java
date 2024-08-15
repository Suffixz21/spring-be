package za.co.trade.backend.security;

import org.springframework.stereotype.Service;

@Service
public class AuthorizationServiceServiceImpl implements AuthorizationService {

    @Override
    public boolean hasRole(String username, String role) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasRole'");
    }

    @Override
    public boolean hasPermission(String username, String permission) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasPermission'");
    }
}