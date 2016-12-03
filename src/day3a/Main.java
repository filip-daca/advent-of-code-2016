package day3a;

import java.util.Scanner;

public class Main {
	
	private static boolean isValidTriangle(int a, int b, int c) {
		return a + b > c
			&& a + c > b
			&& b + c > a;
	}
	
	public static void main(String[] args) {
		int validTriangles = 0;
		
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			if (isValidTriangle(a, b, c)) {
				validTriangles++;
			}
		}
		scan.close();

		System.out.println("Valid triangles: " + validTriangles);
	}

	
}
