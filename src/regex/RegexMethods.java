package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMethods {
	public static void main(String[] args) {
		String s="Hello World!\nTodayb  isc 22 23";
		String regex="^23";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(s);
		
		while(matcher.find()) {
			System.out.print(matcher.group()); //retreives the data
		}
	}

}
