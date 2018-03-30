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
import javafx.fxml.Initializable;

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        ArrayList<Event> allevents = new ArrayList<>();
    }    
    
}
