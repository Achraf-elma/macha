package UIcontroller;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import userinterface.userView.*;

import businessLogic.User;
import facade.InvitationFacade;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
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
	private Button btnCreateEvent;

	@FXML
	private Button btnInvitations;
	
	@FXML
	private Button btnPartners;


	@FXML
	private Button btnAccount;

	@FXML
	private Button btnMessages;

	@FXML
	private Button btnQuit;

        @FXML
	private Button btnAdmin;
    @FXML
    private Button btnEvent;
    @FXML
    private Button categBtn;

	@FXML
	private void viewEvents(ActionEvent e) throws IOException{
		
                    
        Stage nextStage = new Stage();
        nextStage.setTitle("Events");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/userinterface/EventListUI.fxml"));

        Scene scene = new Scene(myPane);
        nextStage.setScene(scene);
        nextStage.show(); 
	}
	
	@FXML
	private void viewPartners(ActionEvent e)throws IOException{
		
                    
        Stage nextStage = new Stage();
        nextStage.setTitle("Partners");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/userinterface/PartnersManager.fxml"));

        Scene scene = new Scene(myPane);
        nextStage.setScene(scene);
        nextStage.show(); 
	}
	
	@FXML
	private void viewInvitations(ActionEvent e)throws IOException{
		
                    
        Stage nextStage = new Stage();
        nextStage.setTitle("Invitations");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/userinterface/Invitation.fxml"));

        Scene scene = new Scene(myPane);
        nextStage.setScene(scene);
        nextStage.show(); 
	}
	
	@FXML
	private void viewAccount(ActionEvent e)throws IOException{
		
                    
        Stage nextStage = new Stage();
        nextStage.setTitle("User Account");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/userinterface/UserAccount.fxml"));

        Scene scene = new Scene(myPane);
        nextStage.setScene(scene);
        nextStage.show(); 
	}
	
	@FXML
	private void viewMessages(ActionEvent e)throws IOException{
		
                    
        Stage nextStage = new Stage();
        nextStage.setTitle("Messages");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/userinterface/userView/UserList.fxml"));

        Scene scene = new Scene(myPane);
        nextStage.setScene(scene);
        nextStage.show(); 
	}
	
        @FXML
	private void viewUserManagement(ActionEvent e)throws IOException{
		
                    
        Stage nextStage = new Stage();
        nextStage.setTitle("User Management");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/userinterface/UserManagement.fxml"));

        Scene scene = new Scene(myPane);
        nextStage.setScene(scene);
        nextStage.show(); 
	}
        
	@FXML
	private void quitApp(ActionEvent e){
		Node  source = (Node)  e.getSource(); 
        Stage oldStage  = (Stage) source.getScene().getWindow();
        oldStage.close();
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

    @FXML
    private void viewEventCreation(ActionEvent event) throws IOException {
        
        Stage nextStage = new Stage();
        nextStage.setTitle("Event creation");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/userinterface/EventCreationUI.fxml"));

        Scene scene = new Scene(myPane);
        nextStage.setScene(scene);
        nextStage.show(); 
    }

    @FXML
    private void viewCategoryList(ActionEvent event)throws IOException {
        
        Stage nextStage = new Stage();
        nextStage.setTitle("Categories");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/userinterface/CategoryList.fxml"));

        Scene scene = new Scene(myPane);
        nextStage.setScene(scene);
        nextStage.show(); 
    }
}