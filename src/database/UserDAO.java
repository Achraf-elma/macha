package database;

import businessLogic.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.ConnectionPostgreSQL;

public class UserDAO {
	private User u;
	
	private String nom;
	private String mdp;
	private String dateOfBirth;
	private String firstname;
	private String lastname;
	private String address;
	
	private Connection coSql;
	
	public UserDAO(Connection coSql) {
		this.coSql = coSql;
	}
	

			
	public void login(String userid, String pwd) { // = createIdByUser()
		
	}
	
	public void display(String nickname) {
		Connection coSql = ConnectionPostgreSQL.getInstance();
		Statement statement;
		try {
			statement = coSql.createStatement();
			String query = "SELECT * FROM Users WHERE nickname = '" + nickname +"'";
			ResultSet resultset = statement.executeQuery(query);
			while(resultset.next()) {
				//System.out.println(resultset.getString(1) + " " + resultset.getString(2));
				this.nom = resultset.getString(1);
				this.mdp = resultset.getString(2);
				this.firstname = resultset.getString(3);
				this.lastname = resultset.getString(4);
				this.dateOfBirth = resultset.getString(5);
				this.address = resultset.getString(6);
			}
			
			this.u = new User(nom, mdp, firstname, lastname, dateOfBirth, address);
			u.display(u);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	/*public void getIndexInfos(String userid, String pwd) {
		coSql = new ConnectionPostgreSQL(userid, pwd);
		this.u = new User(coSql.getUserName(), coSql.getPwd(), coSql.getFirstname(), coSql.getLastname(), coSql.getDateOfBirth(), coSql.getAddress());			
		}*/
}


