package almostPalindrome;

public class AlmostPalindrome {
	public static boolean almostPalindrome(String inputString) {
		int numLettersToChange = 0;
		
		// This loop works by calculating the middle of inputString, looping through and comparing the front half's letters to their rear counterparts.
		for (int i = 0; i < (Math.round((double) inputString.length()/2)); i++) {
			if (!(inputString.substring(i, i + 1).equals(inputString.substring(inputString.length() - (i + 1), inputString.length() - i)))) {
				numLettersToChange++;
				if (numLettersToChange > 1) {
					break;
				}
			}
		}
		
		return (numLettersToChange == 1);
	}
}
