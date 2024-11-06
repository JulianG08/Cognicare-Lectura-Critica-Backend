package co.edu.uco.cognicare.lecturacritica.generales.application.primaryports.interactor;

import co.edu.uco.cognicare.lecturacritica.generales.application.primaryports.dto.ResponseDTO;
import co.edu.uco.cognicare.lecturacritica.generales.application.usecase.SaveResponseUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
