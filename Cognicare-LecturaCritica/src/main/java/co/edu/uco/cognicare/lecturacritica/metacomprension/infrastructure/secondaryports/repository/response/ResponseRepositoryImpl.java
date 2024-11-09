package co.edu.uco.cognicare.lecturacritica.metacomprension.infrastructure.secondaryports.repository.response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.edu.uco.cognicare.lecturacritica.metacomprension.domain.response.ResponseDomain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;
import java.util.UUID;

@Repository
public class ResponseRepositoryImpl implements SaveResponsePort {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ResponseRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(ResponseDomain responseDomain) {
        String sql = "INSERT INTO responses ( userId, userResponse, timeTaken, braincoinEarned, attemptCount) VALUES ( ?, ?, ?, ?, ?)";

        jdbcTemplate.update(
                sql,
                responseDomain.getUserId(),
                responseDomain.getUserResponse(),
                responseDomain.getTimeTaken(),
                responseDomain.getBraincoinEarned(),
                responseDomain.getAttemptCount()
        );
    }

    private ResponseDomain mapRowToResponseDomain(ResultSet rs) throws SQLException {
        return new ResponseDomain(
                UUID.fromString(rs.getString("id")),
                UUID.fromString(rs.getString("userId")),
                rs.getString("userResponse"),
                rs.getLong(rs.getString("timeTaken")),
                rs.getInt("braincoinEarned"),
                rs.getInt("attemptCount")
        );
    }
}
