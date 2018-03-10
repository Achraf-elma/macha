package database;

import businessLogic.User;

public class UserDAO {
	private User u;
	
	private ConnectionPostgreSQL coSql;
	
	public void login(String userid, String pwd) { // = createIdByUser()
		coSql = new ConnectionPostgreSQL(userid, pwd);
		this.u = new User(coSql.getUserName(), coSql.getPwd());
		u.login(userid, pwd);
	}

}
