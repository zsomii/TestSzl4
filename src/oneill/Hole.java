package oneill;


public class Hole extends Component {
	Location location;
	Hole(Location loc){}
	
	void kill(Player p){
		System.out.println("Get fucking killed m8");
	}
	void destroy(Box b){}
	Location getLocation(){
		return location;
	}
}
