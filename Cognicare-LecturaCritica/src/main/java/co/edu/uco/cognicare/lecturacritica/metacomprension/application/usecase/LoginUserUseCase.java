package co.edu.uco.cognicare.lecturacritica.metacomprension.application.usecase;

import org.springframework.stereotype.Service;

import co.edu.uco.cognicare.lecturacritica.metacomprension.domain.user.UserDomain;
import co.edu.uco.cognicare.lecturacritica.metacomprension.infrastructure.secondaryports.repository.user.UserRepository;

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
