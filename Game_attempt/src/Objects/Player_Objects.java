package Objects;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class Player_Objects {
	public ImageView Background() {
		Image img = new Image("C:\\Users\\utsav\\eclipse-workspace\\Final project\\src\\background.png");
		ImageView imgV = new ImageView(img);

	// creating background object
		return imgV;
	}

	public ImageView Amogus_object() {
		Image img = new Image("C:\\Users\\utsav\\eclipse-workspace\\Game_attempt\\src\\image\\pic2.png");
		ImageView imgV2 = new ImageView(img);
		imgV2.setFitHeight(70);
		imgV2.setFitWidth(70);
		imgV2.setLayoutX(900);
		imgV2.setLayoutY(1032 / 2);
		// creating character object
		return imgV2;
	}

	public ImageView blue_object() {
		Image img = new Image("C:\\Users\\utsav\\eclipse-workspace\\Game_attempt\\src\\image\\pic3.png");
		ImageView imgV2 = new ImageView(img);
		imgV2.setFitHeight(70);
		imgV2.setFitWidth(70);
		imgV2.setLayoutX(1920/2);
		imgV2.setLayoutY(1032 / 2);
	
	
		// creating character object
		return imgV2;
	}

	public Rectangle Boundary(double width, double height) {

		Rectangle rect = new Rectangle();
		rect.setWidth(width);
		rect.setHeight(height);

		rect.setFill(Color.TRANSPARENT);
		return rect;
	}
	public Rectangle rect() {
	Rectangle label = new Rectangle();
	label.setWidth(200);
	label.setHeight(200);
	label.setX(1920/2);
	label.setY(900/2);
	label.setFill(Color.RED);
       
       // Create a group to hold the ci
		return label;
		
	
		
	}
	public Text triangle() {
	Text label = new Text("Restart Game");
	label.setFont(Font.font("Verdana", 40));
	label.setX((1920/2)-200);
	label.setY((900/3));
	label.setFill(Color.BLACK);
	label.setTextAlignment(TextAlignment.LEFT);
       
       // Create a group to hold the ci
		return label;
		
	
		
	}
	public Text redWins() {
	Text label = new Text("RED WINS!!!!!!!!!!");
	label.setFont(Font.font("Verdana", 50));
	label.setX(1920/3);
	label.setY(900/6);
	label.setFill(Color.PURPLE);
	label.setTextAlignment(TextAlignment.CENTER);
     
       // Create a group to hold the ci
		return label;
		
	
		
	}
	public Text blueWins() {
	Text label = new Text("BLUE WINS!!!!!!!!!!");
	label.setFont(Font.font("Verdana", 50));
	label.setX(1920/3);
	label.setY(900/6);
	label.setFill(Color.PURPLE);
	label.setTextAlignment(TextAlignment.CENTER);
       System.out.println("box here");
       // Create a group to hold the ci
		return label;
		
	
		
	}


	public Circle circle() {
	 Circle c = new Circle();
		c.setRadius(15);
		c.setFill(Color.RED);
		c.setLayoutX(1920/2);
		c.setLayoutY(20);
		
		return c;
		
	}
	public Rectangle goalPost() {
		Rectangle rect = new Rectangle();
		rect.setWidth(5);
		rect.setHeight(200);
		rect.setX(0);
		rect.setY(900/2);
		rect.setFill(Color.RED);
		
		return rect;
	}
	public Text textLeft(String x) {
		Text txt = new Text("Score : " + x);
		txt.setY(30);
		txt.setX(1920/4);
		txt.setFont(Font.font("Verdana", 20));
		txt.setFill(Color.RED);
		return txt;
		
	}
	public Text textRight(String x) {
		Text txt = new Text("Score : " + x);
		txt.setY(30);
		txt.setX((1920/4)*3);
		txt.setFont(Font.font("Verdana", 20));
		txt.setFill(Color.BLACK);
		return txt;
		
	}
	
	public Rectangle goalPost1() {
		Rectangle rect = new Rectangle();
		rect.setWidth(5);
		rect.setHeight(200);
		rect.setX(1915);
		rect.setY(900/2);
		rect.setFill(Color.BLACK);
		return rect;
	}
	
	
}
