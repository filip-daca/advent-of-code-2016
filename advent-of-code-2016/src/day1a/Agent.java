package day1a;

public class Agent {
	
	private int x = 0;					// starting point
	private int y = 0;					// starting point
	private int facingDirection = 0;	// facing N
	
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
			case N: y += distance; break;
			case S: y -= distance; break;
			case E: x += distance; break;
			case W: x -= distance; break;
		}
	}
	
	private Direction checkCompass() {
		return Direction.values()[facingDirection];
	}
	
	public int getDistanceFromStart() {
		return Math.abs(x) + Math.abs(y);
	}
}
