package day8b;

public class RotateRowCommand implements Command {

	private int y, count;
	
	public RotateRowCommand(int y, int count) {
		this.y = y;
		this.count = count;
	}

	@Override
	public void execute(boolean[][] net) {
		boolean[] temp = new boolean[net[y].length];
		for (int i = 0; i < net[y].length; i++) {
			temp[i] = net[y][i];
		}
		
		for (int i = 0; i < net[y].length; i++) {
			net[y][(i + count) % net[y].length] = temp[i];
		}
	}
	
}
