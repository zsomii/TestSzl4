package oneill;


public class Hole extends Component {
	Location location;
	Hole(Location loc){}
	
	void kill(Player p){}
	void destroy(Box b){}
	Location getLocation(){
		return location;
	}
}
