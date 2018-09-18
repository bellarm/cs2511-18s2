package tut09.demo;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartScreen {

	private Stage s;
	private String title;
	private FXMLLoader fxmlLoader;

	public StartScreen(Stage s) {
		this.s = s;
		this.title = "Start Screen";
		// Load the FXML file we created using SceneBuilder
		this.fxmlLoader = new FXMLLoader(getClass().getResource("start.fxml"));
	}

	public void start() {
		s.setTitle(title);
		fxmlLoader.setController(new StartController(s));
		try {
			Parent root = fxmlLoader.load();
			Scene sc = new Scene(root);
			s.setScene(sc);
			s.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}