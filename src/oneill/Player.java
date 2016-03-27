package oneill;

public class Player extends Component{
	
	Location location;
	int score;
	boolean isAlive;
	boolean hand;
	int direction; //0 = UP, 1 = DOWN, 2 = LEFT, 3= RIGHT
	
	
	Player(Location location){}
	void setLocation(Location loc){}
	Location getLocation(){
		return location;
	}
	void setScore(ZPM zpm){}
	
	int getScore(){
		return score;
	}
	
	void setState(boolean b){
		isAlive= b;
	}
	
	boolean getState(){
		return isAlive;
	}
	
	int getDirection(){
		return direction;
	}
	
	void pickUp(Box b){
		//felvétel függvénye
		hand = true;
	}
	
	void Drop(){
		//eldobás függvénye
		hand = false;
	}
	
	boolean Carry(){
		return hand;
	}
	
	Portal YellowShot(){
		//portálkészítés függvénye
		return;
		
	}
	
	Portal BlueShot(){
		//portálkészítés függvénye
		return;
	
	void Step(){}	
	
	

}
