package co.edu.uco.cognicare.lecturacritica.generales.application.usecase;

import co.edu.uco.cognicare.lecturacritica.generales.domain.user.UserDomain;
import co.edu.uco.cognicare.lecturacritica.generales.infrastructure.secondaryports.repository.user.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginUserUseCase {

    private final UserRepository userRepository;

    public LoginUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean execute(UserDomain userDomain) {
        UserDomain storedUser = userRepository.findByUsername(userDomain.getUsername());
        if (storedUser == null) {
            return false;
        }
        return storedUser.getPass().equals(userDomain.getPass());
    }

}
