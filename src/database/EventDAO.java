package database;

import businessLogic.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.ConnectionPostgreSQL;
import java.util.ArrayList;

public abstract class EventDAO {
	
    private Event event;
    
    String name;
    String categName;
    String location;
    String date;
    float price; 
    int capacity;
    String description;
	
	
	

			
	public abstract void createNewEvent(String eventName, String categ, String location, String date, float price, int capacity, String description);
	public abstract ArrayList<Event> getAllEvents();

	//public abstract Invitation createInvitation(User senderId, User receiverId, Event event);
	
}