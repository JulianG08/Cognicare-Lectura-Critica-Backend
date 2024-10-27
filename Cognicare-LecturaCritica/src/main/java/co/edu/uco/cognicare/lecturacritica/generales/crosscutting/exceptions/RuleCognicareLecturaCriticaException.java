package co.edu.uco.cognicare.lecturacritica.generales.crosscutting.exceptions;

import co.edu.uco.cognicare.lecturacritica.generales.crosscutting.exceptions.enums.Layer;

public class RuleCognicareLecturaCriticaException extends CognicareLecturaCriticaException {

	private static final long serialVersionUID = 1L;
	
	public RuleCognicareLecturaCriticaException(final String technicalMessage, final String userMessage, final Exception rootException) {
		super(technicalMessage, userMessage, Layer.RULE, rootException);
	}
	
	public static RuleCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage, final Exception rootException) {
		return new RuleCognicareLecturaCriticaException(technicalMessage, userMessage, rootException);
	}
	
	public static RuleCognicareLecturaCriticaException create(final String userMessage, final Exception rootException) {
		return new RuleCognicareLecturaCriticaException(userMessage, userMessage, rootException);
	}
	
	public static RuleCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage) {
		return new RuleCognicareLecturaCriticaException(technicalMessage, userMessage, new Exception());
	}
	
	public static RuleCognicareLecturaCriticaException create(final String userMessage) {
		return new RuleCognicareLecturaCriticaException(userMessage, userMessage, new Exception());
	}
}