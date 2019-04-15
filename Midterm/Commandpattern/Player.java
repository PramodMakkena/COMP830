package commandpattern;

import java.util.ArrayList;

public class Player {
	private static Player instance; 
	private static int xCoord;
	private static int yCoord;
	private ArrayList<String> coords = new ArrayList<String>();

	
	Player(){
		xCoord = 0;
		yCoord = 0;
	}
	 public static Player getInstance() {
		 if(instance == null) {
			 instance = new Player();
		 }
		 return instance;
	 }

	 public void setCoordinates(int x, int y) {
		 xCoord += x;
		 yCoord += y;
		 coords.add("X: " + String.valueOf(xCoord) + " Y: " + String.valueOf(yCoord));
	 }
	 
	 public String getCoordinates() {
		String coordinates = "X: " + String.valueOf(xCoord) + " Y: " + String.valueOf(yCoord);
		return coordinates;
	 }
	 
	 public void deleteLastMove() {
		 coords.remove(coords.size() - 1);
		 System.out.println(coords.toString());
	 }
}
