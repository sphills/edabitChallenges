package perfectSquarePatch;

public class PerfectSquarePatch {

	int squarePatch[][];
	
	public int[][] squarePatch(int inputInteger) {
		squarePatch = new int[inputInteger][inputInteger];
				
		for (int i = 0; i < inputInteger; i++) {
			for (int j = 0; j < inputInteger; j++) {
				System.out.println(squarePatch[i][j] = inputInteger);
			}
		}
		
		return squarePatch;
	}
}
