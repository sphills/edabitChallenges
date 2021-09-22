package positiveDominant;

import java.util.ArrayList;

public class PositiveDominant_ArrayList {

	public static boolean isPositiveDominant(int[] inputArray) {

		// This section is the inital commit that used ArrayList<Integer> to pass the JUnit test
		ArrayList<Integer> positiveList = new ArrayList<Integer>();
		ArrayList<Integer> negativeList = new ArrayList<Integer>();
		
		// For every element in int[] inputArray...
		for (int h = 0; h < inputArray.length; h++) {
			
			// Check if the element is both positive and not contained in positiveList
			if (inputArray[h] > 0 && !(positiveList.contains(inputArray[h]))) {
				
				// If true, add the value at index h of int[] inputArray to the ArrayList<Integer> positiveList
				positiveList.add(inputArray[h]);
				
			// If the element isn't positive but negative, and not contained in negativeList...
			} else if (inputArray[h] < 0 && !(negativeList.contains(inputArray[h]))) {
				
				// Add the value at index h of int[] inputArray to the ArrayList<Integer> negativeList
				negativeList.add(inputArray[h]);
			}
		}

		// Instantiate two integer variables and set them to the value of the size of the associated ArrayList<Integer>
		int sumUniquePositive = positiveList.size();
		int sumUniqueNegative = negativeList.size();
		
		// Return the result of the following boolean operation:
		return sumUniquePositive > sumUniqueNegative;
	}
}
