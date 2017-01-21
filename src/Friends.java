public class Friends {


	public static void main(String[] args){
    	//3. Create an instance of Classmate for each person in your class.
   	 Classmate grant = new Classmate();
   	Classmate eli = new Classmate();
   	Classmate dalia = new Classmate();
   	Classmate yashwin = new Classmate();
    	//4. set descriptions for each Classmate
   	 grant.setDescription("Has an obsession with DisneyLand");
   	eli.setDescription("Secretly Russian... probably helped Trump win election...?");
   	dalia.setDescription("Cheater");
   	yashwin.setDescription("Why is he even here");
   	 //5. Use your getter to print out each description
   	 System.out.println(grant.getDescription());
   	System.out.println(eli.getDescription());
   	System.out.println(dalia.getDescription());
   	System.out.println(yashwin.getDescription());
	}





}
class Classmate{
	String description;
    
	//1. create a setter that sets a description for this person
    public void setDescription(String des)
    {
    	description = des;
    }
	//2. create a getter that gets a description of this person
    public String getDescription()
    {
    	return description;
    }

}