package database;

import businessLogic.Event;
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
     private ObservableList<Partner> partnerData = FXCollections.observableArrayList();
    private String parterID;
	private String partnerName;
	private String info;
	private String website;
	
    public PartnersDAOPostgres(Connection coSql) {
	this.coSql = coSql;
    }
        
        public void addPartnerById(String name, String desc, String website) {
		Statement statement;
		try {
			statement = coSql.createStatement();
			String query = "INSERT INTO partner(partnername, partnerinfo, partnerwebsite) VALUES('" 
                                + name + "', '" + desc + "', '" + website + "')";
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
                try {
                    int max=0;
                    statement = coSql.createStatement();
                    ResultSet maxId = statement.executeQuery("SELECT MAX(partnerid) FROM partner");
                    while(maxId.next()){
                        max = Integer.parseInt(maxId.getString(1));
                    }
                    for(int i=0; i<max; i++){
                        String query = "SELECT * FROM partner WHERE partnerid = " + i;
                        ResultSet resultset = statement.executeQuery(query);
                        while(resultset.next()){
                            System.out.println("yes");
                            this.partnerName = resultset.getString(2);
                            this.info = resultset.getString(3);
                            this.website = resultset.getString(4);
                            
                            this.u = new Partner(partnerName, info, website);
                            System.out.println(u.toString());
                            partnerData.add(u);
                        }
                    }
		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
                if (u != null){
                     partnerData.add(u); 
                }
             
		return partnerData;

	}
        public void updatePartnerById(String name, String desc, String website){
            Statement statement;
		try {
			statement = coSql.createStatement();
			String query = "UPDATE partner SET partnerinfo = '" + desc 
                                + "', partnerwebsite = '" + website + "' WHERE partnername = '" + name + "'";
			statement.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
        }
}
