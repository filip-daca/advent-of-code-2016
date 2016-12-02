package day2a;

public class Location {
	
	private int x;
	private int y;
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move(Direction direction) {
		switch (direction) {
			case U: y -= y > 0 ? 1 : 0; break;
			case D: y += y < 2 ? 1 : 0; break;
			case L: x -= x > 0 ? 1 : 0; break;
			case R: x += x < 2 ? 1 : 0; break;
		}
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

}
