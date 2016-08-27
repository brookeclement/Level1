import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Random;

public class FortuneCookie implements ActionListener {
	public static void main(String []args)
	{
		FortuneCookie fortune = new FortuneCookie();
		fortune.showButton();
	}
	
	public void showButton()
	{
		System.out.println("fortune");
		JFrame frame = new JFrame();
		frame.setSize(201, 223);
		frame.setVisible(true);
		JButton button = new JButton();
		button.setSize(200, 200);
		button.setText("Click Here for a fortune");
		frame.add(button);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int random = new Random().nextInt(5);
		if(random == 0)
		{
			JOptionPane.showMessageDialog(null, "You'll have good luck soon!");
		}
		else if(random == 1)
		{
			JOptionPane.showMessageDialog(null, "Be careful! Bad luck is coming your way.");
		}
		else if(random == 2)
		{
			JOptionPane.showMessageDialog(null, "Everything is stable... for now.");
		}
		else if(random == 3)
		{
			JOptionPane.showMessageDialog(null, "You should probably stop relying on a fortune...");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Determine your own future! You don't need me.");
		}
	}
	
	FortuneCookie()
	{
		
	}

}
