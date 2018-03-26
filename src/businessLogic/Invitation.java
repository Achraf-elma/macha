package businessLogic;

import java.util.*;
import userinterface.*;

public class Invitation {

	
	private User senderUser;
	private User receiverUser;
	//private Event event;
	
	public Invitation(User sender, User receiver) {
		this.senderUser = sender;
		this.receiverUser = receiver;
	}
	
	
	
	public void display(Invitation inv) {
		System.out.println(inv.getSender() + " vous invite à  ");
		//System.out.println(inv.getSender() + " vous invite à  " + inv.getEvent());	
	}
		
	// GETTERS & SETTERS
	public User getSender() {
		return senderUser;
	}
	public void setSender(User sender) {
		this.senderUser = sender;
	}

	public User getReceiver() {
		return receiverUser;
	}
	public void setReceiver(User receiver) {
		this.receiverUser = receiver;
	}
	/*
	public User getEvent() {
		return event;
	}
	public void setEvent(User event) {
		this.event = event;
	}
	*/
	
}