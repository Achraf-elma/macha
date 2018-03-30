/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIcontroller;

import businessLogic.*;
import facade.*;
import java.net.URL;
import java.util.*;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author cyp
 */


public class EventListUIController implements Initializable {

    /**
     * Initializes the controller class.
     */ 
    
    private EventFacade ef = new EventFacade();
 
    ObservableList<Event> allevents = ef.getAllEvents();
    @FXML
    private TableView<Event> eventTable;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        eventTable.getItems().addAll(allevents);
    }    
    
}
