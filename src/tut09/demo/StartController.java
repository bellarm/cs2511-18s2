package tut09.demo;

import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class StartController {

	// Field with @FXML annotation are attributes
	// from the FXML file, and this is how they are
	// linked to the Java file.
	// The field name must be the same with the fx:id

	@FXML 
	private Button startButton;

	private Stage currStage;

	public StartController(Stage s) {
		currStage = s;
	}

	@FXML
	public void initialize() {

	}

	@FXML
	public void handleStartButton() {
		// This function will load the count screen.
		CountScreen cScreen = new CountScreen(currStage);
		cScreen.start();
	}

}