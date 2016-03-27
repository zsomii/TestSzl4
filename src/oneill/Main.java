package oneill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Main {

	    public static void main(String[] args) {
	    	System.out.println("");
			System.out.println("");
		  /* Opciók kiírása */
			System.out.println("Szekvenciák:");
			System.out.println(" 1. New Game");
			System.out.println(" 2. Help");
			System.out.println(" 3. Step on Ground");
			System.out.println(" 4. Step into Hole");
			System.out.println(" 5. Step into Portal");
			System.out.println(" 6. Step on Scale");
			System.out.println(" 7. Bump into Wall");
			System.out.println(" 8. Step on ZPM");
			System.out.println(" 9. Create Portal");
			System.out.println("10. Pickup Box");
			System.out.println("11. Drop Box");
			System.out.println("12. Put Box on Scale");
			System.out.println("13. Exit Game");
			System.out.println("");
			
			 /* Opció kiválasztásának lekezelése */
			int choice= 0;
			do {
				try {
					System.out.print("Melyik szekvenciát szeretnéd látni? ");
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					String s= br.readLine();
					choice= Integer.parseInt(s);
				} catch (NumberFormatException e) {
					System.out.println("Számot adj meg!");
				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (!(choice > 0 && choice <= 13));
			
			Date d = new Date();
			Game g = new Game(d);
			
			System.out.println("");
			System.out.println("Játék elõkészítése...");
			System.out.println("");
			
			if (choice == 1) {			// new game
				startNewGame(g);
			} else if (choice == 2) {	// help screen
				openHelp(g);
			} else if (choice == 3) {	// step on ground
				stepOnGround(g);
			} else if (choice == 4) {	// step into hole
				stepIntoHole(g);
			} else if (choice == 5) {	// step into portal
				stepIntoPortal(g);
			} else if (choice == 6) {	// step on scale
				stepOnScale(g);
			} else if (choice == 7) {	// bump into wall
				bumpIntoWall(g);
			} else if (choice == 8) {	// step on ZPM
				stepOnZpm(g);
			} else if (choice == 9) {	// create portal
				createPortal(g);
			} else if (choice == 10) {	// pickup box
				pickupBox(g);
			} else if (choice == 11) {	// drop box
				dropBox(g);
			} else if (choice == 12) {	// put box on scale
				putBoxOnScale(g);
			} else if (choice == 13) {	// exit game
				exitGame(g);
			}
	    }
	    
	    public static void startNewGame(Game g) {
	    	System.out.println("Fucking new game m8");
	    }
	    
	    public static void openHelp(Game g) {
	    	System.out.println("Fucking help screen m8");
	    }
	    
	    public static void stepOnGround(Game g) {
	    	System.out.println("Fucking step m8");
	    }
	    
	    public static void stepIntoHole(Game g) {
	    	System.out.println("U fucking dead m8");
	    }
	    
	    public static void stepIntoPortal(Game g) {
	    	System.out.println("Magic teleportation m8");
	    }
	    
	    public static void stepOnScale(Game g) {
	    	System.out.println("Wow m8, you opened a door m8.");
	    }
	    
	    public static void bumpIntoWall(Game g) {
	    	System.out.println("U fucking hit your head m8");
	    }
	    
	    public static void stepOnZpm(Game g) {
	    	System.out.println("Wow m8, such ZPM much score");
	    }
	    
	    public static void createPortal(Game g) {
	    	System.out.println("Fucking portal shit m8");
	    }
	    
	    public static void pickupBox(Game g) {
	    	System.out.println("U fucking picked up a box m8");
	    }
	    
	    public static void dropBox(Game g) {
	    	System.out.println("U fucking dropped the box m8");
	    }
	    
	    public static void putBoxOnScale(Game g) {
	    	System.out.println("Wow, you opened a door m8");
	    }
	    
	    public static void exitGame(Game g) {
	    	System.out.println("U are about the exit the game m8, why would you do so?");
	    }

	}

