package co.edu.uco.cognicare.lecturacritica.metacomprension.application.primaryports.interactor;

import org.springframework.stereotype.Component;

import co.edu.uco.cognicare.lecturacritica.metacomprension.application.primaryports.dto.LoginRequestDTO;
import co.edu.uco.cognicare.lecturacritica.metacomprension.application.primaryports.dto.LoginResponseDTO;
import co.edu.uco.cognicare.lecturacritica.metacomprension.application.primaryports.mapper.UserMapper;
import co.edu.uco.cognicare.lecturacritica.metacomprension.application.usecase.LoginUserUseCase;
import co.edu.uco.cognicare.lecturacritica.metacomprension.domain.user.UserDomain;

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
