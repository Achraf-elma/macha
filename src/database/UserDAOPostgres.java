package database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

import businessLogic.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class UserDAOPostgres extends UserDAO{
	
	private User u;
	
	private String nick;
	private String pwd;
	private String dateOfBirth;
	private String firstname;
	private String lastname;
	private String address;
         private ObservableList<User> PersonData = FXCollections.observableArrayList();
	
	private Connection coSql;
	
	public UserDAOPostgres(Connection coSql) {
		this.coSql = coSql;
		// TODO Auto-generated constructor stub
	}

	public User createById(String userid, String pwd) {
		Statement statement;
		try {
			statement = coSql.createStatement();
			String query = "SELECT * FROM machauser WHERE nickname = '" + userid +"' AND pwd = '" + pwd + "'";
			ResultSet resultset = statement.executeQuery(query);
			System.out.println("ok");
			if(!resultset.next()){
                System.out.println("null");
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

	

	public User createNewUser(String userid, String pwd, String fn, String ln, Date birthDate, String adress) {
		Statement statement;
		
		try {
			statement = coSql.createStatement();
			String query = "INSERT INTO machauser(nickname,pwd,userfirstname,userlastname,userdateofbirth,useradress) VALUES('" + userid +"','" + pwd + "','" + fn + "','"+ ln +"','"+ birthDate +"','" + adress + "')";
			statement.executeUpdate(query);
	
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
		return u;

        }
     
       
        public  ObservableList<User> getAll() {
		Statement statement;
                for(int userid = 1; userid<20; userid++){
		try {
                      
                           
                      
			statement = coSql.createStatement();
			String query = "SELECT * FROM machaUser WHERE userID = '" + userid +"'  ";
			ResultSet resultset = statement.executeQuery(query);
			
			if(!resultset.next()){
                              System.out.println("null");
				this.u = null;
			}else{
				{
                                      System.out.println("yes");
					System.out.println(resultset.getString(1) + " C" + resultset.getString(2));
					this.nick = resultset.getString(2);
					this.pwd = resultset.getString(2);
					this.dateOfBirth = resultset.getString(3);
					this.firstname = resultset.getString(4);
					this.lastname = resultset.getString(5);
					this.address = resultset.getString(6);
				}
			
				this.u = new User(nick, firstname, lastname);
                                
			}
			
		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
                 if (u != null){
                 PersonData.add(u);
                 }
                }
		return PersonData;

	}

        
        public void addUserById(String name, String firstname, String lastname, String mail) {
		Statement statement;
                //D
		try {
			statement = coSql.createStatement();
			String query = "INSERT INTO machauser(nickname, userfirstname, userlastname, useradress) "
                                + "VALUES('" + name + "', '" + firstname + "', '" + lastname + "', '" + mail + "')";
			statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
        
        public void deleteUserById(String name){
            Statement statement;
            int userid = 0;
		try {
                        String idQuery = "SELECT userid FROM machauser WHERE nickname = '" + name + "'";
                        ResultSet result = coSql.createStatement().executeQuery(idQuery);
                        while(result.next())
                        {
                            userid = Integer.parseInt(result.getString(1));
                        }
                        String eventQuery = "DELETE FROM events WHERE organizatorid = '" + userid + "'";
                        coSql.createStatement().executeUpdate(eventQuery);

                        statement = coSql.createStatement();
			String query = "DELETE FROM machauser WHERE nickname = '" + name + "'";
			statement.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
        }
	/*public void dispaly(String nick) {
		super.display(nick);
	}*/
}
