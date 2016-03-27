package oneill;
/*
 * 4.3.12 Wall
● Felelősség
Áthatolhatatlan akadályok a pályán, amiken ha a játékos mégis át szeretne jutni, Portal-lá kell
alakítania.
● Ősosztályok
abstract Component
● Interfészek
Nincsenek
● Attribútumok
● location: Location: ebben tároljuk el egy adott objektum koordinátáit.
● Metódusok
● Wall(Location location): az osztály konstruktora, beállítja a paraméterként
megadott értékeket.
● void setLocation(Location value): beállítja az objektum helyét a pályán.
● Location getLocation(): megadja az adott objektum pozícióját.
 */
public class Wall extends Component{
	Location location;
	
	Wall(Location loc){}
	//konstruktor
	
	void setLocation(Location loc){
		location = loc;
	}
	
	Location getLocation(){
		return location;
	}
	

}
