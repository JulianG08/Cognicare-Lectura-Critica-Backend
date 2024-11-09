package co.edu.uco.cognicare.lecturacritica.metacomprension.application.primaryports.interactor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.uco.cognicare.lecturacritica.metacomprension.application.primaryports.dto.ResponseDTO;
import co.edu.uco.cognicare.lecturacritica.metacomprension.application.usecase.SaveResponseUseCase;

@Component
public class SaveResponseInteract {

    private final SaveResponseUseCase saveResponseUseCase;

    @Autowired
    public SaveResponseInteract(SaveResponseUseCase saveResponseUseCase) {
        this.saveResponseUseCase = saveResponseUseCase;
    }

    public void execute(ResponseDTO responseDTO) {
        saveResponseUseCase.execute(responseDTO);
    }
}
