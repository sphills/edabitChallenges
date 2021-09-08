package arrayMinMaxDifference;

public class ArrayMinMaxCalculator {

	public int differenceMaxMin(int[] inputArray) {
		int[] sortedArray = inputArray; // A local int[] instance because I'm not sure if sorting on the inputArray will work the way I want.
		return (sortedArray[sortedArray.length-1] - sortedArray[0]);
	}
}
