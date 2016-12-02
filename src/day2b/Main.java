package day2b;

import java.util.Scanner;

public class Main {
	
	private static Direction[] parseDirections(String commands) {
		Direction[] directions = new Direction[commands.length()];
		for (int i = 0; i < commands.length(); i++) {
			directions[i] = Direction.valueOf(commands.substring(i, i + 1));
		}
		return directions;
	}
	
	public static void main(String[] args) {
		Finger finger = new Finger();
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			Direction[] directions = parseDirections(scan.nextLine());
			finger.execute(directions);
		}
		scan.close();
		System.out.println(finger.getCode());
	}
}
