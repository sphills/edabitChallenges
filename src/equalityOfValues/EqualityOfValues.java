package equalityOfValues;

public class EqualityOfValues {

	public int equal(int a, int b, int c) {
		return ((a == b) ? ((b == c) ? 3: 2): ((b == c) ? 2: (a == c) ? 2: 0));
	}
}
