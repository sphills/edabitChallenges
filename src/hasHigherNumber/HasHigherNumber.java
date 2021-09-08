package hasHigherNumber;

public class HasHigherNumber {

	public boolean existsHigher(int[] inputArray, int targetNumber) {

		if (inputArray.length > 0) {
			//Eclipse was giving me a hard time, so this boolean is here to silence the warnings
			boolean result = false;
			
			for (int i = 0; i < inputArray.length; i++) {
				if (inputArray[i] >= targetNumber) {
					result = true;
					//We don't care if there are any other indices that could return true; we're just happy there's one of greater or equal value, so we'll break the loop
					break;
				} else {
					result = false;
				}
			}

			return result;
		} else {
			return false;
		}
	}
}
