/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import businessLogic.*;
import database.*;
import java.util.*;
import javafx.collections.*;

/**
 *
 * @author cyp
 */
public class EventFacade {
    
    private AbstractDAOFactory af = new PostgresFactory();
    private EventDAO ed = af.createEventDAO();
    
    public ObservableList<Event> getAllEvents(){
            return ed.getAllEvents();
        }
    
    public void delete(String name) {
	ed.deleteEventByName(name);
    }
        
    public Event getEventById(int eventid){
        return ed.createEventById(eventid);
    }
}
