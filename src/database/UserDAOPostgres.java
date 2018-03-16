package database;
import java.sql.Connection;


public class UserDAOPostgres extends UserDAO{
	
	public UserDAOPostgres(Connection coSql) {
		super(coSql);
		// TODO Auto-generated constructor stub
	}

	public void login(String userid, String pwd) {
		super.login(userid, pwd);
	}

	public void dispaly(String nick) {
		super.display(nick);
	}
}
