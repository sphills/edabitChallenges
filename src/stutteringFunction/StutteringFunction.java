package stutteringFunction;

public class StutteringFunction {

	public String stutter(String inputString) {

		String returnString = "";
		
		for (int i = 0; i < 2; i++) {
			returnString += (inputString.substring(0, 1) + "... ");
		}
		
		returnString += (inputString + "\n");
		
		return returnString;
	}
}
