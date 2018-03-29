/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import businessLogic.*;
import java.sql.*;
import java.util.*;

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
    Statement statement;


    public EventDAOPostgres(Connection coSql) {
	this.coSql = coSql;
    }
        
    public void createNewEvent(String eventName, String categ, String location, String date, float price, int capacity, String description){
       
        
            try {
		statement = coSql.createStatement();
		String query = "INSERT INTO events VALUES('" + eventName + "','" + categ + "','" + location + "', '" + date + "', " + price + ",'" + capacity + "','" + description +"')";
                statement.executeUpdate(query);
			
		} 
            catch (SQLException e) {
			
		e.printStackTrace();
            }
        }
    
    public ArrayList<Event> getAllEvents(){
        ArrayList<Event> allevents = new ArrayList<>();
         try {
		statement = coSql.createStatement();
		String query = "SELECT * FROM events";
                ResultSet resultset = statement.executeQuery(query);
                
                 while(resultset.next()) {
                            allevents.add((Event) resultset);
                        }
		} 
            catch (SQLException e) {
			
		e.printStackTrace();
            }
         return allevents;
    }
        
        
}
