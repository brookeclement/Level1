import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class TimingTest {
	public static void main(String [] args)
	{
		
	ArrayList<String> list = new ArrayList<String>();
	list.add("shivoo");
	list.add("hapless");
	list.add("irritating");
	list.add("stupendous");
	list.add("humdrum");
	list.add("beneficial");
	list.add("omniscient");
	list.add("voracious");
	list.add("woebegone");
	list.add("lackadasical");
	
	int ogSize = list.size();
	
	long time1 = System.nanoTime();
	
	for(int i = 0; i < ogSize; i++)
	{
		int rand = new Random().nextInt(list.size());
		inCheck(rand, list);		
	}
	long time2 = System.nanoTime();
	long timeDiff = time2 - time1;
	long seconds = TimeUnit.NANOSECONDS.toSeconds(timeDiff);
	JOptionPane.showMessageDialog(null, "Your time is: " + seconds + " seconds.");
	}	
	
	public static void inCheck(int check, ArrayList<String> a)
	{
		String input = JOptionPane.showInputDialog("Type this word: " + a.get(check));
		if(input.equalsIgnoreCase(a.get(check)))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
			a.remove(check);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect, try again.");
			inCheck(check, a);
		}
	
	}
}
