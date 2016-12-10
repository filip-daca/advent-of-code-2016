package day9a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Tokenizer tokenizer = new Tokenizer();
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			tokenizer.feed(scan.nextLine());
		}
		scan.close();
		
		System.out.println(tokenizer.getMessage().toString().trim().length());
	}
}
