package tut09.demo;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class CountController {
	
	@FXML
	private Button backButton;
	@FXML
	private TextField numberField;

	private Stage currStage;
	private int count;

	public CountController(Stage s) {
		currStage = s;
		count = 0;
	}

	@FXML
	public void initialize() {
		// Display the initial value in numberField.
		numberField.setText(String.valueOf(count));		
	}

	@FXML
	public void handleBackButton() {
		StartScreen screen = new StartScreen(currStage);
		screen.start();
	}
	@FXML
	public void handlePlusButton() {		
		numberField.setText(String.valueOf(++count));
	}

	@FXML
	public void handleMinusButton() {
		numberField.setText(String.valueOf(--count));
	}
}