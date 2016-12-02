package day1a;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private static void compute(List<Command> commands) {
		Agent agent = new Agent();
		for (Command command : commands) {
			agent.execute(command);
		}
		System.out.println(agent.getDistanceFromStart());
	};
	
	public static void main(String[] args) {
		List<Command> commands = new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			commands.add(new Command(scan.next()));
		}
		scan.close();
		
		compute(commands);
	}
}
