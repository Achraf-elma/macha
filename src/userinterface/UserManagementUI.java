package userinterface;

 
import userinterface.userView.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class UserManagementUI extends Application {
 
    @Override
    public void start(Stage stage) throws Exception {
 
        FXMLLoader loader = new FXMLLoader(UserManagementUI.class.getResource("UserManagement.fxml"));
        
        Parent root = (Parent)loader.load();
        final UserManagementController controller = loader.getController();
        controller.setStage(stage);
 
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("User List");
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
 
}