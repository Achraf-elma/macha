package UIcontroller;



import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.sql.Date;
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
			private TextField emailField;
			
			@FXML
			private PasswordField passwordField;
			
			@FXML
			private PasswordField passwordConfirmField;
			
			@FXML
			private DatePicker birthDatePicker;
			
			@FXML
			private Button validateNewUserButton;
		
			@FXML
			private Label lebel;
		
			 @FXML
			 private void welcome(){
				 
				
				 
				 validateNewUserButton.setOnAction(new EventHandler<ActionEvent>() {
				            @Override
				            public void handle(ActionEvent event) {
				            	
				            	
				            	System.out.println(nicknameField.getText());
				            	System.out.println(firstNameField.getText());
				            	System.out.println(lastNameField.getText());
				            	System.out.println(emailField.getText());
				            	System.out.println(passwordField.getText());
				            	System.out.println(passwordConfirmField.getText());
				            	
				            	if(!nicknameField.getText().isEmpty() && !firstNameField.getText().isEmpty() && !lastNameField.getText().isEmpty() && !emailField.getText().isEmpty() && !passwordField.getText().isEmpty() && !passwordConfirmField.getText().isEmpty()){
				            		if(passwordField.getText().equals(passwordConfirmField.getText())){
				            			
				            			Date birthDate = Date.valueOf(birthDatePicker.getValue());
				            			
				            			sf.signUp(nicknameField.getText(),passwordField.getText(),firstNameField.getText(),lastNameField.getText(),birthDate,emailField.getText());
				            			
				            			
				            			System.out.println("ok");
				            			
				            		}
				            	}else{
				            		System.out.println("Erreur champ manquant");
				            	}
				            	
				        }
				 });
				 
				 
				
			
				
			 } 

			@Override
			public void initialize(URL arg0, ResourceBundle arg1) {
				// TODO Auto-generated method stub
				welcome();
				
				
			}
			
}
