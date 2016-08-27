
public class Spongebob {
	
	public static void main (String[]args)
	{
		SeaCreatures spongebob = new SeaCreatures("Spongebob");
		SeaCreatures patrick = new SeaCreatures("Patrick");
		SeaCreatures squidward = new SeaCreatures("Squidward");
		
		
		System.out.println(spongebob.getName());
		spongebob.eat();
		spongebob.laugh();
		
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();
		
		System.out.println(squidward.getName());
		squidward.eat();
		squidward.laugh();
	}


}
