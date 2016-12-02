package day1b;

import java.util.HashSet;
import java.util.Set;

public class Agent {
	
	private int x;					
	private int y;		
	private int facingDirection;
	private Set<Location> visitedLocations;
	
	public Agent() {
		x = 0;									// starting point
		y = 0;									// starting point
		facingDirection = 0;					// facing N
		visitedLocations = new HashSet<>();		// all visited locations
		markMyLocation();						// starting location
	}
	
	public void execute(Command command) {
		turn(command.getTurn());
		walk(command.getDistance());
	}
	
	private void turn(Turn turn) {
		switch (turn) {
			case L: facingDirection = Math.floorMod(facingDirection - 1, 4); break;
			case R: facingDirection = Math.floorMod(facingDirection + 1, 4); break;
		}
	}
	
	private void walk(int distance) {
		switch (checkCompass()) {
			case N: y++; break;
			case S: y--; break;
			case E: x++; break;
			case W: x--; break;
		}
		markMyLocation();
		distance--;
		
		if (distance > 0) {
			walk(distance);
		}
	}
	
	private Direction checkCompass() {
		return Direction.values()[facingDirection];
	}
	
	private Location getLocation() {
		return new Location(x, y);
	}
	
	private void markMyLocation() {
		Location currentLocation = getLocation();
		if (visitedLocations.contains(currentLocation)) {
			System.out.println("Already visited " + currentLocation + " distance: " + currentLocation.getDistanceFromStart());
		}
		visitedLocations.add(getLocation());
	}
}
