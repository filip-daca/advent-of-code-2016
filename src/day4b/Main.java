package day4b;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			Room room = new Room(scan.nextLine());
			System.out.println(room);
		}
		scan.close();
	}
}
