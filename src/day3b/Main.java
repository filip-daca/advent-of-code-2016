package day3b;

import java.util.Scanner;

public class Main {

	private static final int COLUMNS = 3;

	private static boolean isValidTriangle(int a, int b, int c) {
		return a + b > c
			&& a + c > b
			&& b + c > a;
	}
	
	public static void main(String[] args) {
		int validTriangles = 0;
		
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int[] edges = new int[COLUMNS * 3];
			
			// Read one triangle from each column
			for (int i = 0; i < edges.length && scan.hasNext(); i++) {
				edges[i] = scan.nextInt();
			}
			
			// Count valid
			for (int i = 0; i < COLUMNS; i++) {
				if (isValidTriangle(edges[i], edges[i + COLUMNS], edges[i + COLUMNS * 2])) {
					validTriangles++;
				}
			}
		}
		scan.close();

		System.out.println("Valid triangles: " + validTriangles);
	}

	
}
