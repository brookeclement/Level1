import java.awt.Dimension;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/league/Desktop/ChristopherEccleston.jpeg";
	String secondImage = "/Users/league/Desktop/DavidTennant.jpg";
	String thirdImage = "/Users/league/Desktop/MattSmith.jpg";

	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
			window.setSize(90, 90);
		// Make an int variable to hold the score.
int score = 0;
		// Ask the user who this person is and store their answer
String guess = JOptionPane.showInputDialog("Who is this person?");
		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1
if(guess.equalsIgnoreCase("christopher eccleston")){
	JOptionPane.showMessageDialog(null, "Correct");
	score=score+1;
}
		// Otherwise:
		// -- Tell them they are wrong
else{
JOptionPane.showMessageDialog(null, "Incorrect");	
}
String guessNumber = JOptionPane.showInputDialog("What number is he?");
// If they got the answer right:
// -- Tell them they are correct.
// -- Increase the score by 1
if(guessNumber.equalsIgnoreCase("9")){
JOptionPane.showMessageDialog(null, "Correct");
score=score+1;
}
// Otherwise:
// -- Tell them they are wrong
else{
JOptionPane.showMessageDialog(null, "Incorrect");	
}

showNextImage();
// Set the size of the window so that you can only see part of the image.
window.setSize(90, 90);
// Make an int variable to hold the score.
// Ask the user who this person is and store their answer
String guess2 = JOptionPane.showInputDialog("Who is this person?");
// If they got the answer right:
// -- Tell them they are correct.
// -- Increase the score by 1
if(guess2.equalsIgnoreCase("david tennant")){
JOptionPane.showMessageDialog(null, "Correct");
score=score+1;
}
// Otherwise:
// -- Tell them they are wrong
else{
JOptionPane.showMessageDialog(null, "Incorrect");	
}
String guessNumber2 = JOptionPane.showInputDialog("What number is he?");
//If they got the answer right:
//-- Tell them they are correct.
//-- Increase the score by 1
if(guessNumber2.equalsIgnoreCase("10")){
JOptionPane.showMessageDialog(null, "Correct");
score=score+1;
}
showNextImage();
// Set the size of the window so that you can only see part of the image.
window.setSize(300, 300);
// Make an int variable to hold the score.

// Ask the user who this person is and store their answer
String guess3 = JOptionPane.showInputDialog("Who is this person?");
// If they got the answer right:
// -- Tell them they are correct.
// -- Increase the score by 1
if(guess3.equalsIgnoreCase("matt smith")){
JOptionPane.showMessageDialog(null, "Correct");
score=score+1;
}
// Otherwise:
// -- Tell them they are wrong
else{
JOptionPane.showMessageDialog(null, "Incorrect");	
}
String guessNumber3 = JOptionPane.showInputDialog("What number is he?");
//If they got the answer right:
//-- Tell them they are correct.
//-- Increase the score by 1
if(guessNumber3.equalsIgnoreCase("11")){
JOptionPane.showMessageDialog(null, "Correct");
score=score+1;
}
else{
JOptionPane.showMessageDialog(null, "Incorrect");	
}
String connection = JOptionPane.showInputDialog("What is their connection?");
//If they got the answer right:
//-- Tell them they are correct.
//-- Increase the score by 1
if(connection.equalsIgnoreCase("doctor who")){
JOptionPane.showMessageDialog(null, "Correct");
score=score+1;
}
else{
JOptionPane.showMessageDialog(null, "Incorrect");	
}
		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
JOptionPane.showMessageDialog(null, "Total Score: "+ score);
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}


