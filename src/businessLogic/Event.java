/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLogic;

import java.util.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author cyp
 */
public class Event {
    
    
    private StringProperty nameProperty;
    private StringProperty locationProperty;
    private StringProperty categProperty;
    private StringProperty descriptionProperty;
    
    private StringProperty dateProperty;
    private StringProperty priceProperty;
    private StringProperty capacityProperty;
    private StringProperty organizatorProperty;
    
    
    private String name;
    private String categ;
    private String location;
    private String date;
    private float price;
    private int capacity;
    private String description;
    private int organizator;
    
    
    public Event(String name, String categ, String location, String date, float price, int organizator, int capacity, String description){
        this.name=name;
        this.categ=categ;
        this.location=location;
        this.date=date;
        this.price=price;
        this.organizator = organizator;
        this.capacity = capacity;
        this.description = description;
    }
    
    public Event(String name, String categ, String location, String description){
        this.nameProperty = new SimpleStringProperty(name);
        this.categProperty = new SimpleStringProperty(categ);
        this.locationProperty = new SimpleStringProperty(location);
        this.descriptionProperty = new SimpleStringProperty(description);
    }

    /**
     * @return the name
     */
    public String getName() {
        return nameProperty.get();
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.nameProperty.set(name);
    }

    /**
     * @return the categ
     */
    public String getCateg() {
        return categProperty.get();
    }

    /**
     * @param categ the categ to set
     */
    public void setCateg(String categ) {
        this.categProperty.set(categ);
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return locationProperty.get();
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.locationProperty.set(location);
    }

    /**
     * @return the date
     */
    public String getDate() {
        return dateProperty.get();
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.dateProperty.set(date);
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return priceProperty.get();
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.priceProperty.set(String.valueOf(price));
    }

    /**
     * @return the capacity
     */
    public String getCapacity() {
        return capacityProperty.get();
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacityProperty.set(String.valueOf(capacity));
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return descriptionProperty.get();
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.descriptionProperty.set(description);
    }

    /**
     * @return the organizator
     */
    public String getOrganizator() {
        return organizatorProperty.get();
    }

    /**
     * @param organizator the organizator to set
     */
    public void setOrganizator(int organizator) {
        this.organizatorProperty.set(String.valueOf(organizator));
    }
}
