package equalityOfValues;

public class EqualityOfValuesDriver {

	public static void main(String[] args) {
		EqualityOfValues testEqualityOfValues = new EqualityOfValues();
		
		System.out.println(testEqualityOfValues.equal(3, 4, 1));
		System.out.println(testEqualityOfValues.equal(3, 4, 3));
		System.out.println(testEqualityOfValues.equal(1, 1, 1));
	}
}
