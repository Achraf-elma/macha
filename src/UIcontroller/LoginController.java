package UIcontroller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import facade.UserIndexFacade;
import facade.UserLoginFacade;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import userinterface.UserIndexUI;
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
		private PasswordField txtPassWord ;
		
		@FXML
		private TextArea txtArea;
		
		
		// Config
		
		private String username;
		private String passWord = " ";
		private boolean connected;
		
		//
		
		private UserLoginFacade ulf = new UserLoginFacade();



		/**
		 * Method used by btnLogin from Java FX
		 * @throws IOException 
		 */
		 @FXML
		    private void login(ActionEvent e) throws IOException{
			 username = txtUsername.getText();
			 passWord = txtPassWord.getText();
		      if(username.equals("") || passWord.equals(""))
		      {
		    	  display("Enter ID or PSW");
		      }
		      else
		      {
		    	   ulf.login(username, passWord);
		    	   
		    	   if (ulf.getConnected())
		    	   {
		    		   display("Connected as " + username + " .");
		    		  callUserIndex();
		    	   }
		    	   else
		    	   {
		    		   display("Failed");
		    	   }
		      }
		    }

		 
		 private void callUserIndex() throws IOException{
	
			 
			  Stage stage = new Stage();
			    stage.setTitle("Shop Management");
			    FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/userinterface/UserIndex.fxml"));
			    //FXMLLoader myLoader = new FXMLLoader(YourClassHere.class.getResource("creatProduct.fxml"));
			    Pane myPane = (Pane) myLoader.load();            
			    Scene scene = new Scene(myPane);
			    stage.setScene(scene);
			    
			    stage.show();    
		      }

		 @FXML
		    private void signup(ActionEvent e){
			 
		    	   display("Sign up button pressed");
		      
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
