/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import businessLogic.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author h
 */
public class MainApp {
     
    private ObservableList<User> personData = FXCollections.observableArrayList();
    
    public MainApp() {
        
        personData.add(new User("Cyprien", "Spaenle"));
    }
    
    public ObservableList<User> getPersonData() {
        return personData;
    }
}
