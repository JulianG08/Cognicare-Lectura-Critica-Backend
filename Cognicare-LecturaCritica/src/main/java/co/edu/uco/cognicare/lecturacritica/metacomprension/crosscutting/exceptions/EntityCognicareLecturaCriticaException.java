package co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.exceptions;

import co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.exceptions.enums.Layer;

public final class EntityCognicareLecturaCriticaException extends CognicareLecturaCriticaException {

	private static final long serialVersionUID = 1L;
	
	public EntityCognicareLecturaCriticaException(final String technicalMessage, final String userMessage, final Exception rootException) {
		super(technicalMessage, userMessage, Layer.ENTITY, rootException);
	}
	
	public static final EntityCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage, final Exception rootException) {
		return new EntityCognicareLecturaCriticaException(technicalMessage, userMessage, rootException);
	}
	
	public static final EntityCognicareLecturaCriticaException create(final String userMessage, final Exception rootException) {
		return new EntityCognicareLecturaCriticaException(userMessage, userMessage, rootException);
	}
	
	public static final EntityCognicareLecturaCriticaException create(final String technicalMessage, final String userMessage) {
		return new EntityCognicareLecturaCriticaException(technicalMessage, userMessage, new Exception());
	}
	
	public static final EntityCognicareLecturaCriticaException create(final String userMessage) {
		return new EntityCognicareLecturaCriticaException(userMessage, userMessage, new Exception());
	}
}