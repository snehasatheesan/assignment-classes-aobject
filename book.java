1. Create Book DTO class with attributes like title, ISBN etc. Create appropriate instance variables, static variables and methods with appropriate access modifiers.

package classes;

public class book {
            String title;
	        String genre;
	        int isbn;
	        static int bookNum=0;
	        {
	            bookNum++;
	        }
	        public void show(){
	            System.out.println("Title: "+this.title);
	            System.out.println("Genre: "+this.genre);
	            System.out.println("ISBN: "+this.isbn);
	        }
	        public int totalNum(){
	            return bookNum;
	        }
	    }
