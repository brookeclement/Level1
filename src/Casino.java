
public class Casino {

	public static void main(String[] args) {
		SlotMachine slot = new SlotMachine(100);
		slot.pull();
		slot.displayResults();
	}

}
