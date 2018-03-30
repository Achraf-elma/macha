package UIcontroller;



import java.io.IOException;
import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.sql.Date;
import java.util.ResourceBundle;

import facade.UserAcountFacade;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.DatePicker;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class UserAccountController implements Initializable {
	
	@FXML
	private PasswordField currentPW ;
	
	@FXML
	private PasswordField newPW ;
	
	@FXML
	private PasswordField newPWconfirm ;
	
	@FXML
	private Label username;
	
	@FXML
	private Label userDatebirth;
	
	@FXML
	private Label userEmail;
	
	@FXML
	private Button validateNewPW;
	
	@FXML
	private Button deleteAccountButton;
	
	
	
	private UserAcountFacade uaf = new UserAcountFacade();

	 @FXML
	 private void getUser() throws IOException{
	    	   
	    	   

	    	  
	   }
	    

	 
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}
}