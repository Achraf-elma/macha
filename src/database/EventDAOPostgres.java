/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import businessLogic.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.*;
import javafx.scene.control.*;

/**
 *
 * @author cyp
 */
public class EventDAOPostgres extends EventDAO {
    
    private Event event;
    
    int eventid;
    String name;
    String categName;
    String location;
    String date;
    float price; 
    int capacity;
    String description;
    int organizator;
	
    private Connection coSql;
    Statement statement;
    
    private ObservableList<Event> eventData = FXCollections.observableArrayList();



    public EventDAOPostgres(Connection coSql) {
	this.coSql = coSql;
    }
        
    public void createNewEvent(String eventName, int categid, String location, String date, float price, int capacity, String description){
       
        
            try {
		statement = coSql.createStatement();
                String maxId = "SELECT MAX(eventid) FROM events";
                ResultSet result = statement.executeQuery(maxId);
                /*int max = 0;
                while(result.next()){
                    max = Integer.parseInt(result.getString(1)) + 1;
                }*/
		String query = "INSERT INTO events(eventname, eventdate, eventprice, eventadress, categoryid, organizatorid, maxparticipants, eventdescription)  VALUES('" + eventName + "','" + date + "'," + price + ", '" + location + "', " + categid + "," + "1," + capacity + ",'" + description +"')";
                statement.executeUpdate(query);
			
		} 
            catch (SQLException e) {
			
		e.printStackTrace();
            }
        }
    
    public Event createEventById(int eventid){
        Statement statement;
		try {
                    statement = coSql.createStatement();
           
		String query = "SELECT * FROM events WHERE eventid = " + eventid;
                System.out.println(query);
                ResultSet resultset = statement.executeQuery(query);
  
                while(resultset.next()){
                        ResultSet categSet = coSql.createStatement().executeQuery("SELECT categoryname FROM category WHERE categoryid = " + resultset.getString(6));  
                        
                        while(categSet.next()){
                            this.categName = categSet.getString(1);
                        }
                    System.out.println("yes");
                    this.eventid = Integer.parseInt(resultset.getString(1));
                    this.name = resultset.getString(2);
                    this.date = resultset.getString(3);
                    if(resultset.getString(4) != null){
                        this.price = Float.parseFloat(resultset.getString(4));
                    }
                    this.location = resultset.getString(5);
                    //this.categName = categName;
                    this.organizator = 2;
                    if(resultset.getString(8) != null){
                        this.capacity = Integer.parseInt(resultset.getString(8));
                    }
                    this.description = resultset.getString(9);
                    this.event = new Event(eventid, name, categName, location, description);
                }
                    
                
            }
        catch (SQLException e) {
            e.printStackTrace();
        }
             
         return event;
    }
    
    
    public ObservableList<Event> getAllEvents(){
         try {
            int max=0;
            statement = coSql.createStatement();
            ResultSet maxId = statement.executeQuery("SELECT MAX(eventid) FROM events");
            while(maxId.next()){
                max = Integer.parseInt(maxId.getString(1));
            }
            for(int i=0; i<max; i++){
                System.out.println("Tour " + i);
		String query = "SELECT * FROM events WHERE eventid = " + i;
                System.out.println(query);
                ResultSet resultset = statement.executeQuery(query);
  
                while(resultset.next()){
                        ResultSet categSet = coSql.createStatement().executeQuery("SELECT categoryname FROM category WHERE categoryid = " + resultset.getString(6));  
                        
                        while(categSet.next()){
                            this.categName = categSet.getString(1);
                        }
                    System.out.println("yes");
                    this.eventid = Integer.parseInt(resultset.getString(1));
                    this.name = resultset.getString(2);
                    this.date = resultset.getString(3);
                    if(resultset.getString(4) != null){
                        this.price = Float.parseFloat(resultset.getString(4));
                    }
                    this.location = resultset.getString(5);
                    //this.categName = categName;
                    this.organizator = 2;
                    if(resultset.getString(8) != null){
                        this.capacity = Integer.parseInt(resultset.getString(8));
                    }
                    this.description = resultset.getString(9);
                    this.event = new Event(eventid, name, categName, location, description);
                    System.out.println(event.toString());
                    eventData.add(event);
                }
                    
                
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
             
         return eventData;
    }
}
