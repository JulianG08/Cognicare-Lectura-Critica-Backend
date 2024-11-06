package co.edu.uco.cognicare.lecturacritica.generales.application.primaryports.mapper;

import co.edu.uco.cognicare.lecturacritica.generales.application.primaryports.dto.LoginRequestDTO;
import co.edu.uco.cognicare.lecturacritica.generales.domain.user.UserDomain;
import org.springframework.stereotype.Component;

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
