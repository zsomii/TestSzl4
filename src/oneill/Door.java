package oneill;


/*Olyan objektum amely zárt állapotban áthatolhatatlan viszont nyitott állapotban a játékos át tud haladni rajta. 
Minden egyes ilyen Door objektumhoz tartozik egy Scale objektum amely az adott objektumhoz tartozó scale_ID azonosít.
Ha az ehhez tartozó Scale objektumra Box vagy Player objektum kerül akkor ez a Door objektum nyitva lesz.*/
public class Door  extends Component{
	Location location;
	boolean isOpen;
	int scale_ID;
	int ID;
	
	//A Door osztály konstruktora, ami  létrehoz egy Door objektumot a megadott függvényparaméterekkel
	Door(Location loc, int ID, int scale_ID){
		
	}
	
	//Beállítja egy Door objektum isOpen értékét a paraméterben megadott értékre
	void setState(boolean b){
		isOpen = b;
	}
	
	//Vissza adja az adott objektum isOpen attribútumának értékét
	boolean getState(){
		return isOpen;
	}
	
	//Vissza adja az adott Door objektumhoz tartozó Scale objektum azonosító számát (scale_ID)
	int getScale_ID(){
		return scale_ID;
	}
}
