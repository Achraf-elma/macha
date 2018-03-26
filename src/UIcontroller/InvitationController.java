
package UIcontroller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import businessLogic.User;
import facade.InvitationFacade;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import userinterface.UserIndexUI;
import javafx.event.ActionEvent;

public class InvitationController implements Initializable{


	
	// Java FX Implementation
		@FXML
		private Button btnSearchFriend;

		@FXML
		private Button btnSendInvite;

		
		@FXML
		private TextField txtSearchFriend;
		
		
		@FXML
		private ListView<User> listResultsSearchFriend;
		
		@FXML
		private ListView<User> listAddedFriends;

		
		//
		int idEvent;
		
		
		
		private InvitationFacade ulf = new InvitationFacade();



		/**
		 * Method used by btnLogin from Java FX
		 * @throws IOException 
		 
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
*/

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
}