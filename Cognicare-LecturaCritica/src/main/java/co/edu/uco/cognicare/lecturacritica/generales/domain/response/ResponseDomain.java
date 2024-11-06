package co.edu.uco.cognicare.lecturacritica.generales.domain.response;

import java.util.UUID;

import co.edu.uco.cognicare.lecturacritica.generales.domain.Domain;

public final class ResponseDomain extends Domain {

    private UUID userId;
    private String userResponse;
    private long timeTaken;
    private int braincoinEarned;
    private int attemptCount;

    public ResponseDomain(final UUID id, final UUID userId, final String userResponse, final long timeTaken, final int braincoinEarned, final int attemptCount) {
        super(id);
        setUserId(userId);
        setUserResponse(userResponse);
        setTimeTaken(timeTaken);
        setBraincoinEarned(braincoinEarned);
        setAttemptCount(attemptCount);
    }

    public static final ResponseDomain create(final UUID id, final UUID userId, final String userResponse, final long timeTaken, final int braincoinEarned, final int attemptCount) {
        return new ResponseDomain(id, userId, userResponse, timeTaken, braincoinEarned, attemptCount);
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

    public long getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(long timeTaken) {
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
