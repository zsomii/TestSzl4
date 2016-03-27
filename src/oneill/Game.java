package oneill;

import java.util.Date;

/*
 Attribútumok
time: Date: a játék kezdetének idejét tárolja.
game_time: Date: az aktuális átékidõt tárolja.
highScore: int:  az eddig elért legmagasabb pontszámot tárolja.
player: Player: a játékos
map: Map: az aktuálisan játszott pálya
Metódusok
Game(Date currentTime): az objektum konstruktora, létrehozza azt, a megadott paraméterek alapján.
void update():  frissíti a játékállást a Player cselekedetei alapján.
void quit(): bezárja a játékot.
void help(): megnyitja a Segítség menüt.
void showHighScore(): kiírja az aktuális highscore-t.
int getPlayerScore(): lekérdezi a játékos aktuális pontszámát */


//Date(int year, int month, int date, int hrs, int min, int sec)

public class Game {
	Date time;
	Date game_time;
	Map map;
	int highScore;
	Player player;
	
Game(Date date){}

void update(){}
void quit(){}
void help(){}
void showHighScore(){}
int getPlayerScore(){
	
	return player.getScore();
}

}
