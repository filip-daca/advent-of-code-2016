package day8b;

public class Screen {

	private int xSize, ySize;
	private boolean[][] net;
	
	public Screen(int x, int y) {
		this.xSize = x;
		this.ySize = y;
		this.net = new boolean[y][x];
	}
	
	public void execute(Command c) {
		c.execute(net);
	}
	
	public void show() {
		for (int y = 0; y < ySize; y++) {
			for (int x = 0; x < xSize; x++) {
				System.out.print(net[y][x] ? '#' : '.');
			}
			System.out.print("\n");
		}
	}

	public int countPixels() {
		int pixels = 0;
		for (int y = 0; y < ySize; y++) {
			for (int x = 0; x < xSize; x++) {
				if (net[y][x]) {
					pixels++;
				}
			}
		}
		return pixels;
	}
}
