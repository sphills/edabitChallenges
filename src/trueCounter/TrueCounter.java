package trueCounter;

public class TrueCounter {

	public int countTrue(boolean[] inputArray) {
		int numberOfTrue = 0;
		
		if (inputArray.length != 0) {
			for (int i = 0; i < inputArray.length; i++) {
				if (inputArray[i]) {
					numberOfTrue++;
				}
			}
		}
		//System.out.println(numberOfTrue);
		return numberOfTrue;
	}
}
