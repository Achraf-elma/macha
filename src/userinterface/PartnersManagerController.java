/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import facade.PartnersFacade;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author maximesoustelle
 */
public class PartnersManagerController implements Initializable {

    @FXML
    private Button addBtn;
    
    private PartnersFacade pf = new PartnersFacade();
    @FXML
    private Button deleteBtn;
    @FXML
    private TextArea textArea;
    @FXML
    private Button showBtn;
    @FXML
    private Button updateBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void delete(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Delete User");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/userinterface/PartnerDelete.fxml"));
        
        Scene scene = new Scene(myPane);
        stage.setScene(scene);
        stage.show(); 
    }

    @FXML
    private void getAll(ActionEvent event) {
        textArea.setText(pf.getAll());
    }

    @FXML
    private void update(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Update User");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/userinterface/PartnerUpdate.fxml"));
        
        Scene scene = new Scene(myPane);
        stage.setScene(scene);
        stage.show(); 
    }

    @FXML
    private void add(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Add User");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/userinterface/PartnerAdd.fxml"));
        
        Scene scene = new Scene(myPane);
        stage.setScene(scene);
        stage.show(); 
    }
    
}
