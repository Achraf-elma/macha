package database;

public class UserDAO {
	
	private ConnectionPostgreSQL coSql;
	public void login(String userid, String pwd) {
		System.out.println(userid + pwd);
		coSql = new ConnectionPostgreSQL(userid);
	}

}
