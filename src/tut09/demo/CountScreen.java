package tut09.demo;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CountScreen {

	private Stage s;
	private String title;
	private FXMLLoader fxmlLoader;

	public CountScreen(Stage s) {
		this.s = s;
		this.title = "Count Screen";
		this.fxmlLoader = new FXMLLoader(getClass().getResource("count.fxml"));
	}

	public void start() {
		s.setTitle(title);
		fxmlLoader.setController(new CountController(s));
		try {
			Parent root = fxmlLoader.load();
			Scene scene = new Scene(root);
			s.setScene(scene);
			s.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}