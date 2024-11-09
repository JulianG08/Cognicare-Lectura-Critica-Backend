package co.edu.uco.cognicare.lecturacritica.metacomprension.infrastructure.secondaryports.repository.response;

import co.edu.uco.cognicare.lecturacritica.metacomprension.domain.response.ResponseDomain;

public interface SaveResponsePort {

    void save(ResponseDomain responseDomain);
}
