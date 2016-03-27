package oneill;

import java.util.Date;

public class Main {
	
Date date;
	    public Main() {
	        System.out.println("Indul a szkeleton!");
	        
	        Date date = new Date();
	        
	        Game game = new Game(date);
	        System.out.println("Milyen nehézségû játékot szeretnél?(1-3)");
	    }

	    public static void main(String[] args) {
	        new Main();
	    }

	}

