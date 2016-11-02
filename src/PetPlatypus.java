public class PetPlatypus {
	private String name;

	public PetPlatypus(String platypusName)
	{
		name = platypusName;
	}
	
	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		PetPlatypus plat = new PetPlatypus("Plat");
		//2. Call the sayHi method
		plat.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
	}
}