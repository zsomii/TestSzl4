package oneill;

import java.util.Date;

public class Main {

	    public Main() {
	        System.out.println("Hellóka!");	        
	        Date date = new Date();
	        Game game = new Game(date);
	        System.out.println("Első változtatás!");	
	    }

	    public static void main(String[] args) {
	        new Main();
	    }

	}

