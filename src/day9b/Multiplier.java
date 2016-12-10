package day9b;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Multiplier {

	int len;
	int count;
	
	public Multiplier(int len, int count) {
		this.len = len;
		this.count = count;
	}
	
	public void setLen(int len) {
		this.len = len;
	}
	
	public int getLen() {
		return len;
	}
	
	public int getCount() {
		return count;
	}

	public void multiply(Stack<Token> tokens) {
		List<Token> newTokens = new ArrayList<>();
		
		while (len > 0) {
			Token t = tokens.pop();
			Token tokenPart = t.getPart(len);
			newTokens.add(tokenPart);
			if (len < t.getTokenLength()) {
				tokens.push(t.getRemains(len));
			}
			len -= t.getTokenLength();
		}
		
		while (count > 0) {
			for (int i = newTokens.size() - 1; i >= 0; i--) {
				tokens.push(newTokens.get(i));
			}
			count--;
		}
	}
	
}
