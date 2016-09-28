import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
    
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField input = new JTextField(20);
	JTextField answer = new JTextField(20);
	JButton button = new JButton();
	private String binary;
	
    public void makeConverter()
    {
    	button.setText("CONVERT");
    	button.addActionListener(this);
    	frame.add(panel);
    	panel.add(input);
    	panel.add(button);
    	panel.add(answer);
    	frame.pack();
    	frame.setVisible(true);
    	panel.setVisible(true);
    	input.setVisible(true);
    	answer.setVisible(true);
    	button.setVisible(true);
    	
    }
    
  
    
   /* int convert(String binary) {
		if(binary.length() != 8){
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		 if(!Pattern.matches("\2", binary)) {
			 JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
				return 0;
		 }
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			//question.setText("");
			return 0;
		}
		}
		
*/
				
	
	String convert(String binary1) 
	 {
	   	 int asciiValue = Integer.parseInt(binary1, 2);
	   	 char theLetter = (char) asciiValue;
	   	 return "" + theLetter;
	    }




	@Override
	public void actionPerformed(ActionEvent e) {
		binary = input.getText();
		System.out.println(binary);
		System.out.println(convert(binary));
		answer.setText(convert(binary));
		
	}	
}
