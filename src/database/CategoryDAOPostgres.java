/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import businessLogic.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author cyp
 */
public class CategoryDAOPostgres extends CategoryDAO {
    
    private Category u;
    private String categoryName;
    private String categoryID;
	private String numberOfEvent;
         private ObservableList<Category> CategoryData = FXCollections.observableArrayList();
         
         private Connection coSql;
	
	public CategoryDAOPostgres(Connection coSql) {
		this.coSql = coSql;
		// TODO Auto-generated constructor stub
	}
        
    @Override
        public String getnbEvent(String categoryID) throws SQLException
        {
            Statement statement;
                
		
                    statement = coSql.createStatement();
		    String query = "SELECT eventID, count(*) FROM events WHERE categoryID = '" + categoryID +"' GROUP BY eventID ";
		    ResultSet resultset = statement.executeQuery(query);
        String nbofevent;
                  
                    if(!resultset.next()){
                              System.out.println("null");
				nbofevent = "0";
			}else{
                 nbofevent = (resultset.getString(1));
                   }
                 return nbofevent;
        }
    @Override
         public  ObservableList<Category> getAll() {
		Statement statement;
                for(int id = 1; id<20; id++){
		try {
                      
                           
                      
			statement = coSql.createStatement();
			String query = "SELECT * FROM category WHERE categoryID = '" + id +"'  ";
			ResultSet resultset = statement.executeQuery(query);
			
			if(!resultset.next()){
                              System.out.println("null");
				this.u = null;
			}else{
				{
                                      System.out.println("yes");
					System.out.println(resultset.getString(1) + " C" + resultset.getString(2));
                                        this.categoryID =  resultset.getString(1);
					this.categoryName = resultset.getString(2);
					
				}
			
				this.u = new Category(categoryName, getnbEvent(categoryID) );
                                
			}
			
		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
                 if (u != null){
                 CategoryData.add(u);
                 }
                }
		return CategoryData;

	}
	
}
