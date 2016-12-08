package day6a;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Locker locker = new Locker(8);
		
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			locker.feed(scan.nextLine());
		}
		scan.close();
		
		System.out.print(locker.getPassword());
	}

	
	
}
