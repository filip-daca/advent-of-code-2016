package day9a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {
	
	private StringBuilder message = new StringBuilder();
	
	public void feed(String line) {
		Pattern p = Pattern.compile("\\((\\d+?)x(\\d+?)\\)(.*)");
		Matcher m = p.matcher(line);
		StringBuffer bufStr = new StringBuffer();
		
		int regionLen = line.length();
		if (m.find()) {
			int len = Integer.parseInt(m.group(1));
			int count = Integer.parseInt(m.group(2));
			String fragment = m.group(3).substring(0, len);
			
			StringBuilder sb = new StringBuilder();
			while (count > 0) {
				sb.append(fragment);
				count--;
			}
			
			m.appendReplacement(bufStr, sb.toString());
			
			regionLen = m.start() + (m.group(1).length() + m.group(2).length() + 3 + len);
		}
		m.appendTail(bufStr);

		String token = bufStr.toString();
		message.append(token);
		
		String remains = line.substring(regionLen);
		if (remains.length() > 0) {
			feed(remains);
		}
	}
	
	public StringBuilder getMessage() {
		return message;
	}
}
