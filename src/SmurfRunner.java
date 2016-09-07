
public class SmurfRunner {

	public static void main(String []args)
	{
		Smurf handy = new Smurf("Handy");
		String name = handy.getName();
		handy.eat();
		System.out.println(name);
		
		Smurf papa = new Smurf("Papa");
		String name1 = papa.getName();
		String hat1 = papa.getHatColor();
		String gender1 = papa.isGirlOrBoy();
		System.out.println(name1);
		System.out.println(hat1);
		System.out.println(gender1);
		
		Smurf smurfette = new Smurf("Smurfette");
		String name2 = smurfette.getName();
		String hat2 = smurfette.getHatColor();
		String gender2 = smurfette.isGirlOrBoy();
		System.out.println(name2);
		System.out.println(hat2);
		System.out.println(gender2);
		
	}
	
}
