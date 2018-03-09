package facade;
import database.*;

public class UserLoginFacade {

	private UserDAO ud;
	
	public void login(String userid, String pwd) {
		ud.login(userid, pwd);
	}
}
