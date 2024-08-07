package za.co.trade.backend.model;
import java.time.LocalDate;

import lombok.Builder;

@Builder
public class User {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dob;

    // Other user properties

    // Behaviors or actions related to the user
    public void changePassword(String newPassword) {
        // Logic to change password
    }

    public void updateProfile(User updatedProfile) {
        // Logic to update user profile
    }
}
