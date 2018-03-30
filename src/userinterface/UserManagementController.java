/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import businessLogic.User;
import facade.UserLoginFacade;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author h
 */
public class UserManagementController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private TableView<User> TVPerson;
     private UserLoginFacade ulf = new UserLoginFacade();
    private ObservableList<User> PersonData = ulf.getAllUser();
    @FXML
    private Button addBTN;
    @FXML
    private Button banBTN;
    @FXML
    private Button modifyBTN;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         TVPerson.getItems().addAll(PersonData);
         
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
        stage.close();
    }
    
     Stage stage;
    void setStage(Stage stg){stage=stg;}

    @FXML
    private void addAccount(ActionEvent event) throws IOException { 
        Stage stage = new Stage();
        stage.setTitle("Add User");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("UserAdd.fxml"));
        
        Node  source = (Node)  event.getSource(); 
        Stage oldStage  = (Stage) source.getScene().getWindow();
        oldStage.close();
        
        Scene scene = new Scene(myPane);
        stage.setScene(scene);
        stage.show(); 
    }

    @FXML
    private void removeAccount(ActionEvent event) throws IOException {
         Stage stage = new Stage();
        stage.setTitle("Delete User");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/userinterface/UserDelete.fxml"));
        
        Node  source = (Node)  event.getSource(); 
        Stage oldStage  = (Stage) source.getScene().getWindow();
        oldStage.close();
        
        Scene scene = new Scene(myPane);
        stage.setScene(scene);
        stage.show(); 
    }

    @FXML
    private void updateAccount(ActionEvent event) {
    }
    
}
