import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener{
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	char currentLetter;
	
	public static void main(String[]args)
	{
		TypingTutor type = new TypingTutor();
		type.run();
	}
	
	
     public void run()
     {
	currentLetter = generateRandomLetter();	
	frame.setSize(300, 300);
	frame.setTitle("Typing Tutor");
	frame.setVisible(true);
	frame.add(label);
	label.setVisible(true);
	label.setText(""+ currentLetter);
	label.setFont(label.getFont().deriveFont(200.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.addKeyListener(this);
    }

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("You typed: " + e.getKeyChar());
		if(e.getKeyChar() == currentLetter)
		{
			System.out.println("Correct");
            frame.getContentPane().setBackground(Color.green);
		}
		else
		{
			System.out.println("Incorrect");
			frame.getContentPane().setBackground(Color.RED);
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
    currentLetter = generateRandomLetter();
    label.setText("" + currentLetter);
		
	}

	
}