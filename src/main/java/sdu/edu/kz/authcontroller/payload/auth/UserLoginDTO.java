package sdu.edu.kz.authcontroller.payload.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginDTO {
    @Email
    @Schema(description = "Email address", example = "user@user.com", requiredMode = Schema.RequiredMode.REQUIRED)
    private String email;

    @Size(min = 6, max = 20)
    @Schema(description = "Password", example = "user12", requiredMode = Schema.RequiredMode.REQUIRED, minLength = 6, maxLength = 20)
    private String password;
}