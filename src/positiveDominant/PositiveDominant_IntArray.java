package positiveDominant;

public class PositiveDominant_IntArray {

	public static boolean isPositiveDominant(int[] inputArray) {
		
		// These arrays are for separating and storing ints for analysis 
		int[] positiveArray = new int[]{0};
		int[] positiveTestArray;
		int[] negativeArray = new int[] {0};
		int[] negativeTestArray;
		
		// 1) For each element in int[] inputArray...
		for (int h = 0; h < inputArray.length; h++) {
			
			// 1a) Check if the value of inputArray at integer index h is greater than 0. If it is, enter the following for loop.
			if (inputArray[h] > 0) {
				
				// Establish a for loop with integer g, and while it's less than the number of elements in int[] positiveArray, loop through them.
				for (int g = 0; g < positiveArray.length; g++) {
					
					// If the value of inputArray at integer index h equals the current index of positiveArray g, exit this loop immediately, as the value is already accounted for and thus no longer unique.
					if (inputArray[h] == positiveArray[g]) {
						break;
					}
					
					// If we're at the final element of int[] positiveArray, we've made it all the way through without detecting any duplicates. Execute the following code:
					if (g == positiveArray.length - 1) {
						
						// Instantiate positiveTestArray with a size one element larger than int[] positiveArray.
						positiveTestArray = new int[positiveArray.length + 1];

						// Then, copy all of positiveArray's values into positiveTestArray for safekeeping.
						for (int i = 0; i < positiveArray.length; i++) {
							positiveTestArray[i] = positiveArray[i];
						}
						
						// Next, insert the value of the element at inputArray[h] into the last position of positiveTestArray. 
						positiveTestArray[positiveTestArray.length - 1] = inputArray[h];
						
						// Now, resize positiveArray by using positiveTestArray's final size.
						positiveArray = new int[positiveTestArray.length];
						
						// Finally, copy all of the values in positiveTestArray into positiveArray.
						for (int j = 0; j < positiveTestArray.length; j++) {
							positiveArray[j] = positiveTestArray[j];
						}
					}
				}
			
			// 1b) If the value of inputArray[int h] is less than 0, enter this for loop. If neither (if the value of inputArray[h] is 0), disregard it.
			} else if (inputArray[h] < 0) {
				
				// Establish a for loop with integer g, and while it's less than the number of elements in int[] negativeArray, loop through them.
				for (int g = 0; g < negativeArray.length; g++) {
					
					// If the value of inputArray at integer index h equals the current index of positiveArray g, exit this loop immediately, as the value is already accounted for and thus no longer unique. 
					if (inputArray[h] == negativeArray[g]) {
						break;
					}
					
					// If we're at the final element of int[] negativeArray, we've made it all the way through without detecting any duplicates. Execute the following code:
					if (g == negativeArray.length - 1) {
						
						// Instantiate positiveTestArray with a size one element larger than int[] negativeArray.
						negativeTestArray = new int[negativeArray.length + 1];
						
						// Then, copy all of positiveArray's values into negativeTestArray for safekeeping.
						for (int i = 0; i < negativeArray.length; i++) {
							negativeTestArray[i] = negativeArray[i];
						}
						
						// Next, insert the value of the element at inputArray[h] into the last position of negativeTestArray.
						negativeTestArray[negativeTestArray.length - 1] = inputArray[h];
						
						// Now, resize negativeArray by using negativeTestArray's final size.
						negativeArray = new int[negativeTestArray.length];
						
						// Finally, copy all of the values in negativeTestArray into negativeArray.
						for (int j = 0; j < negativeTestArray.length; j++) {
							negativeArray[j] = negativeTestArray[j];
						}	
					}
				}
			}
		}
		
		// Return the result of the following boolean operation:
		return positiveArray.length > negativeArray.length;
	}
}
