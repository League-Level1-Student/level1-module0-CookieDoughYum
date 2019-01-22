package extra;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		house.setX(50);
		house.setY(500);
		Random randy = new Random();
		String size = "";
		int h = 0;
		Random pop = new Random();
		for (int i = 0; i < 10; i++) {
			h = randy.nextInt(3);
			Color color = Color.BLUE;
			// int height=new Random().nextInt(100)+10;
			if (h == 0) {
				size = "small";
				color = Color.blue;
				drawPointyRoof(size, color);

			} else if (h == 1) {
				size = "medium";
				color = Color.ORANGE;
				drawPointyRoof(size, color);
			} else if (h == 2) {
				size = "large";
				color = Color.yellow;
				drawFlatRoof(size, color);
			}

		}

	}

	static Robot house = new Robot();

	public static void drawFlatRoof(String size, Color c) {
		String small = "small";
		String medium = "medium";
		String large = "large";
		int n = 0;
		if (size.equals(small)) {
			n = 60;
		} else if (size.equals(medium)) {
			n = 120;
		} else if (size.equals(large)) {
			n = 250;
		}
		house.setPenColor(c);
		house.setSpeed(50);
		house.penDown();
		house.move(n);
		house.turn(90);
		house.move(30);
		house.turn(90);
		house.move(n);
		house.turn(90);
		house.turn(180);
		house.move(50);
		house.turn(270);
	}

	public static void drawPointyRoof(String size, Color c) {
		String small = "small";
		String medium = "medium";
		String large = "large";
		int n = 0;
		if (size.equals(small)) {
			n = 60;
		} else if (size.equals(medium)) {
			n = 120;
		} else if (size.equals(large)) {
			n = 250;
		}
		house.setPenColor(c);
		house.setSpeed(50);
		house.penDown();
		house.move(n);
		house.turn(45);
		house.move(15);
		house.turn(90);
		house.move(15);
		house.turn(45);
		house.move(n);
		house.turn(270);
		house.move(30);
		house.turn(270);
	}

}
