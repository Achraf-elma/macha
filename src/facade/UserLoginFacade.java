package facade;
import database.*;

public class UserLoginFacade {

	private AbstractDAOFactory af = new PostgresFactory();
	private UserDAO ud = af.createUserDAO();
	
	public void login(String userid, String pwd) {
		ud.login(userid, pwd);
	}
}
