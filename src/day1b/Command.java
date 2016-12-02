package day1b;

public class Command {
	
	private int distance;
	private Turn turn;
	
	public Command(String commandString) {
		commandString = commandString.replace(",", "");
		
		turn = Turn.valueOf(commandString.substring(0, 1));
		distance = Integer.parseInt(commandString.substring(1));
	}
	
	public int getDistance() {
		return distance;
	}
	
	public Turn getTurn() {
		return turn;
	}
}
