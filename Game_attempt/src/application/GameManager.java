package application;

import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class GameManager {
	private boolean up = false;
	private boolean right = true;
	private boolean left;
	private boolean down;

	public void methid(ImageView amog_us, ImageView blue_object, Circle c) {

		if (amog_us.getX() > 0) {
			amog_us.setX(0);
		}
		if (amog_us.getX() < -905) {
			amog_us.setX(-905);
		}
		if (amog_us.getX() > 880) {
			amog_us.setX(880);
		}
		if (amog_us.getY() > 497) {
			amog_us.setY(495);
		}
		if (amog_us.getY() < -541) {
			amog_us.setY(-539);
		}
		if (blue_object.getX() < 0) {
			blue_object.setX(0);
		}
		if (blue_object.getY() > 497) {
			blue_object.setY(495);
		}
		if (blue_object.getY() < -541) {
			blue_object.setY(-539);
		}
		if (blue_object.getX() > 900) {
			blue_object.setX(900);
		}

		if (c.getCenterY() >= 999) {
			up = true;

		}

		if (up == false) {

			moveDown(c);
		}

		else {
			moveUp(c);

		}
		if (c.getCenterY() <= 0) {
			up = false;
		}
		if (c.getCenterX() > 942) {
			right = false;
		}
		if (right == true) {
			moveRight(c);

		} else if (right == false) {
			moveLeft(c);
		}
		if (c.getCenterX() <= -942) {
			right = true;
		}
	}

	public void moveUp(Circle c) {
		c.setCenterY(c.getCenterY() - 12);
	}

	public void moveDown(Circle c) {
		c.setCenterY(c.getCenterY() + 12);
	}

	public void moveRight(Circle c) {
		c.setCenterX(c.getCenterX() + 12);
	}

	public void moveLeft(Circle c) {
		c.setCenterX(c.getCenterX() - 12);
	}

	public boolean collisionX(ImageView x, ImageView blue_object, Circle c) {
		boolean xcol = false;
		if (x.getBoundsInParent().intersects(c.getBoundsInParent())) {

			xcol = true;
		}

		return xcol;

	}

	public boolean collisionY(ImageView x, ImageView blue_object, Circle c) {
		boolean ycol = false;
		if (blue_object.getBoundsInParent().intersects(c.getBoundsInParent())) {

			ycol = true;
		}

		return ycol;

	}



	public void run(ImageView x, ImageView blue_object, Circle c) {
		if (collisionX(x, blue_object, c)) {
			if (x.getX() < c.getCenterX()) {

				right = true;
			} else if (x.getX() > c.getCenterX()) {

				right = false;
			}
			if (x.getY() < c.getCenterY()) {

				up = false;

			}
			if (x.getY() > c.getCenterY()) {

				up = true;

			}

		}
		if (collisionY(x, blue_object, c)) {
			if (blue_object.getX() < c.getCenterX()) {

				right = true;
			} else if (blue_object.getX() > c.getCenterX()) {

				right = false;
			}
			if (blue_object.getY() < c.getCenterY()) {

				up = false;

			}

			if (blue_object.getY() > c.getCenterY()) {

				up = true;

			}

		}
	}
}
