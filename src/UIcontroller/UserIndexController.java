package UIcontroller;


import java.net.URL;
import java.util.ResourceBundle;

import facade.UserIndexFacade;
import facade.UserLoginFacade;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class UserIndexController implements Initializable {

	
	// Java FX Implementation
		
		
		@FXML
		private Label txtUsername;
		
		
		
		// Config
		
		 private String username = "h";
		
		//
		


	
		 @FXML
		    private void welcome(){
			 
		      txtUsername.setText("Welcome " + username);
		    }


		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			welcome();
		}
}
