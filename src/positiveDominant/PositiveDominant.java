package positiveDominant;

public class PositiveDominant {

	public static boolean isPositiveDominant(int[] inputArray) {

		int positiveArraySize = 0;
		int negativeArraySize = 0;
		
		for (int h = 0; h < inputArray.length; h++) {
			if (inputArray[h] > 0) {
				positiveArraySize++;
			} else if (inputArray[h] < 0) {
				negativeArraySize++;
			}
		}
		
		int[] positiveArray = new int[positiveArraySize];
		int[] negativeArray = new int[negativeArraySize];
		
		// First, we check to see how many positive or negative numbers there are so we can generate an int[] of appropriate size
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] > 0) {
				for (int j = 0; j < positiveArray.length; j++) {
					if (positiveArray[j] == 0) {
						positiveArray[j] = inputArray[i];
						break;
					}
				}
			} else if (inputArray[i] < 0) {
				for (int k = 0; k < negativeArray.length; k++) {
					if (negativeArray[k] == 0) {
						negativeArray[k] = inputArray[i];
						break;
					}
				}
			} // We don't want to do anything with 0, so there's no test case for it
		}
		
		// Then, we set up these variables for the boolean return...
		int sumUniquePositive = 0;
		int sumUniqueNegative = 0;
		
		// And this loop checks for the amount of unique positive integers...
		for (int l = 0; l < positiveArray.length; l++) {
			for (int m = 0; m < positiveArray.length; m++) {
				if (positiveArray[m] != positiveArray[l] || m == 0) {
					sumUniquePositive++;
				}
			}
		}
		
		// And this loop checks for the amount of unique negative integers...
		for (int n = 0; n < negativeArray.length; n++) {
			for (int p = 0; p < negativeArray.length; p++) {
				if (negativeArray[p] != negativeArray[n] || p == 0) {
					sumUniqueNegative++;
				}
			}
		}
		
		return sumUniquePositive > sumUniqueNegative;
	}
}
