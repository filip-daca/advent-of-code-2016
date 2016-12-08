package day7b;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TextUtils {
	
	public static boolean isMixedPalindrome(String s) {
		Set<Character> chars = new HashSet<>();
		
		for (int i = 0; i < s.length() / 2 + 1; i++) {
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

	public static String flip(String p) {
		char[] chars = new char[p.length()];
		for (int i = 0; i < p.length() / 2 + 1; i++) {
			chars[i] = p.charAt(p.length() / 2 - i);
			chars[p.length() - 1 - i] = chars[i];
		}
		return new String(chars);
	}

	public static List<String> getPalindromes(int len, String s) {
		List<String> palindromes = new LinkedList<>();
		
		for (int i = 0; i < s.length() - len + 1; i++) {
			String candidate = s.substring(i, i + len);
			if (isMixedPalindrome(candidate)) {
				palindromes.add(candidate);
			}
		}
		
		return palindromes;
	}
}
