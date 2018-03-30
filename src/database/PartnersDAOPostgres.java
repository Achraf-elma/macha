package database;

import businessLogic.Partner;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author maximesoustelle
 */
public class PartnersDAOPostgres extends PartnersDAO{
    private String p = "";
    private Partner u; 
    private Connection coSql;
     private ObservableList<Partner> PartnerData = FXCollections.observableArrayList();
    private String parterID;
	private String partnerName;
	private String info;
	
	
    public PartnersDAOPostgres(Connection coSql) {
	this.coSql = coSql;
    }
        
        public void addPartnerById(String name, String desc) {
		Statement statement;
		try {
			statement = coSql.createStatement();
			String query = "INSERT INTO partner(partnername, partnerinfo) VALUES('" 
                                + name + "', '" + desc + "')";
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
        
        public  ObservableList<Partner> getAllPartner() {
		Statement statement;
                 for(int i = 1; i<100; i++){
		try {
                      
			statement = coSql.createStatement();
			String query = "SELECT * FROM partner WHERE partnerID = '" + i +"'  ";
			ResultSet resultset = statement.executeQuery(query);
			
			if(!resultset.next()){
                                
				this.u = null;
			}else{
				{
					//System.out.println(resultset.getString(1) + " C" + resultset.getString(2));
					this.partnerName = resultset.getString(2);
					this.info = resultset.getString(3);
					
				}
				
				this.u = new Partner(partnerName, info);
			}
			
		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
                if (u != null){
                     PartnerData.add(u); 
                }
               
                }
		return PartnerData;

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
