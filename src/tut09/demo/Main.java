package tut09.demo;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Set the size of the stage
		primaryStage.setHeight(220);
		primaryStage.setWidth(200);

		// Load the first screen
		StartScreen startScreen = new StartScreen(primaryStage);
		startScreen.start();
	}

	public static void main(String[] args) {
		launch(args);
	}
}