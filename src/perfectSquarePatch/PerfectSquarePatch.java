package perfectSquarePatch;

public class PerfectSquarePatch {

	int squarePatch[][];
	
	public int[][] squarePatch(int inputInteger) {
		squarePatch = new int[inputInteger][inputInteger];
				
		for (int i = 0; i < inputInteger; i++) {
			for (int j = 0; j < inputInteger; j++) {
				if (j == (inputInteger - 1)) {
					System.out.println((squarePatch[i][j] = inputInteger));
				} else {
					System.out.print((squarePatch[i][j] = inputInteger) + " ");
				}
			}
		}
		
		return squarePatch;
	}
}
