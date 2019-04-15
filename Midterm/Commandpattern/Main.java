package commandpattern;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int number;
		Player p = new Player();
		CommandInvoker c = new CommandInvoker();
		
		for(int x = 0; x < 50; x++) {
			Random randy = new Random();
			number = randy.nextInt(4) + 1;
			switch(number)
			{
			case 1:
				MoveNorth moveNorth = new MoveNorth(0,1);
				c.setCommand(moveNorth);
				c.execute();
				break;
			case 2:
				MoveEast moveEast = new MoveEast(1,0);
				c.setCommand(moveEast);
				c.execute();
				break;
			case 3:
				MoveSouth moveSouth = new MoveSouth(0,-1);
				c.setCommand(moveSouth);
				c.execute();
				break;
			case 4:
				MoveWest moveWest = new MoveWest(0,-1);
				c.setCommand(moveWest);
				c.execute();
				break;
			default: 
				System.out.println("Not a command"); 
			}
		}
		for(int x = 0; x < 50; x++) {
			c.undo();
		}
		
	}

}
