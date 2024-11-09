package co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.exceptions;

import co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.exceptions.enums.Layer;

public final class DomainCognicareLecturaCriticaException extends CognicareLecturaCriticaException {

	private static final long serialVersionUID = 1L;
	
	public DomainCognicareLecturaCriticaException(final String technicalMessage, final String userMessage, final Exception rootException) {
		super(technicalMessage, userMessage, Layer.DOMAIN, rootException);
	}
	
	public static final DomainCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage, final Exception rootException) {
		return new DomainCognicareLecturaCriticaException(technicalMessage, userMessage, rootException);
	}
	
	public static final DomainCognicareLecturaCriticaException create(final String userMessage, final Exception rootException) {
		return new DomainCognicareLecturaCriticaException(userMessage, userMessage, rootException);
	}
	
	public static final DomainCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage) {
		return new DomainCognicareLecturaCriticaException(technicalMessage, userMessage, new Exception());
	}
	
	public static final DomainCognicareLecturaCriticaException create(final String userMessage) {
		return new DomainCognicareLecturaCriticaException(userMessage, userMessage, new Exception());
	}
}