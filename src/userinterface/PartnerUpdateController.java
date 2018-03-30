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
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author maximesoustelle
 */
public class PartnerUpdateController implements Initializable {

    @FXML
    private TextField descTF;
    @FXML
    private Button saveBtn;
    @FXML
    private TextField nameTF;
    private PartnersFacade pf = new PartnersFacade();
    @FXML
    private TextField updateTF;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void update(ActionEvent event) throws IOException {
        pf.update(this.nameTF.getText(), this.descTF.getText(), this.updateTF.getText());
        Node  source = (Node)  event.getSource(); 
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
        
        Stage newStage = new Stage();
        newStage.setTitle("View");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/userinterface/PartnersManager.fxml"));
        
        Scene scene = new Scene(myPane);
        newStage.setScene(scene);
        newStage.show(); 
    }
    
}
