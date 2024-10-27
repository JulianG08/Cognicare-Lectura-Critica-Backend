package co.edu.uco.cognicare.lecturacritica.generales.crosscutting.exceptions;

import co.edu.uco.cognicare.lecturacritica.generales.crosscutting.exceptions.enums.Layer;

public final class ControllerCognicareLecturaCriticaException extends CognicareLecturaCriticaException {

	private static final long serialVersionUID = 1L;
	
	public ControllerCognicareLecturaCriticaException(final String technicalMessage, final String userMessage, final Exception rootException) {
		super(technicalMessage, userMessage, Layer.CONTROLLER, rootException);
	}
	
	public static final ControllerCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage, final Exception rootException) {
		return new ControllerCognicareLecturaCriticaException(technicalMessage, userMessage, rootException);
	}
	
	public static final ControllerCognicareLecturaCriticaException create(final String userMessage, final Exception rootException) {
		return new ControllerCognicareLecturaCriticaException(userMessage, userMessage, rootException);
	}
	
	public static final ControllerCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage) {
		return new ControllerCognicareLecturaCriticaException(technicalMessage, userMessage, new Exception());
	}
	
	public static final ControllerCognicareLecturaCriticaException create(final String userMessage) {
		return new ControllerCognicareLecturaCriticaException(userMessage, userMessage, new Exception());
	}
}