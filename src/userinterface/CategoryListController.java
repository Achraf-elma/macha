package userinterface;
 
import businessLogic.Category;
import userinterface.userView.*;
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
 
public class CategoryListController implements Initializable {
 
   private CategoryFacade ulf = new CategoryFacade();
    private ObservableList<Category> CategoryData = ulf.getAll();
 
    @FXML
    private Button button;
    @FXML
    private TableView<Category> TVPerson;
  
 
 
    @FXML
    private void handleButtonAction(ActionEvent event) {
       stage.close();
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
       CategoryData.add(new Category("FUN","5"));
       TVPerson.getItems().addAll(CategoryData);
       }    
 
    Stage stage;
    void setStage(Stage stg){stage=stg;}
 
}