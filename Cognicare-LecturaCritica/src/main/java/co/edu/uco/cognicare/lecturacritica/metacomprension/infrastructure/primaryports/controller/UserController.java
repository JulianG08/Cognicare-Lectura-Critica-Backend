package co.edu.uco.cognicare.lecturacritica.metacomprension.infrastructure.primaryports.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import co.edu.uco.cognicare.lecturacritica.metacomprension.application.primaryports.dto.LoginRequestDTO;
import co.edu.uco.cognicare.lecturacritica.metacomprension.application.primaryports.dto.LoginResponseDTO;
import co.edu.uco.cognicare.lecturacritica.metacomprension.application.primaryports.interactor.LoginInteract;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://127.0.0.1:5500")  // Configura CORS solo para este controlador
public class UserController {

    private final LoginInteract loginInteract;

    @Autowired
    public UserController(LoginInteract loginInteract) {
        this.loginInteract = loginInteract;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO loginRequestDTO) {
        LoginResponseDTO responseDTO = loginInteract.loginUser(loginRequestDTO);
        if (responseDTO.isSuccess()) {
            // Devuelve el ID de usuario junto con el éxito del login
            return ResponseEntity.ok(responseDTO);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(responseDTO);
        }
    }
}
