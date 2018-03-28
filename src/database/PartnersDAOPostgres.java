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
    private Connection coSql;
	
    public PartnersDAOPostgres(Connection coSql) {
	this.coSql = coSql;
    }
        
        public void addPartnerById(String name) {
		Statement statement;
		try {
			statement = coSql.createStatement();
			String query = "INSERT INTO partners(name) VALUES('" + name + "')";
			statement.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
	}
}
