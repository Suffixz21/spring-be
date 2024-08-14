package za.co.trade.backend.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
    private Long userId;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String phoneNumber;
    private String address;
    private String city;
    private String province;
    private Long zipCode;
    private String country;
    private String profilePicture;

    // todo seperate user's credentials to a different model
    private String password;

    // Behaviors or actions related to the user
    public void changePassword(String newPassword) {
        // Logic to change password
    }

    public void updateProfile(User updatedProfile) {
        this.firstName = updatedProfile.firstName;
        this.lastName = updatedProfile.lastName;
        this.email = updatedProfile.email;
        this.dateOfBirth = updatedProfile.dateOfBirth;
    }

    public void updateContactDetails(User updatedProfile) {
        this.address = updatedProfile.address;
        this.city = updatedProfile.city;
        this.province = updatedProfile.province;
        this.zipCode = updatedProfile.zipCode;
        this.country = updatedProfile.country;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
