package hallMonitor;

public class HallMonitor {

	public boolean possiblePath(Object[] inputArray) {
		boolean isPathPossible = false;

		if (inputArray.length == 1) {
			isPathPossible = true;
		} else if (inputArray.length >= 2) {
			for (int i = 0; i < (inputArray.length - 1); i++) {
				if (inputArray[i] != "H" && inputArray[i + 1] != "H") {
					isPathPossible = false;
					break;
				} else {
					isPathPossible = true;
				}
			}
		}
	
		return isPathPossible;
	}
}
