package day7a;

import java.util.HashSet;
import java.util.Set;

public class TextUtils {

	public static boolean containsMixedPalindrome(int len, String s) {
		for (int i = 0; i < s.length() - len + 1; i++) {
			if (isMixedPalindrome(s.substring(i, i + len))) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isMixedPalindrome(String s) {
		Set<Character> chars = new HashSet<>();
		
		for (int i = 0; i < s.length() / 2; i++) {
			// different chars
			if (chars.contains(s.charAt(i))) {
				return false;
			} else {
				chars.add(s.charAt(i));
			}
				
			// palindrome
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
