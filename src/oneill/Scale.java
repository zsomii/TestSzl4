package oneill;


/*
 * 4.3.11 Scale
● Felelősség
Alapból inaktív állapotban van, ha súly kerül rá(Box, Player), aktiválódik és kinyitja a hozzá
tartozó Door-t.
● Ősosztályok
abstract Component
● Interfészek
Nincsenek
● Attribútumok
● location: Location: ebben tároljuk el egy adott objektum koordinátáit.
● isActive: boolean: megadja, hogy van-e súly az adott objektumon.
● ID: int: az adott objektumhoz tartozó azonosító szám.
● Door_ID: az adott objektumhoz tartozó Door objektum azonosító száma.
● Metódusok
● Scale(Location location): az osztály konstruktora, beállítja a paraméterként
megadott értékeket.
● void setState(boolean b): beállítja egy Scale objektum isActive értékét a
paraméterben megadott értékre
● boolean getState(): visszaadja az adott objektum isActive attribútumának értékét
● Location getLocation(): megadja az adott objektum pozícióját.
● void OpenDoor(): a hozzá tartozó Door state-jét open-re változtatja.
● void CloseDoor(): a hozzá tartozó Door state-jét closed-ra változtatja.
 */
public class Scale extends Component{
	Location location;
	boolean isActive;
	static boolean steppable = false;
	int ID;
	int Door_ID;
	
	
	Scale(Location loc){}
	//konstruktor
	
	void setState(boolean b){
		isActive = b;
	}
	
	boolean getState(){
		return isActive;
	}
	
	Location getLocation(){
		return location;
	}
	
	void OpenDoor(){}
	void CloseDoor(){}
		
}
