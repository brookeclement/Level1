import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses2 {
	
	private Robot no;
	private int height = 200;
	private Color color = Color.black;
	private int r = 0;
	private int g = 0;
	private int b = 0;
	private Color passColor;
	
	public Houses2()
	{
		no = new Robot();
		setBottomLeft();
	}
	
	public void setBottomLeft()
	{
		no.setX(10);
		no.setY(910);
		no.penDown();
		no.setSpeed(10);
	}
    
	public void drawHouse()
	{
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
	public void drawHouse(int height)
	{
		this.height = height;
		drawHouse();
	}

	public void drawHouse(String size)
	{
		if(size.equalsIgnoreCase("small"))
		{
			height = 60;
			drawHouse();
		}
		if(size.equalsIgnoreCase("medium"))
		{
			height = 120;
			drawHouse();
		}
		if(size.equalsIgnoreCase("large"))
		{
			height = 250;
			drawHouse();
		}
	}
	
	public void flatRoof(int height, Color color) {

		this.color = color;
		this.height = height;
		drawHouse();
		
	}

	public void pointyRoof(int height, Color color) {
		
		this.color = color;

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
	
	public Color newColor()
	{
		r = new Random().nextInt(256);
		g = new Random().nextInt(256);
		b = new Random().nextInt(256);
		passColor = new Color(r, g ,b);
				
		return passColor;
		
	}

}
