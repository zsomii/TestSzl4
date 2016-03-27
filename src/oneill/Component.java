package oneill;

public abstract class Component {
	Location location;
	boolean steppable;
	
	Location getLocation()
	{	
		System.out.println("        "+this.getClass().getName()+": getLocation() -> "+this.location);
		return location;
	}
	
	void setLocation(Location value)
	{
		System.out.println("        "+this.getClass().getName()+": setLocation() -> "+value);
		location = value;
	}
	
	boolean getSteppable(){
		System.out.println("        "+this.getClass().getName()+": getStepable() -> "+this.stepable);
		return steppable;
	}
	
	void setSteppable(boolean b){
		System.out.println("        "+this.getClass().getName()+": setStepable() -> "+b);
		steppable = b;
	}
}
