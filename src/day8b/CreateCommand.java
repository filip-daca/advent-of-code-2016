package day8b;

public class CreateCommand implements Command {

	private int x, y;
	
	public CreateCommand(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void execute(boolean[][] net) {
		for (int i = 0; i < y ; i++) {
			for (int j = 0; j < x; j++) {
				net[i][j] = true;
			}
		}
	}

}
