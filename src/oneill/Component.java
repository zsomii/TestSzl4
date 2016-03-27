package oneill;

public abstract class Component {
	Location location;
	boolean steppable;
	
	Location getLocation()
	{
		return location;
	}
	
	void setLocation(Location value)
	{
		location = value;
	}
	
	boolean getSteppable(){
		
		return steppable;
	}
	
	void setSteppable(boolean b){
		steppable = b;
	}
}
