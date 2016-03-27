/**
 * 
 */
package oneill;

/**
 * @author Adam
 *
 */



public class Box extends Component{
	Location location;
	boolean isCarried;
	int box_ID;
	
	Box(Location location){}
	
	void setState(boolean b){
		isCarried = b;
	}
	
	boolean getState(){
		return isCarried;
	}
	
	Location getLocation(){
		return location;
	}
	
	/*Beállíthatjuk egy adott objektum helyét a képernyõn*/
	void setLocation(Location loc){
		location = loc;
	}
	
	

}
