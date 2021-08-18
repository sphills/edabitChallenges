package edabitChallenges;

public class SpotlightSumAttempt_01 {

	int numberGrid[][] = new int[10][10];
	int targetValueRow = 0;
	int targetValueElement = 0;
	int spotlightSumValue;
	int rowValueMinimum;
	int rowValueMaximum;
	int elementValueMinimum;
	int elementValueMaximum;
	
	public int spotlightSum(int spotlightNumberCenter){

		spotlightSumValue = 0;
		rowValueMinimum = -1;
		rowValueMaximum = 1;
		elementValueMinimum = -1;
		elementValueMaximum = 1;
		
		for (int i = 0; i < (numberGrid.length); i++) {
			for (int j = 0; j < (numberGrid[i].length); j++) {
				if (numberGrid[i][j] == spotlightNumberCenter) {
				 	targetValueRow = i;
				 	targetValueElement = j;
				 }
			}
		}
		
		correctSearchArea(targetValueRow, targetValueElement);
		
		for (int i = rowValueMinimum; i < (rowValueMaximum + 1); i++) {
			for (int j = elementValueMinimum; j < (elementValueMaximum + 1); j++){
				spotlightSumValue += numberGrid[targetValueRow + i][targetValueElement + j];
			}
		}
		
		return spotlightSumValue;
	}

	/* This method no longer validates the given inputs but modifies the rowMin/Max or elementMin/Max so we can still calculate the 
	 * spotlight sum, even if the targeted number has less than 8 neighbors. If the input int isn't accounted for in the switch,
	 * the values are untouched.
	 */
	private void correctSearchArea(int inputValueRow, int inputValueElement) {
		modifyRowValue(inputValueRow);
		modifyElementValue(inputValueElement);
	}
	
	private void modifyRowValue(int inputValueRow) {
		switch (inputValueRow) {
		case 0:
			rowValueMinimum = 0;
			break;
		case 9:
			rowValueMaximum = 0; 
			break;
		}
	}
	
	private void modifyElementValue(int inputValueElement) {
		switch (inputValueElement) {
		case 0:
			elementValueMinimum = 0;
			break;
		case 9:
			elementValueMaximum = 0; 
			break;
		}
	}

	// This constructor fills the numberGrid with 1 - 100 so that spotlightSum() can run
	public SpotlightSumAttempt_01() {
		
		for (int i = 0; i < numberGrid.length; i++) {
			for (int j = 0; j < numberGrid[i].length; j++) {
				numberGrid[i][j] = ((j) + ((i * 10) + 1));
			}
		}
	}
}
