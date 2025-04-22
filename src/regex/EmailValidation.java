package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
		String regex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
//		String email="samriddhidubey798@gmail.com";
		String email="rohit.jay+@gmail-.com123";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(email);
		
		if(matcher.find()) {
			System.out.println(matcher.group()+"  "+matcher.start());
		}else {
			System.out.println("Match not found");
		}
	}

}
