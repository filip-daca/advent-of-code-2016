package day5b;

import java.util.Scanner;

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
	
	private static boolean isInteresting(String hash) {
		return hash.startsWith("00000");
	}
	
	private static boolean isValid(int position) {
		return position >= 0 && position < PASS_LEN;
	}
	
	public static void main(String[] args) {
		HashTool tool = new HashTool();
		String doorId = readInput();
		
		int i = 0, hashes = 0;
		char[] password = new char[8];
		
		while (hashes < PASS_LEN) {
			String hash = tool.getHash(doorId + i);
			if (isInteresting(hash)) {
				int position = tool.getPosition(hash);
				if (isValid(position) && password[position] == '\u0000') {
					password[position] = hash.charAt(6);
					System.out.println(i + " " + new String(password));
					hashes++;
				}
			}
			i++;
		}
	}

	
	
}
