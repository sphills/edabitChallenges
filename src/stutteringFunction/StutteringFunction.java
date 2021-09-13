package stutteringFunction;

public class StutteringFunction {

	public String stutter(String inputString) {

		String returnString = "";
		if (inputString.length() >= 2) {
			for (int i = 0; i < 2; i++) {
				returnString += (inputString.substring(0, 2) + "... ");
			}
			
			returnString += (inputString + "?");
		} else {
			returnString = (inputString + "?");
		}
		
		return returnString.toLowerCase();
	}
}
