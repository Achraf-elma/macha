/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIcontroller;

import businessLogic.*;
import facade.*;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

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
    @FXML
    private Button deleteBtn;
    @FXML
    private Button closeBtn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        eventTable.getItems().addAll(allevents);
        eventTable.getSelectionModel().setCellSelectionEnabled(true);

    
        eventTable.setOnMousePressed(new EventHandler<MouseEvent>() {

            public void handle(MouseEvent event) {
                Event eventSelected = eventTable.getSelectionModel().getSelectedItem();
                EventUIController.setId(eventSelected.getEventid());
                Node  source = (Node)  event.getSource(); 
                Stage stage  = (Stage) source.getScene().getWindow();
                stage.close();
			                            
                Stage nextStage = new Stage();
                nextStage.setTitle("User Account");
                Pane myPane = null;
                try {
                    myPane = FXMLLoader.load(getClass().getResource("/userinterface/EventUI.fxml"));
                } catch (IOException ex) {
                    Logger.getLogger(EventListUIController.class.getName()).log(Level.SEVERE, null, ex);
                }

                Scene scene = new Scene(myPane);
                nextStage.setScene(scene);
                nextStage.show();
            }
        });
    }

    @FXML
    private void delete(ActionEvent event) throws IOException {
                    
        Stage nextStage = new Stage();
        nextStage.setTitle("Delete an event");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/userinterface/EventDeleteUI.fxml"));

        Scene scene = new Scene(myPane);
        nextStage.setScene(scene);
        nextStage.show(); 

    }

    @FXML
    private void close(ActionEvent event) {
        Node  source = (Node)  event.getSource(); 
        Stage oldStage  = (Stage) source.getScene().getWindow();
        oldStage.close();
    }
}
