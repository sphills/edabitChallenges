package phoneNumberDecoder;

public class PhoneNumberDecoder {

	public static String textToNum(String inputPhoneNumber) {

		// This String will be the String we return once we've finished reviewing the inputPhoneNumber
		String integerPhoneNumber = "";
		
		// This String is used by the for loop/switch as the intermediary for the decoded/translated value to be added to integerPhoneNumber. I know I could just copy/paste line 56 into every switch case's line, but I didn't want to take that approach. 
		String decodedString = "";
		
		// For every element within String inputPhoneNumber...
		for (int i = 0; i < inputPhoneNumber.length(); i++) {
			
			// Convert the substring at i, i + 1 to lower case and switch based on its value 
			switch (inputPhoneNumber.substring(i, i + 1).toLowerCase()) {
			
				// If the substring at i, i + 1 is "a", "b", or "c", set decodedString to "2"
				case "a": case "b": case "c":
					decodedString = "2";
					break;
				
				// If the substring at i, i + 1 is "d", "e", or "f", set decodedString to "3"
				case "d": case "e": case "f":
					decodedString = "3";
					break;
					
				// etc for the rest of the test cases (except default)
				case "g": case "h": case "i":
					decodedString = "4";
					break;
				case "j": case "k": case "l":
					decodedString = "5";
					break;
				case "m": case "n": case "o":
					decodedString = "6";
					break;
				case "p": case "q": case "r": case "s":
					decodedString = "7";
					break;
				case "t": case "u": case "v":
					decodedString = "8";
					break;
				case "w": case "x": case "y": case "z":
					decodedString = "9";
					break;
					
				// If the substring at i, i + 1 isn't caught by any of the above cases, it doesn't need to be translated and should be used as-is
				default:
					decodedString = inputPhoneNumber.substring(i, i + 1);
					break;
			}
			
			// Add decodedString to integerPhoneNumber and set integerPhoneNumber to the result
			integerPhoneNumber += decodedString;
		}
		
		// Now that we're through the loop, return the final String.
		return integerPhoneNumber;
	}
}
