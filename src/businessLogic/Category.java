/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author h
 */
public class Category {
    
     private String numberOfEvent;
     private String categoryName;
     
     private StringProperty numberOfEventProperty;
     private  StringProperty categoryNameProperty;
     
     public Category(String categoryName, String numberOfEvent) {
         numberOfEventProperty = new SimpleStringProperty(numberOfEvent);
         categoryNameProperty = new SimpleStringProperty(categoryName);
     }

    /**
     * @return the numberOfEvent
     */
    public String getNumberOfEvent() {
        return this.numberOfEventProperty.get();
    }

    /**
     * @param numberOfEvent the numberOfEvent to set
     */
    public void setNumberOfEvent(String numberOfEvent) {
        this.numberOfEventProperty.set(numberOfEvent);
    }

    /**
     * @return the categoryName
     */
    public String getCategoryName() {
        return this.categoryNameProperty.get();
    }

    /**
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryNameProperty.set(categoryName);
    }
     
     
     
    
}
