package co.edu.uco.cognicare.lecturacritica.metacomprension.infrastructure.secondaryports.repository.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.edu.uco.cognicare.lecturacritica.metacomprension.domain.user.UserDomain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public UserDomain findByUsername(String username) {
        String sql = "SELECT id, username, pass, braincoinuser FROM users WHERE username = ?";

        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{username}, (ResultSet rs, int rowNum) -> mapRowToUserDomain(rs));
        } catch (EmptyResultDataAccessException e) {
            return null;  // Si no se encuentra el usuario, devuelve null
        }
    }

    private UserDomain mapRowToUserDomain(ResultSet rs) throws SQLException {
        return UserDomain.create(
                UUID.fromString(rs.getString("id")),
                rs.getString("username"),
                rs.getString("pass"),
                rs.getInt("braincoinuser")
        );
    }
}
