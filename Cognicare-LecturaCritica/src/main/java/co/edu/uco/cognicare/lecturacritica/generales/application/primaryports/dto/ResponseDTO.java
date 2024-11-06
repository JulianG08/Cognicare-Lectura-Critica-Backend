package co.edu.uco.cognicare.lecturacritica.generales.application.primaryports.dto;

import java.util.UUID;
import java.time.Duration;

public class ResponseDTO {

    private UUID userId;
    private String userResponse;
    private Duration timeTaken;
    private int braincoinEarned;
    private int attemptCount;

    // Constructor, getters y setters
    public ResponseDTO(UUID userId, String userResponse, Duration timeTaken, int braincoinEarned, int attemptCount) {
        this.userId = userId;
        this.userResponse = userResponse;
        this.timeTaken = timeTaken;
        this.braincoinEarned = braincoinEarned;
        this.attemptCount = attemptCount;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserResponse() {
        return userResponse;
    }

    public void setUserResponse(String userResponse) {
        this.userResponse = userResponse;
    }

    public Duration getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(Duration timeTaken) {
        this.timeTaken = timeTaken;
    }

    public int getBraincoinEarned() {
        return braincoinEarned;
    }

    public void setBraincoinEarned(int braincoinEarned) {
        this.braincoinEarned = braincoinEarned;
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public void setAttemptCount(int attemptCount) {
        this.attemptCount = attemptCount;
    }
}
