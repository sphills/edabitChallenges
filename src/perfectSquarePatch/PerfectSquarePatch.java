package perfectSquarePatch;

public class PerfectSquarePatch {

	int squarePatch[][];
	
	public int[][] squarePatch(int inputInteger) {
		squarePatch = new int[inputInteger][inputInteger];
				
		for (int i = 0; i < inputInteger; i++) {
			System.out.println();
			for (int j = 0; j < inputInteger; j++) {
				System.out.print((squarePatch[i][j] = inputInteger) + " ");
			}
		}
		
		return squarePatch;
	}
}
