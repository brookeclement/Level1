public class TeaParty {
	
	
public String welcome(String lastName, boolean isWoman, boolean isKnighted)
    {    	   
    	   if(isWoman == true)
    	   {
    		   if(isKnighted == true)
    		   {
    			   return "Hello Lady " + lastName;
    		   }
    		   else
    		   {
    			   return "Hello Ms. " + lastName;
    		   }
    	   }
    	   else
    	   {
    		   if(isKnighted == true)
    		   {
    			   return "Hello Sir " + lastName;
    		   }
    		   else
    		   {
    			   return "Hello Mr. " + lastName;
    		   }
    	   }
    }

}