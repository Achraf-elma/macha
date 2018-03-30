
	
package userinterface;

import java.io.IOException;

import UIcontroller.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UserAccountUI extends Application {





			private Stage primaryStage;
			// private VBox chatLayout;

			@Override
			public void start(Stage primaryStage) throws IOException {
				this.primaryStage = primaryStage;
				initUserAccountLayout();
			}

			private void initUserAccountLayout() throws IOException {

				FXMLLoader root = new FXMLLoader(getClass().getResource("UserAccount.fxml"));
				root.setController(new UserAccountController());
				Parent parent = root.load();
				Scene scene = new Scene(parent);
				primaryStage.setTitle("Your profile");
				primaryStage.setScene(scene);
				primaryStage.show();
			}

			public static void main(String[] args) {
				launch(args);
			}
	}