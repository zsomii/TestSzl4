package oneill;

/*4.3.9 Player

● Felelősség

Megvalósítja a mozgást, lövést, felelős a tárgyak felvételéért, hordozásáért és áthelyezésért.
ZPM modulokat képes gyűjteni a pályán. Amennyiben bele esik egy Hole-ba, akkor
megsemmisül, így a játéknak vége.
● Ősosztályok
abstract Component
● Interfészek
Nincsenek.
● Attribútumok:
● location: Location: ebben tároljuk el egy adott objektum koordinátáit.
● score: int: tárolja a játékos által eddig elért pontszámot.
● isAlive: boolean: megadja hogy él-e a játékos.
● hand: boolean: megadja, hogy van-e játékosnál tárgy.
● Metódusok:
● Player(Location location): az osztály konstruktora, létrehoz egy objektumot a
függvényparaméterekben megadott értékekkel
● void setLocation(Location value): beállítja az objektum helyét a pályán.
● Location getLocation(): megadja az adott objektum pozícióját.
● void setScore(ZPM zpm): beállítja a játékos pontszámát, ehhez használja az adott
zpm értéket, amit tőle kérdez le
● int getScore(): visszaadja a játékos jelenlegi pontszámát.
● void setState(boolean value): beállítja a Player isAlive értékét a paraméterben
megadott értékre
● boolean getState(): visszaadja az adott objektum isAlive attribútumának értékét
● enum getDirection(): megadja a karakter irányát.
● void Pickup(Box b): felvesz egy tárgyat amivel azonos a location-je és a hand
attribútum értékét igazra állítja
● void Drop(): ledobja a nála lévő tárgyat a jelenlegi location-jére és a hand attribútum
értékét hamisra állítja
● bool Carry(): megadja, hogy a játékosnál van-e tárgy.
● Portal YellowShot(): sárga Portal-lá alakít egy Wall-t.
● Portal BlueShot(): kék Portal-lá alakít egy Wall-t
● void Step(): átállítja a játékos location-jét.
*/
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
