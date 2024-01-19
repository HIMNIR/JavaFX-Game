package application;

import Objects.Player_Objects;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
	private static boolean up = false;
	private boolean down = false;
	private boolean left = false;
	private boolean right = false;
	private boolean up1 = false;
	private boolean down1 = false;
	private boolean left1 = false;
	private boolean right1 = false;
	private int scoreR = 0;
	private int scoreB = 0;

	ImageView amog_us;
	ImageView background;
	ImageView blue_object;
	Rectangle Boundary;
	Rectangle goalPost;
	Rectangle goalPost1;
	Text triangle = new Text();
	Rectangle rect = new Rectangle();
	Circle c;
	Text txt;
	Text txt1;
	Text redWins;
	Text blueWins;
	Timeline timeline1;
	Stage primaryStage;
	Scene scene;
	Scene scene1;
	GameManager gm = new GameManager();
	private BorderPane root = new BorderPane();
	

	Player_Objects po = new Player_Objects();

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Create the root pane and the scene
		root = new BorderPane();
		scene = new Scene(root, 1920, 1080);
		scene.setOnKeyPressed(keyPressed);
		scene.setOnKeyReleased(keyReleased);
		scene.setOnMouseClicked(mouseClicked);
	
//		scene.setOnMouseClicked(event);
		background();
		boundary();
		blue_object();
		red_object();

		circle();
		goalPost();
		goalPost1();

		txt();
		txt1();

		primaryStage.setScene(scene);
		primaryStage.show();
		timeline1 = timeline;
		timeline1.setCycleCount(Animation.INDEFINITE);
		timeline1.play(); // setting fps and time our animation runs for.
		timeline1.setRate(60);
	

	}

	public void remove() {

		root.getChildren().remove(c);
		root.getChildren().remove(amog_us);
		root.getChildren().remove(blue_object);
		root.getChildren().remove(txt);
		root.getChildren().remove(txt1);
		root.getChildren().remove(triangle);
		root.getChildren().remove(blueWins);
		root.getChildren().remove(redWins);
	}

	public void red_object() {
		amog_us = po.Amogus_object();

		add(amog_us);
	}

	public void blue_object() {
		blue_object = po.blue_object();

		add(blue_object);
	}

	public void goalPost() {
		goalPost = po.goalPost();
		add(goalPost);
	}

	public void goalPost1() {
		goalPost1 = po.goalPost1();
		add(goalPost1);

	}

	public void triangle() {
		triangle = po.triangle();
		add(triangle);
	}

	public void redWins() {
		redWins = po.redWins();
		add(redWins);
	}

	public void blueWins() {
		blueWins = po.blueWins();
		add(blueWins);
	}

	public void background() {

		background = po.Background();
		background.setFitWidth(root.getWidth());
		background.setFitHeight(root.getHeight());
		add(background);

	}

	public void boundary() {
		root.getChildren().add(po.Boundary(1920 / 2, 1032));
	}

	public void circle() {
		add(c = po.circle());
	}

	public void txt() {
		add(txt = po.textLeft(Integer.toString(scoreR)));
	}

	public void txt1() {
		add(txt1 = po.textRight(Integer.toString(scoreB)));
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void add(Node node) {
		root.getChildren().add(node);
	}

	public void reset() {

		circle();
		blue_object();
		red_object();

		add(txt = po.textLeft(Integer.toString(scoreR)));
		add(txt1 = po.textRight(Integer.toString(scoreB)));
	}

	public void resetScore() {
		scoreR = 0;
		scoreB = 0;
	}

	EventHandler<MouseEvent> mouseClicked = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent ms) {
			// TODO Auto-generated method stub
			if (ms.isPrimaryButtonDown()) {
				;

			}
		}

	};
	Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), ev -> {
		if (up == true) {
			amog_us.setY(amog_us.getY() - 7);
		}
		if (down == true) {
			amog_us.setY(amog_us.getY() + 7);
		}
		if (left == true) {
			amog_us.setX(amog_us.getX() - 5);
		}
		if (right == true) {
			amog_us.setX(amog_us.getX() + 5);
		}
		if (right == true && up == true) {
			amog_us.setX(amog_us.getX() + 5);
			amog_us.setY(amog_us.getY() - 7);
		}
		if (right == true && down == true) {
			amog_us.setX(amog_us.getX() + 5);
			amog_us.setY(amog_us.getY() + 7);
		}
		if (left == true && up == true) {
			amog_us.setX(amog_us.getX() - 5);
			amog_us.setY(amog_us.getY() - 7);
		}
		if (left == true && down == true) {
			amog_us.setX(amog_us.getX() - 5);
			amog_us.setY(amog_us.getY() + 7);
		}

		if (up1 == true) {
			blue_object.setY(blue_object.getY() - 7);

		}
		if (down1 == true) {
			blue_object.setY(blue_object.getY() + 7);
		}
		if (left1 == true) {
			blue_object.setX(blue_object.getX() - 5);
		}
		if (right1 == true) {
			blue_object.setX(blue_object.getX() + 5);
		}
		if (right1 == true && up1 == true) {
			blue_object.setX(blue_object.getX() + 5);
			blue_object.setY(blue_object.getY() - 7);
		}
		if (right1 == true && down1 == true) {
			blue_object.setX(blue_object.getX() + 5);
			blue_object.setY(blue_object.getY() + 7);
		}
		if (left1 == true && up1 == true) {
			blue_object.setX(blue_object.getX() - 5);
			blue_object.setY(blue_object.getY() - 7);
		}
		if (left1 == true && down1 == true) {
			blue_object.setX(blue_object.getX() - 5);
			blue_object.setY(blue_object.getY() + 7);
		}

		gm.methid(amog_us, blue_object, c);
		gm.run(amog_us, blue_object, c);

		if (c.getBoundsInParent().intersects(goalPost.getBoundsInParent())) {
			scoreB = scoreB + 1;
			remove();
			reset();

		}
		if (c.getBoundsInParent().intersects(goalPost1.getBoundsInParent())) {

			scoreR = scoreR + 1;
			remove();
			reset();

		}

		if (scoreR >= 5) {

			redWins();
			triangle();
			resetScore();
			root.getChildren().remove(c);
//			reset();
			triangle.setOnMouseClicked(mouseClicked -> {
				remove();
				resetScore();
				reset();

			});

		}

		if (scoreB >= 5) {

			blueWins();
			triangle();
			resetScore();
			root.getChildren().remove(c);
//			reset();
			triangle.setOnMouseClicked(mouseClicked -> {
				remove();
				resetScore();
				reset();

			});

		}

	}));

	EventHandler<KeyEvent> keyReleased = new EventHandler<KeyEvent>() {

		@Override
		public void handle(KeyEvent event) {

			if (event.getCode() == KeyCode.W) {
				up = false; // these key conditions stop the character from moving when no key is curently
							// being pressed.
			}
			if (event.getCode() == KeyCode.S) {
				down = false;
			}
			if (event.getCode() == KeyCode.A) {
				left = false;
			}
			if (event.getCode() == KeyCode.D) {
				right = false;
			}
			if (event.getCode() == KeyCode.UP) {
				up1 = false; // these key conditions stop the character from moving when no key is curently
								// being pressed.
			}
			if (event.getCode() == KeyCode.DOWN) {
				down1 = false;
			}
			if (event.getCode() == KeyCode.LEFT) {
				left1 = false;
			}
			if (event.getCode() == KeyCode.RIGHT) {
				right1 = false;
			}

		}

	};

	EventHandler<KeyEvent> keyPressed = new EventHandler<KeyEvent>() {

		@Override
		public void handle(KeyEvent event) {
//TODO Auto-generated method stub                    // key press events detect keys pressed on our keyboard
//these events also help continously move our character by holding the keys.
			if (event.getCode() == KeyCode.W) {
				up = true;

			}
			if (event.getCode() == KeyCode.S) {
				down = true;

			}
			if (event.getCode() == KeyCode.A) {
				left = true;

			}
			if (event.getCode() == KeyCode.D) {
				right = true;

			}
			if (event.getCode() == KeyCode.UP) {
				up1 = true;
			}
			if (event.getCode() == KeyCode.DOWN) {
				down1 = true;
			}
			if (event.getCode() == KeyCode.LEFT) {
				left1 = true;
			}
			if (event.getCode() == KeyCode.RIGHT) {
				right1 = true;
			}
		}
	};

}
