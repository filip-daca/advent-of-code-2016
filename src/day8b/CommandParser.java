package day8b;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandParser {

	public static Command parse(String s) {
		
		if (s.contains("rect")) {
			Pattern p = Pattern.compile("-?\\d+");
			Matcher m = p.matcher(s);
			
			m.find();
			int x = Integer.parseInt(m.group());
			m.find();
			int y = Integer.parseInt(m.group());
			return new CreateCommand(x, y);
		}
		
		if (s.contains("row")) {
			Pattern p = Pattern.compile("-?\\d+");
			Matcher m = p.matcher(s);
			
			m.find();
			int y = Integer.parseInt(m.group());
			m.find();
			int count = Integer.parseInt(m.group());
			return new RotateRowCommand(y, count);
		}
		
		if (s.contains("col")) {
			Pattern p = Pattern.compile("-?\\d+");
			Matcher m = p.matcher(s);
			
			m.find();
			int x = Integer.parseInt(m.group());
			m.find();
			int count = Integer.parseInt(m.group());
			return new RotateColCommand(x, count);
		}
		
		return null;
	}

}
