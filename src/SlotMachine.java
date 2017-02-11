import java.util.Random;

import javax.swing.JOptionPane;

public class SlotMachine {

	private int betAmount;
	int num1;
	int num2;
	int num3;
	int won;

	public SlotMachine(int bet) {
		betAmount = bet;
		won = betAmount;
	}

	void pull() {
		JOptionPane.showMessageDialog(null, "You pulled the lever...");
		num1 = rollThingy();
		num2 = rollThingy();
		num3 = rollThingy();
	}

	int rollThingy() {
		Random rand = new Random();
		int num = rand.nextInt(3);
		return num;
	}

	void displayResults() {
		JOptionPane.showMessageDialog(null, "" + num1 + "   " + num2 + "   " + num3);
		if (num1 == num2 && num2 == num3) {
			if (num1 == 1) {
				JOptionPane.showMessageDialog(null, "You won: $" + won + "! Congrats, you got you money back!");
			} else if (num1 == 2) {
				won *= 2;
				JOptionPane.showMessageDialog(null, "You won: $" + won + "! Congrats, you won twice your money!!");
			} else {
				won = 0;
				JOptionPane.showMessageDialog(null, "You won: $" + won + "! You lost your money. Too bad!");
			}
		}

	}

}
