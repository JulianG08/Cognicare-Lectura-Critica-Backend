package co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.exceptions;

import co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.exceptions.enums.Layer;
import co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.helpers.ObjectHelper;
import co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.helpers.TextHelper;

public class CognicareLecturaCriticaException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String userMessage;
	private Layer layer;
	
	public CognicareLecturaCriticaException(final String technicalMessage, final String userMessage, final Layer layer, final Exception rootException) {
		super(ObjectHelper.getDefault(technicalMessage, TextHelper.applyTrim(userMessage)), ObjectHelper.getDefault(rootException, new Exception()));
		setUserMessage(userMessage);
		setLayer(layer);
	}
	
	public String getUserMessage() {
		return userMessage;
	}
	
	private final void setUserMessage(final String userMessage) {
		this.userMessage = TextHelper.applyTrim(userMessage);
	}
	
	public Layer getLayer() {
		return layer;
	}
	
	private final void setLayer(final Layer layer) {
		this.layer = ObjectHelper.getDefault(layer, Layer.GENERAL);
	}
	
	public static CognicareLecturaCriticaException create(final String technicalMessage, final String userMessage, final Exception rootException) {
		return new CognicareLecturaCriticaException(technicalMessage, userMessage, Layer.GENERAL, rootException);
	}
	
	public static CognicareLecturaCriticaException create(final String userMessage, final Exception rootException) {
		return new CognicareLecturaCriticaException(userMessage, userMessage, Layer.GENERAL, rootException);
	}
	
	public static CognicareLecturaCriticaException create(final String technicalMessage, final String userMessage) {
		return new CognicareLecturaCriticaException(technicalMessage, userMessage, Layer.GENERAL, new Exception());
	}
	
	public static CognicareLecturaCriticaException create(final String userMessage) {
		return new CognicareLecturaCriticaException(userMessage, userMessage, Layer.GENERAL, new Exception());
	}
}