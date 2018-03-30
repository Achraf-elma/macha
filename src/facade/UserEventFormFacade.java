/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import database.*;

/**
 *
 * @author cyp
 */
public class UserEventFormFacade {
    
        private AbstractDAOFactory af = new PostgresFactory();
	private EventDAO ed = af.createEventDAO();
    
        public void createEvent(String name, String category, String location, String date, float price, int capacity, String description){
            ed.createNewEvent(name, category, location, date, price, capacity, description);
        }
}
