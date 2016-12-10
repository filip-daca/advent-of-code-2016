package day9b;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {
	
	List<Token> tokens = new ArrayList<>();
	long length = 0;
	
	public void feed(String line) {
		Pattern p = Pattern.compile("(?:\\((\\d+?)x(\\d+?)\\))|([a-zA-Z]+)");
		Matcher m = p.matcher(line);
		
		while (m.find()) {
			if (m.group(3) != null) {
				tokens.add(new StringToken(m.group(3)));
			} else {
				tokens.add(new MultiplicationToken(Integer.parseInt(m.group(1)), Integer.parseInt(m.group(2))));
			}			
		}

	}
	
	private void print() {
		tokens.forEach(t -> System.out.print(t.toString()));
	}
	
	private void decompress() {
		Stack<Token> tokenStack = new Stack<>();
		tokens.forEach(t -> tokenStack.insertElementAt(t, 0));
		
		while (tokenStack.size() > 0) {
			Token t = tokenStack.pop();
			Multiplier m = t.getMultiplier();
			m.multiply(tokenStack);
			length += t.getCodeLength();
		}
	}
	
	public long getLength() {
		decompress();
		return length;
	}
}
