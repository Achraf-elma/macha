package database;

import businessLogic.*;
import businessLogic.Partner;
import businessLogic.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InvitationDAOPostgres  extends InvitationDAO{
	
    private Invitation i;	
    
    private String name;
    private Connection coSql;
	private Event e;
    
    public InvitationDAOPostgres(Connection coSql) {
    	this.coSql = coSql;
    }
        
    
    public Invitation createInvitation(User sender, User receiver, Event event) {
    	
    
    	
		Statement statement;
		try {
			statement = coSql.createStatement();
			String query = "INSERT INTO Invitation VALUES('" + sender + "','" + receiver + "','" + event + "')";
			statement.executeUpdate(query);
				
			
			
			} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
		return i;
	}
}