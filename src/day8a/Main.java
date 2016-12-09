package day8a;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Screen screen = new Screen(50, 6);
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			screen.execute(CommandParser.parse(scan.nextLine()));
		}
		scan.close();
		System.out.print("Lit Pixels" + screen.countPixels());
	}

}
