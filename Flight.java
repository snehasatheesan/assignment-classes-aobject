3. Create Flight DTO class. Create appropriate instance variables, static variables and methods with appropriate access modifiers.

package classes;

public class flight {
	
	  
	    String flightName;
	    String departure;
	    String destination;
	  
	    static int flightNum = 0;
	    {
	        flightNum++;
	    }
	    public void display(){
	        System.out.println("Flight Name: "+this.flightName);
	        System.out.println("Departure: "+this.departure);
	        System.out.println("Destination: "+this.destination);
	    }
      }
