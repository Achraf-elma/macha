/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import facade.*;
import java.text.*;
import java.time.format.*;
import javafx.scene.control.DatePicker;

/**
 * FXML Controller class
 *
 * @author cyp
 */
public class EventCreationUIController implements Initializable {

    @FXML
    private Button addBtn;
    @FXML
    private TextField nameField;
    @FXML
    private TextField locationField;
    @FXML
    private TextField priceField;
    @FXML
    private TextField capacityField;
    @FXML
    private TextArea descriptionField;
    @FXML
    private ListView<?> categList;

    @FXML
    private DatePicker datePicker;
                
                
    /**
     * Initializes the controller class.
     */ private String eventName = " ";
        private int categId = 1;
	private String location = " ";
        private String date = " ";
        private float price = 0;
        private int capacity = 0;
        private String description = " ";
		
		//
		
	private UserEventFormFacade uef = new UserEventFormFacade();
        
        
       

    @FXML
    private void addEvent(ActionEvent event) {
        eventName = nameField.getText();
        location = locationField.getText();
        date = datePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        price = Float.parseFloat(priceField.getText());
        capacity = Integer.parseInt(capacityField.getText());
        description = descriptionField.getText();
        
        uef.createEvent(eventName, categId, location, date, price, capacity, description);
        
        System.out.println("Event added ! ");
    }
    
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}
