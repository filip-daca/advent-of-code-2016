package day2b;

public class Location {
	
	private int x;
	private int y;
	
	private char[][] keypad;
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
		
		keypad = new char[][] {
			{'0','0','1','0','0'},
			{'0','2','3','4','0'},
			{'5','6','7','8','9'},
			{'0','A','B','C','0'},
			{'0','0','D','0','0'}
		};
	}
	
	public Location move(Direction direction) {
		switch (direction) {
			case U: return new Location(x, y - 1);
			case D: return new Location(x, y + 1);
			case L: return new Location(x - 1, y);
			case R: return new Location(x + 1, y);
		}
		return this;
	}
	
	public boolean isValid() {
		return x >= 0 && x < 5 &&
			y >= 0 && y < 5 &&
			getNumber() != '0';
	}
	
	public char getNumber() {
		return keypad[y][x];
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

}
