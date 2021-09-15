package sevenBoom;

public class SevenBoom {

	public static String sevenBoom(int[] inputArray) {

		String searchResult = "There is no 7 in the array.";
		
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] < 10) {
				/* I know I could've used a logical operator like || to shorten this, but doing so made the } else { longer and more specific
				 * (more likely to throw a false positive) so I'm leaving this as-is.
				 */
				if (inputArray[i] == 7) {
					searchResult = "Boom!";
					break;
				}
			} else {
				String integerValue = String.valueOf(inputArray[i]);
				
				for (int j = 0; j < integerValue.length(); j++) {
					
					// Because substring(x, y) is inclusive, exclusive, line 21 only tests a single String value: j
					if (integerValue.substring(j, j + 1).equals("7")) {
						searchResult = "Boom!";
						break;
					}
				}
			}
		}
		
		return searchResult;
	}
}
