package day4b;

public class Room {
	
	private int number;
	private String roomName;
	
	public Room(String label) {
		number = Integer.parseInt(label.substring(label.lastIndexOf('-') + 1, label.indexOf('[')));
		roomName = decipherName(label.substring(0, label.lastIndexOf('-')));
	}
	
	private String decipherName(String caption) {
		StringBuilder sb = new StringBuilder();
		for (char c : caption.toCharArray()) {
			sb.append(decipherChar(c, number));
		}
		return sb.toString();
	}
	
	private Object decipherChar(char c, int number) {
		if (c == '-') {
			return ' ';
		} else {
			return Character.valueOf((char) ('a' + (c - 'a' + number) % (26)));
		}
	}
	
	@Override
	public String toString() {
		return roomName + " " + number;
	}
}
