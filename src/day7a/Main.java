package day7a;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		List<IP> ips = new LinkedList<>();
		
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			ips.add(new IP(scan.nextLine()));
		}
		scan.close();
		
		ips.removeIf(ip -> !ip.isValid());
		System.out.print("Valid ips: " + ips.size());
	}

}
