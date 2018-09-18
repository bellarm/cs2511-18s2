package tut09.key;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

	// The size is 600x400, assume that each box is 40x40
	private static final double WIDTH = 400;
	private static final double HEIGHT = 400;
	private static final int SQUARE_SIZE = 40;
	private static final String CHARACTER_LOC =
			"http://icons.iconarchive.com/icons/mad-science/arcade-saturdays/32/Pac-Man-icon.png";
	private Image characterImage;
	private Node characterNode;

	@Override
	public void start(Stage stage) throws Exception {

		// Load the image and make it a node.
		characterImage = new Image(CHARACTER_LOC);
		characterNode = new ImageView(characterImage);
		Group dungeon = new Group(characterNode);
		move(0, 0);

		Scene scene = new Scene(dungeon, WIDTH, HEIGHT, Color.BLACK);

		// Set the key listener
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch (event.getCode()) {
				case UP:
					move(0, -1);
					break;
				case DOWN:
					move(0, 1);
					break;
				case LEFT:
					move(-1, 0); 
					break;
				case RIGHT:
					move(1, 0);
					break;
				default:
					break;
				}
				System.out.println("LOC: (" + characterNode.getLayoutX() +
						", " + characterNode.getLayoutY() + ")");
			}
		});
		stage.setScene(scene);
		stage.show();
	}

	private void move(int dx, int dy) {
		dx *= SQUARE_SIZE;
		dy *= SQUARE_SIZE;
		
		// Get the current location of the image.
		double cx = characterNode.getBoundsInLocal().getWidth() / 2;
		double cy = characterNode.getBoundsInLocal().getHeight() / 2;

		double x = cx + characterNode.getLayoutX() + dx;
		double y = cy + characterNode.getLayoutY() + dy;

		// Move the character if doesn't go outside the stage
		if (x - cx >= 0 && x + cx <= WIDTH &&
				y - cy >= 0 && y + cy <= HEIGHT) {
			characterNode.relocate(x - cx, y - cy);
		}
	}

	public static void main(String[] args) { 
		launch(args); 
	}
}
