package userinterface;

import java.io.IOException;

import UIcontroller.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class PrivateMessagesCenterUI extends Application {

	 Stage primaryStage;
	// private VBox chatLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		initLoginLayout();
	}

	private void initLoginLayout() throws IOException {

		FXMLLoader root = new FXMLLoader(getClass().getResource("PrivateMessagesCenterUI.fxml"));
		//root.setController(new LoginController());
		Parent parent = root.load();
		Scene scene = new Scene(parent);
		primaryStage.setTitle("Private Messages");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}



