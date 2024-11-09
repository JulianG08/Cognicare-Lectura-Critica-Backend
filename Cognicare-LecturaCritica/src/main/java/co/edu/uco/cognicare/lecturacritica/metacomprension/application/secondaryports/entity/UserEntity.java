package co.edu.uco.cognicare.lecturacritica.metacomprension.application.secondaryports.entity;

import java.util.UUID;

import co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.helpers.TextHelper;
import co.edu.uco.cognicare.lecturacritica.metacomprension.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public final class UserEntity {
	
	@Id
	@Column(name = "id")
	private UUID id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "pass")
	private String pass;
	
	@Column(name = "braincoinUser")
	private int braincoinuser;
	
	public UserEntity() {
		setId(UUIDHelper.getDefault());
		setUserName(TextHelper.EMPTY);
		setPass(TextHelper.EMPTY);
		setBrainCoin(TextHelper.EMPTY);
	}
	
	public UserEntity(final UUID id, final String username, final String pass, final int braincoinuser) {
		setId(id);
		setUserName(username);
		setPass(pass);
		setBrainCoin(braincoinuser);
	}
	
	public static final UserEntity create() {
		return new UserEntity();
	}
	
	public static final UserEntity create(final UUID id) {
		return new UserEntity(id, TextHelper.EMPTY);
	}
	
	public static final UserEntity create(final UUID id, final String username, final String pass, final int braincoinuser) {
		return new UserEntity(id, username, pass, braincoinuser);
	}
	
	public final UUID getId() {
		return id;
	}
	
	public final void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
	}
	
	public final String getUserName() {
		return username;
	}
	
	public final void setUserName(final String username) {
		this.username = TextHelper.getDefault(username, TextHelper.EMPTY);
	}
	
	public final String getPass() {
		return pass;
	}
	
	public final void setPass(final String pass) {
		this.pass = TextHelper.getDefault(pass, TextHelper.EMPTY);
	}
	
	public final int getBrainCoin() {
		return braincoinuser;
	}
	
	public final void setBrainCoin(final int braincoinuser) {
		this.braincoinuser = TextHelper.getDefault(braincoinuser, TextHelper.EMPTY);
	}
}