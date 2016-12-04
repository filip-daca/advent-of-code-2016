package day4a;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Room {

	private static final int CHECKSUM_SIZE = 5;
	
	private int number;
	private String checksum;
	private Map<Character, Letter> letters;
	
	public Room(String label) {
		number = Integer.parseInt(label.substring(label.lastIndexOf('-') + 1, label.indexOf('[')));
		checksum = label.substring(label.indexOf('[') + 1, label.indexOf(']'));
		letters = new TreeMap<>();
		collectLetters(label.substring(0, label.lastIndexOf('-')));
	}
	
	private void collectLetters(String caption) {
		for (char character : caption.toCharArray()) {
			if (character == '-') {
				continue;
			}
			
			if (letters.containsKey(character)) {
				letters.get(character).increment();
			} else {
				letters.put(character, new Letter(character));
			}
		}
	}
	
	private String computeChecksum() {
		PriorityQueue<Letter> q = new PriorityQueue<>();
		q.addAll(letters.values());
		
		
		StringBuilder sb = new StringBuilder();
		while (sb.length() < CHECKSUM_SIZE && !q.isEmpty()) {
			sb.append(q.poll());
		}

		return sb.toString();
	}
	
	public boolean isValid() {
		return checksum.equals(computeChecksum());
	}
	
	public int getNumber() {
		return number;
	}
}
