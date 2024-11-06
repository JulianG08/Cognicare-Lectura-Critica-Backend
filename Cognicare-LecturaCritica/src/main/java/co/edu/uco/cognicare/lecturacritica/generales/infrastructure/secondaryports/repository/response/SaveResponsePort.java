package co.edu.uco.cognicare.lecturacritica.generales.infrastructure.secondaryports.repository.response;

import co.edu.uco.cognicare.lecturacritica.generales.domain.response.ResponseDomain;

public interface SaveResponsePort {

    void save(ResponseDomain responseDomain);
}
