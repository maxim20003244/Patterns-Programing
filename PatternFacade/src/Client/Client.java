package Client;

import java.awt.List;
import java.util.ArrayList;


import parts.Door;
import parts.Key;
import parts.turn;

public class Client {
	
	Door door = new Door();
	Key key =new Key();
	turn turn = new turn();

	public void goo () {
		door.open();
		key.key();
		turn.swich();
	}
}
