package co.edu.uco.cognicare.lecturacritica.metacomprension.application.primaryports.mapper;

import org.springframework.stereotype.Component;

import co.edu.uco.cognicare.lecturacritica.metacomprension.application.primaryports.dto.LoginRequestDTO;
import co.edu.uco.cognicare.lecturacritica.metacomprension.domain.user.UserDomain;

@Component
public class UserMapper {

    // Método para mapear el DTO de login a un objeto de dominio
    public UserDomain mapToDomain(LoginRequestDTO loginRequestDTO) {
        return new UserDomain(
                null,
                loginRequestDTO.getUsername(),
                loginRequestDTO.getPass(),
                0
        );
    }
}
