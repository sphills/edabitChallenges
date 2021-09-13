package equalityOfValues;

public class EqualityOfValues {

	public int equal(int a, int b, int c) {

		int returnInt = 0;

		if (a == b) {
			returnInt = (b == c) ? 3: 2;
			
		} else {
			returnInt = (b == c) ? 2: (a == c) ? 2: 0; 
		}
		
		return returnInt;
	}
}
