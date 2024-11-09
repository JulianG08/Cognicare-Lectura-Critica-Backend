package co.edu.uco.cognicare.lecturacritica.metacomprension.domain;

public interface DomainRule<T> {
    void execute(T data);
}
