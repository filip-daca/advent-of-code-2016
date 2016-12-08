package day7a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IP {
	
	private static final int SEQ_LEN = 4;
	
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
		for (String part : bracketParts) {
			if (TextUtils.containsMixedPalindrome(SEQ_LEN, part)) {
				return false;
			}
		}
		
		for (String part : outsideParts) {
			if (TextUtils.containsMixedPalindrome(SEQ_LEN, part)) {
				return true;
			}
		}
		return false;
	}
}
