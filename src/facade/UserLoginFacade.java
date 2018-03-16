package facade;
import database.*;
import businessLogic.*;

public class UserLoginFacade {

	private AbstractDAOFactory af = new PostgresFactory();
	private UserDAO ud = af.createUserDAO();
	
	public void login(String userid, String pwd) {
		User userCreated = ud.createById(userid, pwd);
		
		if(userCreated != null){
			System.out.print("Connecté!");
		}else{
			System.out.println("Fail");
		}
	}
}
