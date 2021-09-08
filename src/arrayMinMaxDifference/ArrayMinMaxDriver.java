package arrayMinMaxDifference;

public class ArrayMinMaxDriver {

	public static void main(String[] args) {
		ArrayMinMaxCalculator testCalculator = new ArrayMinMaxCalculator();
		System.out.println(testCalculator.differenceMaxMin(new int[] {-1, 0, 1}));
		System.out.println(testCalculator.differenceMaxMin(new int[] {-10, 50, 137}));
	}
}
