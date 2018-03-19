package userinterface;

import java.io.IOException;

import UIcontroller.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UserIndexUI extends Application {

	private Stage primaryStage;
	// private VBox chatLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		initLoginLayout();
	}

	private void initLoginLayout() throws IOException {

		FXMLLoader root = new FXMLLoader(getClass().getResource("UserIndex.fxml"));
		root.setController(new UserIndexController());
		Parent parent = root.load();
		Scene scene = new Scene(parent);
		primaryStage.setTitle("My Account");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
