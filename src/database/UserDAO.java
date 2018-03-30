package database;

import businessLogic.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

import database.ConnectionPostgreSQL;
import javafx.collections.ObservableList;

public abstract class UserDAO {
	private User u;
	
	private String nom;
	private String mdp;
	private Date dateOfBirth;
	private String firstname;
	private String lastname;
	private String address;
	
	private Connection coSql;
	
	

			
	public abstract User createById(String userid, String pwd);
        public abstract ObservableList<User> getAll();
	
	public abstract User createNewUser(String userid, String pwd, String fn, String ln, Date birthDate, String adress);
	public abstract void addUserById(String name, String firstname, String lastname, String mail);
        public abstract void deleteUserById(String name);
	/*public void display(String nickname) {
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
	}*/
	
	/*public void getIndexInfos(String userid, String pwd) {
		coSql = new ConnectionPostgreSQL(userid, pwd);
		this.u = new User(coSql.getUserName(), coSql.getPwd(), coSql.getFirstname(), coSql.getLastname(), coSql.getDateOfBirth(), coSql.getAddress());			
		}*/
}


