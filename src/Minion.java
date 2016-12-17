
public class Minion {
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	public Minion(String theName, int numEyes, String theColor, String theMaster)
	{
		name = theName;
		eyes = numEyes;
		color = theColor;
		master = theMaster;
	}

    public String getName()
    {
    	return name;
    }
	
    public void setName(String setName)
    {
    	name = setName;
    }
    
    public int getEyes()
    {
    	return eyes;
    }
    
    public void setEyes(int setEyes)
    {
    	eyes = setEyes;
    }
    
    public String getColor()
    {
    	return color;
    }
    
    public void setColor(String setColor)
    {
    	color = setColor;
    }
    
    public String getMaster()
    {
    	return master;
    }
    
    public void setMaster(String setMaster)
    {
    	master = setMaster;
    }
	
}
