package database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import businessLogic.User;


public class UserDAOPostgres extends UserDAO{
	
	private User u;
	
	private String nom;
	private String mdp;
	private String dateOfBirth;
	private String firstname;
	private String lastname;
	private String address;
	
	private Connection coSql;
	
	public UserDAOPostgres(Connection coSql) {
		super(coSql);
		// TODO Auto-generated constructor stub
	}

	public void login(String userid, String pwd) {
		Statement statement;
		try {
			statement = coSql.createStatement();
			String query = "SELECT * FROM Users WHERE nickname = '" + userid +"' AND pwd = '" + pwd + "'";
			ResultSet resultset = statement.executeQuery(query);
			while(resultset.next()) {
				//System.out.println(resultset.getString(1) + " " + resultset.getString(2));
				this.nom = resultset.getString(1);
				this.mdp = resultset.getString(2);
				this.dateOfBirth = resultset.getString(3);
				this.firstname = resultset.getString(4);
				this.lastname = resultset.getString(5);
				this.address = resultset.getString(6);
			}
			
			this.u = new User(nom, mdp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		u.login(userid, pwd);
	}

	public void dispaly(String nick) {
		super.display(nick);
	}
}
