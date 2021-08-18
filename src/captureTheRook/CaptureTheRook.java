package captureTheRook;

public class CaptureTheRook {

	public boolean canCapture(String[] rooks) {
		String firstString = "";
		int firstInt = 0;
		
		String secondString = "";
		int secondInt = 0;
		
		for (int i = 0; i < rooks.length; i++) {
			switch (i) {
				case 0:
					firstString = Character.toString(rooks[i].charAt(0));
					firstInt = Character.getNumericValue(rooks[i].charAt(1));
					break;
				case 1:
					secondString = Character.toString(rooks[i].charAt(0));
					secondInt = Character.getNumericValue(rooks[i].charAt(1));
					break;
			}
		
		}
		
		if (firstString.equals(secondString) || firstInt == secondInt) {
			return true;
		} else {
			return false;
		}
	}
}
