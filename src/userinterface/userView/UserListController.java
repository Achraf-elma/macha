package userinterface.userView;
 
import businessLogic.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
 import facade.*;
 
public class UserListController implements Initializable {
 
   private UserLoginFacade ulf = new UserLoginFacade();
    private ObservableList<User> PersonData = ulf.getAllUser();
 
    @FXML
    private Button button;
    @FXML
    private TableView<User> TVPerson;
  
 
 
    @FXML
    private void handleButtonAction(ActionEvent event) {
       stage.close();
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
       PersonData.add(new User("Smith","John", "H"));
       TVPerson.getItems().addAll(PersonData);
       }    
 
    Stage stage;
    void setStage(Stage stg){stage=stg;}
 
}