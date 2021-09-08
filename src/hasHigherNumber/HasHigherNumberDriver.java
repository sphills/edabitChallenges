package hasHigherNumber;

public class HasHigherNumberDriver {

	public static void main(String[] args) {
		
		HasHigherNumber testHigherNumber = new HasHigherNumber();
		
		System.out.println(testHigherNumber.existsHigher(new int[] {5, 3, 15, 22, 4}, 10));
		System.out.println(testHigherNumber.existsHigher(new int[] {1, 2, 3, 4, 5}, 8));
		System.out.println(testHigherNumber.existsHigher(new int[] {4, 3, 3, 3, 2, 2, 2}, 4));
		System.out.println(testHigherNumber.existsHigher(new int[] {2, 2, 2, 2}, 5));
		System.out.println(testHigherNumber.existsHigher(new int[] {}, 0));
	}
}
