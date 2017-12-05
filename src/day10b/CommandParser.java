package day10b;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandParser {

	public static Command parse(String s) {
		Pattern p = Pattern.compile("-?\\d+");
		Matcher m = p.matcher(s);
		
		if (s.contains("value")) {
			m.find();
			int value = Integer.parseInt(m.group());
			m.find();
			int botId = Integer.parseInt(m.group());
			
			return new InitBotCommand(value, botId);
		}
		
		if (s.contains("gives")) {
			m.find();
			int botId = Integer.parseInt(m.group());
			m.find();
			int lowValue = Integer.parseInt(m.group());
			m.find();
			int hiValue = Integer.parseInt(m.group());
			
			boolean lowOutput = s.contains("low to output");
			boolean hiOutput = s.contains("high to output");
			
			return new GiveCommand(botId, lowOutput, lowValue, hiOutput, hiValue);
		}
		
		return null;
	}

}
