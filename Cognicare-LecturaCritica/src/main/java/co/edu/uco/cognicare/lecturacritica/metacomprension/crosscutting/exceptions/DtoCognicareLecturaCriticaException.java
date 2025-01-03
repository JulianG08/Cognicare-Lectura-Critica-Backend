package co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.exceptions;

import co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.exceptions.enums.Layer;

public final class DtoCognicareLecturaCriticaException extends CognicareLecturaCriticaException {

	private static final long serialVersionUID = 1L;
	
	public DtoCognicareLecturaCriticaException(final String technicalMessage, final String userMessage, final Exception rootException) {
		super(technicalMessage, userMessage, Layer.DTO, rootException);
	}
	
	public static final DtoCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage, final Exception rootException) {
		return new DtoCognicareLecturaCriticaException(technicalMessage, userMessage, rootException);
	}
	
	public static final DtoCognicareLecturaCriticaException create(final String userMessage, final Exception rootException) {
		return new DtoCognicareLecturaCriticaException(userMessage, userMessage, rootException);
	}
	
	public static final DtoCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage) {
		return new DtoCognicareLecturaCriticaException(technicalMessage, userMessage, new Exception());
	}
	
	public static final DtoCognicareLecturaCriticaException create(final String userMessage) {
		return new DtoCognicareLecturaCriticaException(userMessage, userMessage, new Exception());
	}
}