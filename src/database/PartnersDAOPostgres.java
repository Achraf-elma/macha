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
			String query = "INSERT INTO partners(name) VALUES('" + name + "')";
			statement.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
	}
        
        public void deletePartnerById(String name){
            Statement statement;
		try {
			statement = coSql.createStatement();
			String query = "DELETE FROM partners WHERE name = '" + name + "'";
			statement.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
        }
        
        public String getAll(){
            Statement statement;
		try {
			statement = coSql.createStatement();
			String query = "SELECT * FROM partners";
			ResultSet resultset = statement.executeQuery(query);
			
			if(!resultset.next()){
				this.p += "";
			}else{
				while(resultset.next()) {
					this.p += resultset.getString(1);
                                        this.p += "\n";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return this.p;
        }
}
