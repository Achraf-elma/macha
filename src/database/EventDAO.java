package database;

import businessLogic.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.ConnectionPostgreSQL;
import java.util.ArrayList;
import javafx.collections.*;

public abstract class EventDAO {
	
    private Event event;
    
    String name;
    String categName;
    String location;
    String date;
    float price; 
    int capacity;
    String description;
	
	
	

        public abstract void createNewEvent(String eventName, int categid, String location, String date, float price, int capacity, String description);			
	public abstract ObservableList<Event> getAllEvents();
        public abstract Event createEventById(int eventid);
        public abstract void deleteEventByName(String name);
    


	//public abstract Invitation createInvitation(User senderId, User receiverId, Event event);
	
}