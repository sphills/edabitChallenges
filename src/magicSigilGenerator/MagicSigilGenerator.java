package magicSigilGenerator;

public class MagicSigilGenerator {

	public static String sigilize(String inputPhrase) {

		// This variable stores our String we'll return as the result
		String finalSigil = "";

		int lastIndex = 0;
		
		// For every letter in the inputPhrase
		for (int i = 0; i < inputPhrase.length(); i++) {
			
			// Do something different based on the current String element of inputPhrase
			switch (inputPhrase.substring(i, i + 1).toUpperCase()) {
			
				// If the current substring at i, i + 1 is "A", "E", "I", "O", "U", or " ", jump to the next iteration of the loop
				case "A": case "E": case "I": case "O": case "U": case " ":
					break;
					
				// 1a) If the current substring wasn't one of the ones we just checked for...
				default:
					
					// 1b) ...get the last index that the current substring shows up at...
					lastIndex = inputPhrase.lastIndexOf(inputPhrase.substring(i, i + 1));
					
					// 1c) ...and if this iteration of the loop is the same value as the last occurrence of the current substring...
					if (i == lastIndex) {
						
						// 1d) ...add the current substring to String finalSigil, as its uppercase version.
						finalSigil += inputPhrase.substring(i, i + 1).toUpperCase();
					} else {
						break;
					}
			}
		}

		// Finally, return finalSigil once inputPhrase has been completely checked.
		return finalSigil;
	}
}
