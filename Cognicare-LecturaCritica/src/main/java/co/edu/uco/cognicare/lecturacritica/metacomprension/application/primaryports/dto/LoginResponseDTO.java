package co.edu.uco.cognicare.lecturacritica.metacomprension.application.primaryports.dto;

import java.util.UUID;

public class LoginResponseDTO {
    private UUID userId;
    private boolean success;
    private String message;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
