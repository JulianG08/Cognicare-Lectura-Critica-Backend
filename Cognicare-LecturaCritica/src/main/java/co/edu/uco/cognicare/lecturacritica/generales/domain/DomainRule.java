package co.edu.uco.cognicare.lecturacritica.generales.domain;

public interface DomainRule<T> {
    void execute(T data);
}
