/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import facade.PartnersFacade;
import facade.UserLoginFacade;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author maximesoustelle
 */
public class UserAddController implements Initializable {

    private TextField nameTF;
    private TextField descTF;
    @FXML
    private Button saveBtn;
    private UserLoginFacade pf = new UserLoginFacade();
    @FXML
    private TextField nicknameTF;
    @FXML
    private TextField firstnameTF;
    @FXML
    private TextField lastNameTF;
    @FXML
    private TextField addresseTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveAction(ActionEvent event) throws IOException {
        pf.add(this.nicknameTF.getText(), this.firstnameTF.getText(), this.lastNameTF.getText(), this.addresseTF.getText());
        Node  source = (Node)  event.getSource(); 
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
        
        Stage newStage = new Stage();
        newStage.setTitle("View");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/userinterface/UserManagement.fxml"));
        
        Scene scene = new Scene(myPane);
        newStage.setScene(scene);
        newStage.show(); 
    }
    
}
