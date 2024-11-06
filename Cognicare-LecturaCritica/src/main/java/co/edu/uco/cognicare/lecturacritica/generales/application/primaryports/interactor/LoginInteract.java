package co.edu.uco.cognicare.lecturacritica.generales.application.primaryports.interactor;

import co.edu.uco.cognicare.lecturacritica.generales.application.primaryports.dto.LoginRequestDTO;
import co.edu.uco.cognicare.lecturacritica.generales.application.primaryports.dto.LoginResponseDTO;
import co.edu.uco.cognicare.lecturacritica.generales.application.primaryports.mapper.UserMapper;
import co.edu.uco.cognicare.lecturacritica.generales.application.usecase.LoginUserUseCase;
import co.edu.uco.cognicare.lecturacritica.generales.domain.user.UserDomain;
import org.springframework.stereotype.Component;

@Component
public class LoginInteract {

    private final LoginUserUseCase loginUserUseCase;
    private final UserMapper userMapper;
    public LoginInteract(LoginUserUseCase loginUserUseCase, UserMapper userMapper) {
        this.loginUserUseCase = loginUserUseCase;
        this.userMapper = userMapper;
    }

    public LoginResponseDTO loginUser(LoginRequestDTO loginRequestDTO) {
        UserDomain userDomain = userMapper.mapToDomain(loginRequestDTO);
        boolean isValid = loginUserUseCase.execute(userDomain);
        LoginResponseDTO response = new LoginResponseDTO();
        response.setSuccess(isValid);
        response.setMessage(isValid ? "Login successful" : "Invalid username or password");

        return response;
    }
}
