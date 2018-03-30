/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene ;
import javafx.stage.Stage;
import userinterface.userView.UserListController;
import userinterface.userView.UserListMainUI;

/**
 *
 * @author h
 */
public class PartnerCRUDUI extends Application{
    @Override
    public void start(Stage stage) throws Exception {
 
        FXMLLoader loader = new FXMLLoader(PartnerCRUDUI.class.getResource("PartnersManager.fxml"));
        Parent root = (Parent)loader.load();
        final PartnersManagerController controller = loader.getController();
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
