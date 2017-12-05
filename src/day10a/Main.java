package day10a;

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
	}
}
