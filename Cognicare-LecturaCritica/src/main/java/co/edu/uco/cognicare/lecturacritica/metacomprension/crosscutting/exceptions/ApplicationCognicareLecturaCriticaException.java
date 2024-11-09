package co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.exceptions;

import co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.exceptions.enums.Layer;

public final class ApplicationCognicareLecturaCriticaException extends CognicareLecturaCriticaException {

	private static final long serialVersionUID = 1L;
	
	public ApplicationCognicareLecturaCriticaException(final String technicalMessage, final String userMessage, final Exception rootException) {
		super(technicalMessage, userMessage, Layer.APPLICATION, rootException);
	}
	
	public static final ApplicationCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage, final Exception rootException) {
		return new ApplicationCognicareLecturaCriticaException(technicalMessage, userMessage, rootException);
	}
	
	public static final ApplicationCognicareLecturaCriticaException create(final String userMessage, final Exception rootException) {
		return new ApplicationCognicareLecturaCriticaException(userMessage, userMessage, rootException);
	}
	
	public static final ApplicationCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage) {
		return new ApplicationCognicareLecturaCriticaException(technicalMessage, userMessage, new Exception());
	}
	
	public static final ApplicationCognicareLecturaCriticaException create(final String userMessage) {
		return new ApplicationCognicareLecturaCriticaException(userMessage, userMessage, new Exception());
	}
}