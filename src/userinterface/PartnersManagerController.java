/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import facade.PartnersFacade;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
    private TextField addTF;
    @FXML
    private TextField deleteTF;
    @FXML
    private Button deleteBtn;
    @FXML
    private TextArea textArea;
    @FXML
    private Button showBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void test(ActionEvent event) {
        pf.add(addTF.getText());
    }

    @FXML
    private void delete(ActionEvent event) {
        pf.delete(deleteTF.getText());
    }

    @FXML
    private void getAll(ActionEvent event) {
        textArea.setText(pf.getAll());
    }
    
}
