5. Write two DTO classes to exhibit the has-a relationship given in the diagram. https://cdn-proxy.slickplan.com/wp-content/uploads/2023/10/8_uml.png.

package classes;

import java.util.ArrayList;

public class team {

	    
	    public String Name;
	    public String City;
	    public String Division;
	    
	    public ArrayList<player> player;

	    public void playGame(){
	        System.out.println("The game is played");
	    }

	    public void hireCoach(){
	        System.out.println("A coach has been hired");
	    }
	   
	}

