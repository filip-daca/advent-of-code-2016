package day6b;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import day4a.Letter;

public class Locker {

	private int passwordLength;
	private Map<Character, Letter>[] maps;
	
	@SuppressWarnings("unchecked")
	public Locker(int passwordLength) {
		this.passwordLength = passwordLength;
		maps = new Map[passwordLength];
		for (int i = 0; i < passwordLength; i++) {
			maps[i] = new HashMap<>();
		}
	}

	public void feed(String line) {
		for (int i = 0; i < passwordLength; i++) {
			char character = line.charAt(i);
			if (maps[i].containsKey(character)) {
				maps[i].get(character).increment();
			} else {
				maps[i].put(character, new Letter(character));
			}
		}
	}
	
	public String getPassword() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < passwordLength; i++) {
			PriorityQueue<Letter> q = new PriorityQueue<>();
			q.addAll(maps[i].values());
			
			Letter lastLetter = q.peek();
			while (q.size() > 0) {
				lastLetter = q.poll();
			}
			
			sb.append(lastLetter);
		}
		return sb.toString();
	}
	
	
}
