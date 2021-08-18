package edabitChallenges;

public class SpotlightSumAttempt_01 {

	int numberGrid[][] = new int[10][10];
			
	public int spotlightSum(int spotlightNumberCenter){
		int targetValueRow = 0;
		int targetValueElement = 0;
		int spotlightSumValue = 0;
		
		for (int i = 0; i < (numberGrid.length - 1); i++) {
			for (int j = 0; j < (numberGrid[i].length - 1); j++) {
				if (numberGrid[i][j] == spotlightNumberCenter) {
				 	targetValueRow = i;
				 	targetValueElement = j;
				 }
			}
		}
		
		System.out.println("Target row is: " + targetValueRow + ", and target element is: " + targetValueElement);

/*		for (int i = -1; i < 2; i++) {
			for (int j = -1; i < 2; j++){
				spotlightSumValue += numberGrid[i][j];
			}
		}
*/		
		return spotlightSumValue;
	}

	public SpotlightSumAttempt_01() {
		
		for (int i = 0; i < numberGrid.length; i++) {
			for (int j = 0; j < numberGrid[i].length; j++) {
				numberGrid[i][j] = ((j) + ((i * 10) + 1));
				System.out.println(numberGrid[i][j]);
			}
		}
	}
}
