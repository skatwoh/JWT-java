package sale.be.com.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class RegisterUserDto {

    @NotBlank(message = "Email cannot be null")
    @NotNull(message = "Email cannot be null")
    private String email;

    @NotBlank(message = "Password cannot be null")
    @NotNull(message = "Password cannot be null")
    private String password;

    @NotBlank(message = "Full name cannot be null")
    @NotNull(message = "Full name cannot be null")
    private String fullName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}