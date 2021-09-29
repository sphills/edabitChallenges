package regExValidator;

import java.util.regex.Pattern;

public class RegExValidator {

	public static boolean validate(String inputStringPIN) {
		
		// This checks if inputStringPIN contains exactly 4 or exactly 6 digits from 0-9, and returns true accordingly.
		// For questions, please view the official Java documentation here: https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
		if (Pattern.matches("\\d{4}", inputStringPIN) || Pattern.matches("\\d{6}", inputStringPIN)) {
			return true;
		} else {
			return false;
		}
	}

	// This solution works just the same as the above lines, but is quite code-golf-y for me 
//	public static boolean validate(String inputStringPIN) {
//		return (Pattern.matches("\\d{4}", inputStringPIN) || Pattern.matches("\\d{6}", inputStringPIN));
//	}
}
