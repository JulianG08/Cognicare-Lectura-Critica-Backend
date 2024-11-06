package co.edu.uco.cognicare.lecturacritica.generales.infrastructure.secondaryports.repository.user;

import co.edu.uco.cognicare.lecturacritica.generales.domain.user.UserDomain;

public interface UserRepository {
    UserDomain findByUsername(String username);
}
