package co.edu.uco.cognicare.lecturacritica.metacomprension.infrastructure.secondaryports.repository.user;

import co.edu.uco.cognicare.lecturacritica.metacomprension.domain.user.UserDomain;

public interface UserRepository {
    UserDomain findByUsername(String username);
}
