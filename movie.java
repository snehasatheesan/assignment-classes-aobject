4. Create a Movie DTO class

package classes;

public class movie {
	    String actress;
	    String actor;
	    String genre;
	    String songs;
	    float budget;
	    public void display(){
	        System.out.println("Actor: "+this.actor);
	        System.out.println("Actress: "+this.actress);
	        System.out.println("Genre: "+this.genre);
	        System.out.println("Songs: "+this.songs);
	        System.out.println("Budget: "+this.budget);
	    }
	}

