import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {

	public static void main(String[]args)
	{
		World world = new World();
		Bug bug = new Bug();

		Location loc2 = new Location(4, 4);
		Flower flower = new Flower();
       for(int i = 0; i<10; i++)
       {
    	   for(int j = 0; j<10; j++)   
           {
    			Location loc1 = new Location(i, j);
        	   world.add(loc1, flower);
           }
       }
		world.show();

	}
	
}
