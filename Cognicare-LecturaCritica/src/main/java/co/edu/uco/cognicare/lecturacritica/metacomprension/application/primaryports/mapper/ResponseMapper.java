package co.edu.uco.cognicare.lecturacritica.metacomprension.application.primaryports.mapper;

import java.util.UUID;

import co.edu.uco.cognicare.lecturacritica.metacomprension.application.primaryports.dto.ResponseDTO;
import co.edu.uco.cognicare.lecturacritica.metacomprension.domain.response.ResponseDomain;

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
