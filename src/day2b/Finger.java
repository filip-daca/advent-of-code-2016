package day2b;

public class Finger {
	
	private Location location;
	private StringBuilder code;
	
	public Finger() {
		location = new Location(0, 2);
		code = new StringBuilder();
	}
	
	public void execute(Direction[] directions) {
		// Move finger
		for (Direction direction : directions) {
			Location newLocation = location.move(direction);
			if (newLocation.isValid()) {
				location = newLocation;
			}
		}
		
		// Press button
		code.append(location.getNumber());
	}
	
	public String getCode() {
		return code.toString();
	}
}
