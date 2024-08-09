5. Write two DTO classes to exhibit the has-a relationship given in the diagram. https://cdn-proxy.slickplan.com/wp-content/uploads/2023/10/8_uml.png

package classes;

public class player {
	
	    public String name;
	    public String position;
	    public int jerseyNumber;

	    public void playGame(){
	        System.out.println("The game is played");
	    }

	    public void train(){
	        System.out.println("The players are training themselves for match");
	    }
	}

