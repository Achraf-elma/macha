package database;

import businessLogic.Invitation;
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
	//private Event e;
    
    public InvitationDAOPostgres(Connection coSql) {
    	this.coSql = coSql;
    }
        
    
    public Invitation createInvitation(User sender, User receiver) { 
    	//TO ADD : Event event
    	
		Statement statement;
		try {
			statement = coSql.createStatement();
			String query = "INSERT INTO Invitation VALUES('" + sender + "','" + receiver + "','testEvent')";
			ResultSet resultset = statement.executeQuery(query);
			
			if(!resultset.next()){
				this.i = null;
			}else{
				this.i = new Invitation(sender,receiver);
			}
			
		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
		return i;
	}
}