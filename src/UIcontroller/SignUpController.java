package UIcontroller;



import java.net.URL;
import java.util.ResourceBundle;

import facade.SignUpFacade;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SignUpController implements Initializable {

			SignUpFacade sf = new SignUpFacade();
			
		// Java FX Implementation
			@FXML
			private TextField nicknameField;
		
			@FXML
			private TextField firstNameField;
			
			@FXML
			private TextField lastNameField;
			
			@FXML
			private TextField emailNameField;
			
			@FXML
			private PasswordField passwordField;
			
			@FXML
			private TextField passwordConfirmField;
			
			@FXML
			private DatePicker birthDatePicker;
			
			@FXML
			private Button validateNewUserButton;
		
			@FXML
			private Label lebel;
		
			 @FXML
			 private void welcome(){
				 
				/*	 
				 
				 validateNewUserButton.setOnAction(new EventHandler<ActionEvent>() {
				            @Override
				            public void handle(ActionEvent event) {
				            
				            	if(nicknameField.getText() != "" && firstNameField .getText() != "" && lastNameField .getText() != "" && emailNameField.getText() != "" && passwordField.getText() != "" && passwordConfirmField.getText() != ""){
				            		if(passwordField.getText() == passwordConfirmField.getText()){
				            			sf.createById(nicknameField.getText(),passwordField.getText(),firstNameField.getText(),lastNameFiel.getText(),dateBirth,adress.getText());
				            		}
				            		
				                System.out.println("Hello World!");
				            }
				        });
				 */
				 
				 System.out.println("ok");
			
				
			 } 

			@Override
			public void initialize(URL arg0, ResourceBundle arg1) {
				// TODO Auto-generated method stub
				welcome();
				
				
			}
			
}
