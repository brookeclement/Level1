import java.awt.Component;
import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
		
		// 1. Create a frame & make it visible
		JFrame frame = new JFrame();
		frame.setVisible(true);
		// 2. Add the panel to the frame
		frame.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands
        panel.setBackgroundImage(galapagosIslands); 
        frame.pack();
		// 4. Instantiate a Turtle
       
		// 5. Add the turtle to the panel
        for(int i = 0; i<50; i++)
        {	
          Turtle turtle = new Turtle();
    	  int y = new Random().nextInt(300) + 150;
    	  int x = new Random().nextInt(600);
          panel.addTurtle(turtle);
          turtle.setX(x);
          turtle.setY(y);
        }
		// 6. Put 50 Turtles on the beach
        
        
	}
}