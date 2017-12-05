package day10b;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Bots bots = new Bots();
		
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			bots.addCommand(CommandParser.parse(scan.nextLine()));
		}
		scan.close();
	
		bots.run();
		
		System.out.println(bots.get(0).getOutput() * bots.get(1).getOutput() * bots.get(2).getOutput());
	}
}
