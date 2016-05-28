 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
int i = 0;
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String picture1 = "http://totallyhistory.com/wp-content/uploads/2011/11/Mona_Lisa_by_Leonardo_da_Vinci.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component art1;
		// 3. use the "createImage()" method below to initialize your Component
art1 = createImage(picture1);
		// 4. add the image to the quiz window
quizWindow.add(art1);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer1 = JOptionPane.showInputDialog("What is the name of this art piece?");
		// 7. print "CORRECT" if the user gave the right answer
if(answer1.equalsIgnoreCase("mona lisa"))
{
	JOptionPane.showMessageDialog(null, "CORRECT");
	i=i+1;
}
else
{
	JOptionPane.showMessageDialog(null, "INCORRECT: The answer is Mona Lisa.");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(art1);
		// 10. find another image and create it (might take more than one line of code)
String picture2 = "http://totallyhistory.com/wp-content/uploads/2011/11/Da_Vinci_The_Last_Supper.jpg";
Component art2;
art2 = createImage(picture2);
quizWindow.add(art2);
quizWindow.pack();
String answer2 = JOptionPane.showInputDialog("What is the name of this art piece?");
if(answer2.equalsIgnoreCase("the last supper"))
{
	JOptionPane.showMessageDialog(null, "CORRECT");
	i=i+1;
}
else
{
	JOptionPane.showMessageDialog(null, "INCORRECT:The answer is The Last Supper.");
}
quizWindow.remove(art2);

String picture3 = "http://totallyhistory.com/wp-content/uploads/2011/11/Van_Gogh_-_Starry_Night.jpg";
Component art3;
art3 = createImage(picture3);
quizWindow.add(art3);
quizWindow.pack();
String answer3 = JOptionPane.showInputDialog("What is the name of this art piece?");
if(answer3.equalsIgnoreCase("starry night"))
{
	JOptionPane.showMessageDialog(null, "CORRECT");
	i=i+1;
}
else
{
	JOptionPane.showMessageDialog(null, "INCORRECT: THe answer is Starry Night.");
}
quizWindow.remove(art3);

String picture4 = "http://totallyhistory.com/wp-content/uploads/2011/11/Raphael-School-of-Athens.jpg";
Component art4;
art4 = createImage(picture4);
quizWindow.add(art4);
quizWindow.pack();
String answer4 = JOptionPane.showInputDialog("What is the name of this art piece?");
if(answer4.equalsIgnoreCase("school of athens"))
{
	JOptionPane.showMessageDialog(null, "CORRECT");
	i=i+1;
}
else
{
	JOptionPane.showMessageDialog(null, "INCORRECT:The answer is School of Athens.");
}
quizWindow.remove(art4);

String picture5 = "http://totallyhistory.com/wp-content/uploads/2011/11/The_Scream.jpg";
Component art5;
art5 = createImage(picture5);
quizWindow.add(art5);
quizWindow.pack();
String answer5 = JOptionPane.showInputDialog("What is the name of this art piece?");
if(answer5.equalsIgnoreCase("the scream"))
{
	JOptionPane.showMessageDialog(null, "CORRECT");
	i=i+1;
}
else
{
	JOptionPane.showMessageDialog(null, "INCORRECT: The answer is The Scream.");
}
quizWindow.remove(art5);

String picture6 = "http://totallyhistory.com/wp-content/uploads/2011/11/His-Station-and-Four-Aces-CM-Coolidge.jpg";
Component art6;
art6 = createImage(picture6);
quizWindow.add(art6);
quizWindow.pack();
String answer6 = JOptionPane.showInputDialog("What is the name of this art piece?");
if(answer6.equalsIgnoreCase("dogs playing poker"))
{
	JOptionPane.showMessageDialog(null, "CORRECT");
	i=i+1;
}
else
{
	JOptionPane.showMessageDialog(null, "INCORRECT: The answer is Dogs Playing Poker.");
}
quizWindow.remove(art6);

String picture7 = "http://totallyhistory.com/wp-content/uploads/2011/11/The_Persistence_of_Memory.jpg";
Component art7;
art7 = createImage(picture7);
quizWindow.add(art7);
quizWindow.pack();
String answer7 = JOptionPane.showInputDialog("What is the name of this art piece?");
if(answer7.equalsIgnoreCase("the persistence of memory"))
{
	JOptionPane.showMessageDialog(null, "CORRECT");
	i=i+1;
}
else
{
	JOptionPane.showMessageDialog(null, "INCORRECT: The answer is The Persistence of Memory.");
}
quizWindow.remove(art7);

String picture8 = "http://totallyhistory.com/wp-content/uploads/2011/11/American_Gothic.jpg";
Component art8;
art8 = createImage(picture8);
quizWindow.add(art8);
quizWindow.pack();
String answer8 = JOptionPane.showInputDialog("What is the name of this art piece?");
if(answer8.equalsIgnoreCase("American Gothic"))
{
	JOptionPane.showMessageDialog(null, "CORRECT");
	i=i+1;
}
else
{
	JOptionPane.showMessageDialog(null, "INCORRECT: The answer is American Gothic.");
}
quizWindow.remove(art7);



JOptionPane.showMessageDialog(null, "Your score is: "+i+"/8");


	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





