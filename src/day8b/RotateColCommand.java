package day8b;

public class RotateColCommand implements Command {

	private int count, x;
	
	public RotateColCommand(int x, int count) {
		this.count = count;
		this.x = x;
	}

	@Override
	public void execute(boolean[][] net) {
		boolean[] temp = new boolean[net.length];
		for (int i = 0; i < net.length; i++) {
			temp[i] = net[i][x];
		}
		
		for (int i = 0; i < net.length; i++) {
			net[(i + count) % net.length][x] = temp[i];
		}
	}
	
}
