import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JokeButton implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	
	
	public void makeButtons()
	{
		JFrame frame = new JFrame();
		frame.setSize(300, 70);
		frame.setVisible(true);
		panel.setSize(300, 100);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.setText("joke");
		button2.setText("punchline");
		panel.setVisible(true);
		button1.setVisible(true);
		button2.setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1)
		{
			JOptionPane.showMessageDialog(null, "joke");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "punchline");
		}
		
	}


}