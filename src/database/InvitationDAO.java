package database;

import businessLogic.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.ConnectionPostgreSQL;

public abstract class InvitationDAO {
	
	private Invitation i;
	protected User sender;
	protected User receiver;
	//private Event event;
	private Connection coSql;
	
	

			
	public abstract Invitation createInvitation(User senderId, User receiverId);
	

	//public abstract Invitation createInvitation(User senderId, User receiverId, Event event);
	
}