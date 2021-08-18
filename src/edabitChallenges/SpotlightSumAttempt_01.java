package edabitChallenges;

public class SpotlightSumAttempt_01 {

	int numberGrid[][] = new int[10][10];
			
	public int spotlightSum(int spotlightNumberCenter){
		int targetValueRow = 0;
		int targetValueElement = 0;
		int spotlightSumValue = 0;
		
		for (int i = 0; i < (numberGrid.length); i++) {
			for (int j = 0; j < (numberGrid[i].length); j++) {
				if (numberGrid[i][j] == spotlightNumberCenter) {
				 	targetValueRow = i;
				 	targetValueElement = j;
				 }
			}
		}
		
		if (checkValid(targetValueRow, targetValueElement)) {
			System.out.println("Target row is: " + targetValueRow + ", and target element is: " + targetValueElement);
	
			for (int i = -1; i < 2; i++) {
				for (int j = -1; j < 2; j++){
					spotlightSumValue += numberGrid[targetValueRow + i][targetValueElement + j];
				}
			}
		} else {
			System.out.println("That number was out of bounds.");
		}
		
		return spotlightSumValue;
	}

	// This constructor fills the numberGrid with 1 - 100 so that spotlightSum() can run
	public SpotlightSumAttempt_01() {
		
		for (int i = 0; i < numberGrid.length; i++) {
			for (int j = 0; j < numberGrid[i].length; j++) {
				numberGrid[i][j] = ((j) + ((i * 10) + 1));
			}
		}
	}
	
	/* This method validates the given inputs and returns a boolean that spotlightSum() uses to determine
	 * whether or not to use the targetRowValue or targetRowElement values.
	 */
	private boolean checkValid(int inputValueRow, int inputValueElement) {
		boolean isValueInput = true;
		
		if (inputValueRow == 0 || inputValueRow == 9) {
			System.out.println("Sorry, that number doesn't have 8 surrounding numbers.");
			isValueInput = false;
		} else {
			if (inputValueElement == 0 || inputValueElement == 9) {
				System.out.println("Sorry, that number doesn't have 8 surrounding numbers.");
				isValueInput = false;
			}
		}
		
		return isValueInput;
	}
}
