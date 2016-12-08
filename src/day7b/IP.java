package day7b;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IP {
	
	private static final int SEQ_LEN = 3;
	
	private String[] outsideParts;
	private String[] bracketParts;
	
	public IP(String original) {
		this.outsideParts = original.split("\\[.*?\\]");
		this.bracketParts = new String[outsideParts.length - 1];
		
		Pattern pattern = Pattern.compile("\\[(.*?)\\]");
		Matcher matcher = pattern.matcher(original);
		int i = 0;
		while (matcher.find()) {	
		    bracketParts[i] = matcher.group(1);
		    i++;
		}
	}

	public boolean isValid() {
		List<String> sequences = new LinkedList<>();
		for (String part : bracketParts) {
			sequences.addAll(TextUtils.getPalindromes(SEQ_LEN, part));
		}
		
		for (String palindrome : sequences) {
			for (String candidate : outsideParts) {
				if (candidate.contains(TextUtils.flip(palindrome))) {
					return true;
				}
			}
		}

		return false;
	}
}
