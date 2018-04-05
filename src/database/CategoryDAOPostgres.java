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
		    String query = "SELECT count(*) FROM events WHERE categoryID = " + categoryID + " GROUP BY eventID ";
		    ResultSet resultset = statement.executeQuery(query);
        String nbofevent;
                  
                    if(!resultset.next()){
				nbofevent = "0";
			}else{
                 nbofevent = (resultset.getString(1));
                   }
                 return nbofevent;
        }
    @Override
         public  ObservableList<Category> getAll() {
		Statement statement;
		try {
                        int max=0;
                        statement = coSql.createStatement();
                        ResultSet maxId = statement.executeQuery("SELECT MAX(categoryid) FROM category");
                        while(maxId.next()){
                            max = Integer.parseInt(maxId.getString(1));
                        }
                        for(int i=0; i<max; i++){
                           
                      
                            statement = coSql.createStatement();
                            String query = "SELECT * FROM category WHERE categoryID = " + i;
                            ResultSet resultset = statement.executeQuery(query);

                            if(!resultset.next()){
                                    this.u = null;
                            }
                            else{   
                                this.categoryID =  resultset.getString(1);
                                this.categoryName = resultset.getString(2);
                                this.u = new Category(categoryName, getnbEvent(categoryID) );
                                CategoryData.add(u);
                            }
			}
                }
                catch (SQLException e) {
                    e.printStackTrace();
		}
                return CategoryData;

	}
	
}
