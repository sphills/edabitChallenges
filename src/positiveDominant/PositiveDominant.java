package positiveDominant;

import java.util.ArrayList;

public class PositiveDominant {

	public static boolean isPositiveDominant(int[] inputArray) {

		ArrayList<Integer> positiveList = new ArrayList<Integer>();
		ArrayList<Integer> negativeList = new ArrayList<Integer>();
		
		for (int h = 0; h < inputArray.length; h++) {
			if (inputArray[h] > 0 && !(positiveList.contains(inputArray[h]))) {
				positiveList.add(inputArray[h]);
			} else if (inputArray[h] < 0 && !(negativeList.contains(inputArray[h]))) {
				negativeList.add(inputArray[h]);
			}
		}

		int sumUniquePositive = positiveList.size();
		int sumUniqueNegative = negativeList.size();
		
		return sumUniquePositive > sumUniqueNegative;
	}
}
