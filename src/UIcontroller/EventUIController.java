/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIcontroller;

import businessLogic.Event;
import facade.EventFacade;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author mahe
 */
public class EventUIController implements Initializable {

    private static int id;
    
    @FXML
    private Label nameLabel;
    @FXML
    private TextArea descripField;
    @FXML
    private Label capacityLabel;
    @FXML
    private Label priceLabel;
    @FXML
    private Label categoryLabel;
    @FXML
    private TextArea addressField;

    /**
     * Initializes the controller class.
     */
    
    private EventFacade ef = new EventFacade();

    private Event event = ef.getEventById(this.id);
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.nameLabel.setText(event.getName());
        this.descripField.setText(event.getDescription());
        this.capacityLabel.setText(String.valueOf(event.getCapacity()));
        this.priceLabel.setText(String.valueOf(event.getPrice()));
        this.categoryLabel.setText(event.getCateg());
        this.addressField.setText(event.getLocation());
    }
    
            
    public static void setId(int eventid){
        id = eventid;
    }
}
