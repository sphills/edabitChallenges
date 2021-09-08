package arrayMinMaxDifference;

import java.util.Arrays;

public class ArrayMinMaxCalculator {

	public int differenceMaxMin(int[] inputArray) {
		Arrays.sort(inputArray);
		System.out.print("The difference between the largest and smallest value in this array is: " + (inputArray[inputArray.length - 1] - inputArray[0]) + "\n");
		return (inputArray[inputArray.length - 1] - inputArray[0]);
	}
	
	public int sortAndDifferenceMaxMin(int[] inputArray) {
		int sortHolder = 0;
		
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i+1; j < inputArray.length; j++) {
				if (inputArray[i] > inputArray[j]) {
					sortHolder = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = sortHolder;
				}
			}
			
			System.out.println(inputArray[i]);
		}
		
		System.out.print("The difference between the largest and smallest value in this array is: " + (inputArray[inputArray.length - 1] - inputArray[0]) + "\n");
		
		return (inputArray[inputArray.length - 1] - inputArray[0]);
	}
}
