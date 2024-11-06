package co.edu.uco.cognicare.lecturacritica.generales.infrastructure.secondaryports.repository.response;

import co.edu.uco.cognicare.lecturacritica.generales.domain.response.ResponseDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
        String sql = "INSERT INTO responses (id, userId, userResponse, timeTaken, braincoinEarned, attemptCount) VALUES (?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(
                sql,
                responseDomain.getId(),
                responseDomain.getUserId(),
                responseDomain.getUserResponse(),
                responseDomain.getTimeTaken().toString(), // Convertir el Duration a un formato adecuado (String)
                responseDomain.getBraincoinEarned(),
                responseDomain.getAttemptCount()
        );
    }

    private ResponseDomain mapRowToResponseDomain(ResultSet rs) throws SQLException {
        return new ResponseDomain(
                UUID.fromString(rs.getString("id")),
                UUID.fromString(rs.getString("userId")),
                rs.getString("userResponse"),
                Duration.parse(rs.getString("timeTaken")),
                rs.getInt("braincoinEarned"),
                rs.getInt("attemptCount")
        );
    }
}
