package co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.exceptions;

import co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.exceptions.enums.Layer;

public final class CrosscuttingCognicareLecturaCriticaException extends CognicareLecturaCriticaException {

	private static final long serialVersionUID = 1L;
	
	public CrosscuttingCognicareLecturaCriticaException(final String technicalMessage, final String userMessage, final Exception rootException) {
		super(technicalMessage, userMessage, Layer.CROSSCUTTING, rootException);
	}
	
	public static final CrosscuttingCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage, final Exception rootException) {
		return new CrosscuttingCognicareLecturaCriticaException(technicalMessage, userMessage, rootException);
	}
	
	public static final CrosscuttingCognicareLecturaCriticaException create(final String userMessage, final Exception rootException) {
		return new CrosscuttingCognicareLecturaCriticaException(userMessage, userMessage, rootException);
	}
	
	public static final CrosscuttingCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage) {
		return new CrosscuttingCognicareLecturaCriticaException(technicalMessage, userMessage, new Exception());
	}
	
	public static final CrosscuttingCognicareLecturaCriticaException create(final String userMessage) {
		return new CrosscuttingCognicareLecturaCriticaException(userMessage, userMessage, new Exception());
	}
}