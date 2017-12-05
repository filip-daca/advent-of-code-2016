package day10a;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Bots {
	
	private Map<Integer, Bot> bots;
	List<Command> commands;
	
	public Bots() {
		bots = new HashMap<>();
		commands = new LinkedList<>();
	}
	
	public void addCommand(Command c) {
		commands.add(c);
	}
	
	public Bot get(int id) {
		if (bots.get(id) == null) {
			bots.put(id, new Bot(id));
		}
		return bots.get(id);
	}

	public void run() {
		while (!commands.isEmpty()) {
			Command c = commands.remove(0);
			if (!c.execute(this)) {
				commands.add(c);
			}
		}
	}
}
