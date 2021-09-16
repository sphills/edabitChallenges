package consecutiveNumbers;

import java.util.Arrays;

public class ConsecutiveNumbers {

	public static boolean cons(int[] inputArray) {

		boolean isValid = false;
		
		Arrays.sort(inputArray);
		
		for (int i = 0; i < (inputArray.length - 1); i++) {
			if ((inputArray[i] == inputArray[(i + 1)]) || ((Math.abs(inputArray[i + 1]) - Math.abs(inputArray[i])) > 1)) {
				isValid = false;
				break; // Since isValid is false by default, the loop will return false if either condition is true 
			} else {
				isValid = true;
			}
		}
		
		return isValid;
	}
}
