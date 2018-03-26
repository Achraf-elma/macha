package database;

import businessLogic.Partner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maximesoustelle
 */
public class PartnersDAOPostgres extends PartnersDAO{
    private Partner p;	
    private String name;
    private Connection coSql;
	
    public PartnersDAOPostgres(Connection coSql) {
	this.coSql = coSql;
    }
        
        public Partner addPartnerById(String name) {
		Statement statement;
		try {
                        this.name = "test";
			statement = coSql.createStatement();
			String query = "INSERT INTO partners(name) VALUES('" + name + "')";
			ResultSet resultset = statement.executeQuery(query);
			
			if(!resultset.next()){
				this.p = null;
			}else{
				while(resultset.next()) {
					this.name = resultset.getString(1);
				}
				
				this.p = new Partner(name);
			}
			
		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
		return p;
	}
}
