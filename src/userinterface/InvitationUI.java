package userinterface;

import java.io.IOException;

import UIcontroller.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InvitationUI extends Application {





	private Stage primaryStage;
	// private VBox chatLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		initInvitLayout();
	}

	private void initInvitLayout() throws IOException {

		FXMLLoader root = new FXMLLoader(getClass().getResource("Invitation.fxml"));
		//root.setController(new InvitationController());
		Parent parent = root.load();
		Scene scene = new Scene(parent);
		primaryStage.setTitle("Send Invitation");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
