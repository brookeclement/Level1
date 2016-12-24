import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

	static Robot no;

	public static void main(String[] args) {
		int num;
		int r;
		int g;
		int b;
		Color passColor;
		no = new Robot();
		no.setSpeed(10);
		no.moveTo(100, 700);
		no.penDown();
		for (int i = 0; i < 5; i++) {
			r = new Random().nextInt(256);
			g = new Random().nextInt(256);
			b = new Random().nextInt(256);
			num = new Random().nextInt(500);
			passColor = new Color((float) r, (float) g, (float) b);
			pointyRoof(num, Color.blue);
			r = new Random().nextInt(256);
			g = new Random().nextInt(256);
			b = new Random().nextInt(256);
			num = new Random().nextInt(500);
			flatRoof(num, Color.magenta);
		}
	}

	public static void flatRoof(int height, Color color) {

		no.setPenColor(color);
		no.move(height);
		no.turn(90);
		no.move(50);
		no.turn(90);
		no.move(height);
		no.turn(270);
		no.setPenColor(Color.green);
		no.move(50);
		no.setPenColor(color);
		no.turn(270);
	}

	public static void pointyRoof(int height, Color color) {

		no.setPenColor(color);
		no.move(height);
		no.turn(30);
		no.move(50);
		no.turn(120);
		no.move(50);
		no.turn(30);
		no.move(height);
		no.turn(270);
		no.setPenColor(Color.green);
		no.move(50);
		no.setPenColor(color);
		no.turn(270);
	}

}
