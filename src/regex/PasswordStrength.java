package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrength {
	public static boolean isValidPassword(String password) {
		String regex= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(password);
		return matcher.matches();
		
	}
	
	public static void main(String[]args) {
		
		String ps1="Strong@123";
		String ps2="weakpass";
		
		System.out.println("Password is valid? "+ isValidPassword(ps1));
		System.out.println("Password is valid? "+ isValidPassword(ps2));
		
		
	}

}

//positive lookahaed
