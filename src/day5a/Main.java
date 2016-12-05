package day5a;

import java.util.Scanner;

import day5b.HashTool;

public class Main {
	
	private static final int PASS_LEN = 8;
	
	private static String readInput() {
		String input = "";
		Scanner scan = new Scanner(System.in);
		if (scan.hasNext()) {
			input = scan.nextLine();
		}
		scan.close();
		return input;
	}
	
	public static void main(String[] args) {
		HashTool tool = new HashTool();
		String doorId = readInput();
		
		int i = 0;
		StringBuilder sb = new StringBuilder();
		
		while (sb.length() < PASS_LEN) {
			String hash = tool.getHash(doorId + i);
			if (hash.startsWith("00000")) {
				sb.append(hash.charAt(5));
				System.out.println(sb);
			}
			i++;
		}
	}
	
}
