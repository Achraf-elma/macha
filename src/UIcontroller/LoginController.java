package UIcontroller;


import java.net.URL;
import java.util.ResourceBundle;

import facade.UserLoginFacade;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class LoginController implements Initializable {

	
	// Java FX Implementation
		@FXML
		private Button btnLogin;
		
		@FXML
		private Button btnSignUp;
		
		@FXML
		private TextField txtUsername;
		
		@FXML
		private TextField txtPassWord;
		
		@FXML
		private TextArea txtArea;
		
		
		// Config
		
		private String username;
		private String passWord;
		private boolean connected;
		
		//
		
		private UserLoginFacade ulf = new UserLoginFacade();
		
		/**
		 * Method used by btnLogin from Java FX
		 */
		 @FXML
		    private void Login(ActionEvent e){
			 username = txtUsername.getText();
			 passWord = txtUsername.getText();
		      if(username.equals("") || passWord.equals(""))
		      {
		    	  txtArea.appendText("Enter ID or PSW");
		      }
		      else
		      {
		    	   ulf.login(username, passWord);
		    	   display("Sign in button pressed");
		      }
		    }

	
		 	public void display(String msg)
		 	{
		 	  txtArea.appendText(msg + "\n");
		 	}
		 	
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
}
