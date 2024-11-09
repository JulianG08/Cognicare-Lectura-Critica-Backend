package co.edu.uco.cognicare.lecturacritica.metacomprension.domain.user;
import java.util.UUID;

import co.edu.uco.cognicare.lecturacritica.metacomprension.domain.Domain;
public final class UserDomain extends Domain {

    private String username;
    private String pass;
    private int braincoinuser;

    public UserDomain(final UUID id, final String username, final String pass, final int braincoinuser){
        super(id);
        setUsername(username);
        setPass(pass);
        setBraincoinuser(braincoinuser);
    }
    public static final UserDomain create(final UUID id, final String username,final String pass, final int braincoinuser){
        return new UserDomain(id,username,pass,braincoinuser);

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getBraincoinuser() {
        return braincoinuser;
    }

    public void setBraincoinuser(int braincoinuser) {
        this.braincoinuser = braincoinuser;
    }
}
