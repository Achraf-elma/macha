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

/**
 *
 * @author cyp
 */
public class EventDAOPostgres extends EventDAO {
    
    private Event event;
    
    String name;
    String categName;
    String location;
    String date;
    float price; 
    int capacity;
    String description;
	
    	private Connection coSql;

    public EventDAOPostgres(Connection coSql) {
	this.coSql = coSql;
    }
        
	public void createNewEvent(String eventName, String categ, String location, String date, float price, int capacity, String description){
       
            Statement statement;
		try {
			statement = coSql.createStatement();
			String query = "INSERT INTO events VALUES('" + eventName + "','" + categ + "','" + location + "', '" + date + "', " + price + ",'" + capacity + "','" + description +"')";
                        statement.executeUpdate(query);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
        };
}
