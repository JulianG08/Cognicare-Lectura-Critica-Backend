package co.edu.uco.cognicare.lecturacritica.generales.application.usecase;

import co.edu.uco.cognicare.lecturacritica.generales.application.primaryports.dto.ResponseDTO;
import co.edu.uco.cognicare.lecturacritica.generales.application.primaryports.mapper.ResponseMapper;
import co.edu.uco.cognicare.lecturacritica.generales.domain.response.ResponseDomain;
import co.edu.uco.cognicare.lecturacritica.generales.infrastructure.secondaryports.repository.response.SaveResponsePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class SaveResponseUseCase {

    private final SaveResponsePort saveResponsePort;
    @Autowired
    public SaveResponseUseCase(SaveResponsePort saveResponsePort) {
        this.saveResponsePort = saveResponsePort;
    }

    public void execute(ResponseDTO responseDTO) {
        UUID id = UUID.randomUUID(); // Generar un id para la respuesta
        ResponseDomain responseDomain = ResponseMapper.toDomain(responseDTO, id);
        saveResponsePort.save(responseDomain);
    }
}
