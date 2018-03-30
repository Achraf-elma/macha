package userinterface;

import java.io.IOException;

import UIcontroller.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomeUI extends Application {





	private Stage primaryStage;
	// private VBox chatLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		initHomeLayout();
	}

	private void initHomeLayout() throws IOException {

		FXMLLoader root = new FXMLLoader(getClass().getResource("HomePage.fxml"));
		root.setController(new HomeController());
		Parent parent = root.load();
		Scene scene = new Scene(parent);
		primaryStage.setTitle("Home Page");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}