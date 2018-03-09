package facade;
import database.*;

public class UserLoginFacade {

	private UserDAO ud = new UserDAO();
	
	public void login(String userid, String pwd) {
		ud.login(userid, pwd);
	}
	
	public void print(String s) {
		System.out.println(s);
	}
}
