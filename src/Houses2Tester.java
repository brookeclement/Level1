import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses2Tester {
	
	
	public static void main(String[] args) {
		Houses2 house = new Houses2();
		Color color = house.newColor();
		for(int i = 0; i < 5; i++)
		{
		  int num;
		  num = new Random().nextInt(500);
		  color = house.newColor();
		  house.pointyRoof(num, color);
		  num = new Random().nextInt(500);
		  color = house.newColor();
		  house.flatRoof(num, color);
		}
	}


}
