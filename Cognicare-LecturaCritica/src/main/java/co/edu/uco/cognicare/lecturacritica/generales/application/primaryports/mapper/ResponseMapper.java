package co.edu.uco.cognicare.lecturacritica.generales.application.primaryports.mapper;

import co.edu.uco.cognicare.lecturacritica.generales.application.primaryports.dto.ResponseDTO;
import co.edu.uco.cognicare.lecturacritica.generales.domain.response.ResponseDomain;

import java.util.UUID;

public class ResponseMapper {

    public static ResponseDomain toDomain(ResponseDTO responseDTO, UUID id) {
        return ResponseDomain.create(
                id,
                UUID.fromString(String.valueOf(responseDTO.getUserId())),
                responseDTO.getUserResponse(),
                responseDTO.getTimeTaken(),  // Asegúrate de enviar el tiempo como long (en segundos)
                responseDTO.getBraincoinEarned(),
                responseDTO.getAttemptCount()
        );
    }
}
