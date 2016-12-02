package day2a;

public class Finger {
	
	private Location location;
	private StringBuilder code;
	
	public Finger() {
		location = new Location(1, 1);
		code = new StringBuilder();
	}
	
	public void execute(Direction[] directions) {
		// Move finger
		for (Direction direction : directions) {
			location.move(direction);
		}
		
		// Press button
		code.append(getNumber());
	}
	
	private int getNumber() {
		return location.getY() * 3 + location.getX() + 1;
	}
	
	public String getCode() {
		return code.toString();
	}
}
