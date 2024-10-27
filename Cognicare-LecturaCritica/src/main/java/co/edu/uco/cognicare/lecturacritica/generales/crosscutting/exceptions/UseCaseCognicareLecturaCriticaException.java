package co.edu.uco.cognicare.lecturacritica.generales.crosscutting.exceptions;

import co.edu.uco.cognicare.lecturacritica.generales.crosscutting.exceptions.enums.Layer;

public final class UseCaseCognicareLecturaCriticaException extends CognicareLecturaCriticaException {

	private static final long serialVersionUID = 1L;
	
	public UseCaseCognicareLecturaCriticaException(final String technicalMessage, final String userMessage, final Exception rootException) {
		super(technicalMessage, userMessage, Layer.USECASE, rootException);
	}
	
	public static final UseCaseCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage, final Exception rootException) {
		return new UseCaseCognicareLecturaCriticaException(technicalMessage, userMessage, rootException);
	}
	
	public static final UseCaseCognicareLecturaCriticaException create(final String userMessage, final Exception rootException) {
		return new UseCaseCognicareLecturaCriticaException(userMessage, userMessage, rootException);
	}
	
	public static final UseCaseCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage) {
		return new UseCaseCognicareLecturaCriticaException(technicalMessage, userMessage, new Exception());
	}
	
	public static final UseCaseCognicareLecturaCriticaException create(final String userMessage) {
		return new UseCaseCognicareLecturaCriticaException(userMessage, userMessage, new Exception());
	}
}