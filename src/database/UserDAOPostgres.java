package database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import businessLogic.User;


public class UserDAOPostgres extends UserDAO{
	
	private User u;
	
	private String nick;
	private String pwd;
	private String dateOfBirth;
	private String firstname;
	private String lastname;
	private String address;
	
	private Connection coSql;
	
	public UserDAOPostgres(Connection coSql) {
		this.coSql = coSql;
		// TODO Auto-generated constructor stub
	}

	public User createById(String userid, String pwd) {
		Statement statement;
		try {
			statement = coSql.createStatement();
			String query = "SELECT * FROM Users WHERE nickname = '" + userid +"' AND pwd = '" + pwd + "'";
			ResultSet resultset = statement.executeQuery(query);
			
			if(!resultset.next()){
				this.u = null;
			}else{
				while(resultset.next()) {
					//System.out.println(resultset.getString(1) + " " + resultset.getString(2));
					this.nick = resultset.getString(1);
					this.pwd = resultset.getString(2);
					this.dateOfBirth = resultset.getString(3);
					this.firstname = resultset.getString(4);
					this.lastname = resultset.getString(5);
					this.address = resultset.getString(6);
				}
				
				this.u = new User(nick, pwd, dateOfBirth, firstname, lastname, address);
			}
			
		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
		return u;
	}

	/*public void dispaly(String nick) {
		super.display(nick);
	}*/
}
