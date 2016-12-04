package day4a;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int sumOfIds = 0;
		
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			Room room = new Room(scan.nextLine());
			if (room.isValid()) {
				sumOfIds += room.getNumber();
			}
		}
		scan.close();
		
		System.out.println("Sum of IDS: " + sumOfIds);
	}

	
}
