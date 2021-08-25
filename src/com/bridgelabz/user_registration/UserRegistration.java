package com.bridgelabz.user_registration;

import java.util.regex.Pattern;

public class UserRegistration {
	public static boolean IsValidPattern(String input, String regex) {
		return Pattern.compile(regex).matcher(input).matches();
	}

	public boolean userEmailID(String userEmail) {
		return IsValidPattern(userEmail, Constants.EMAIL_ID_REGEX);
	}

}
