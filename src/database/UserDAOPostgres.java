package database;
import businessLogic.User;

public class UserDAOPostgres extends UserDAO{
	
	public void login(String userid, String pwd) {
		super.login(userid, pwd);
	}

	public void dispaly(String nick) {
		super.display(nick);
	}
}
