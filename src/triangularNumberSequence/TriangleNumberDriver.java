package triangularNumberSequence;

public class TriangleNumberDriver {

	public static void main(String[] args) {
		TriangleNumberSequencer testSequencer = new TriangleNumberSequencer();
		
		System.out.println(testSequencer.triangle(1));
		System.out.println(testSequencer.triangle(2));
		System.out.println(testSequencer.triangle(3));
		System.out.println(testSequencer.triangle(4));
		System.out.println(testSequencer.triangle(5));
		System.out.println(testSequencer.triangle(500));
	}
}
