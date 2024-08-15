package za.co.trade.backend.security;

public interface AuthorizationService {
    boolean hasRole(String username, String role);

    boolean hasPermission(String username, String permission);
}