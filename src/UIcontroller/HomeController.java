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

public class HomeController implements Initializable{
	@FXML
	private Button btnEvents;

	@FXML
	private Button btnCreateEvent;

	@FXML
	private Button btnInvitations;

	@FXML
	private Button btnAccount;

	@FXML
	private Button btnMessages;

	@FXML
	private Button btnQuit;

	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}