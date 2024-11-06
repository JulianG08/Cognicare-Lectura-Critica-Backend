package co.edu.uco.cognicare.lecturacritica.generales.infrastructure.primaryports.controller;

import co.edu.uco.cognicare.lecturacritica.generales.application.primaryports.dto.ResponseDTO;
import co.edu.uco.cognicare.lecturacritica.generales.application.primaryports.interactor.SaveResponseInteract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/responses")
@CrossOrigin(origins = "http://127.0.0.1:5500")  // Configura CORS solo para este controlador
public class ResponseController {

    private final SaveResponseInteract saveResponseInteract;

    @Autowired
    public ResponseController(SaveResponseInteract saveResponseInteract) {
        this.saveResponseInteract = saveResponseInteract;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveResponse(@RequestBody ResponseDTO responseDTO) {
        try {
            saveResponseInteract.execute(responseDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body("Response saved successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error saving response: " + e.getMessage());
        }
    }
}
