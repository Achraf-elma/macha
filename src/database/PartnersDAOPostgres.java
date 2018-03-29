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
    private String p = "";
    private Connection coSql;
	
    public PartnersDAOPostgres(Connection coSql) {
	this.coSql = coSql;
    }
        
        public void addPartnerById(String name) {
		Statement statement;
		try {
			statement = coSql.createStatement();
			String query = "INSERT INTO partner(partnername) VALUES('" + name + "')";
			statement.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
	}
        
        public void deletePartnerById(String name){
            Statement statement;
		try {
			statement = coSql.createStatement();
			String query = "DELETE FROM partner WHERE partnername = '" + name + "'";
			statement.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
        }
        
        public String getAll(){
            this.p = "";
            Statement statement;
		try {
			statement = coSql.createStatement();
			String query = "SELECT * FROM partner";
			ResultSet resultset = statement.executeQuery(query);
                        
                        while(resultset.next()) {
                            this.p += resultset.getString(2);
                            this.p += " - ";
                            this.p += resultset.getString(3);
                            this.p += "\n";
                        }
                        
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return this.p;
        }
        
        public void updatePartnerById(String name, String desc){
            Statement statement;
		try {
			statement = coSql.createStatement();
			String query = "UPDATE partner SET partnerinfo = '" + desc 
                                + "' WHERE partnername = '" + name + "'";
			statement.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
        }
}
