package co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.exceptions;

import co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.exceptions.enums.Layer;

public final class DataCognicareLecturaCriticaException extends CognicareLecturaCriticaException {

	private static final long serialVersionUID = 1L;
	
	public DataCognicareLecturaCriticaException(final String technicalMessage, final String userMessage, final Exception rootException) {
		super(technicalMessage, userMessage, Layer.DATA, rootException);
	}
	
	public static final DataCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage, final Exception rootException) {
		return new DataCognicareLecturaCriticaException(technicalMessage, userMessage, rootException);
	}
	
	public static final DataCognicareLecturaCriticaException create(final String userMessage, final Exception rootException) {
		return new DataCognicareLecturaCriticaException(userMessage, userMessage, rootException);
	}
	
	public static final DataCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage) {
		return new DataCognicareLecturaCriticaException(technicalMessage, userMessage, new Exception());
	}
	
	public static final DataCognicareLecturaCriticaException create(final String userMessage) {
		return new DataCognicareLecturaCriticaException(userMessage, userMessage, new Exception());
	}
}