/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLogic;

import java.util.*;

/**
 *
 * @author cyp
 */
public class Event {
    
    String name;
    String categ;
    String location;
    String date;
    float price; 
    
    public Event(String name, String categ, String location, String date, float price){
        this.name=name;
        this.categ=categ;
        this.location=location;
        this.date=date;
        this.price=price;
    }
}
