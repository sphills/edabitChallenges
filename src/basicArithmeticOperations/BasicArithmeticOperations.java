package basicArithmeticOperations;

public class BasicArithmeticOperations {
	public static int operation(String firstInput, String secondInput, String operation) {
		int firstInt, secondInt, resultInt;
		firstInt = Integer.parseInt(firstInput);
		secondInt = Integer.parseInt(secondInput);
		resultInt = 0;
		
		switch (operation) {
			case "add":
				resultInt = firstInt + secondInt;
				break;
			case "subtract":
				resultInt = firstInt - secondInt;
				break;
			case "multiply":
				resultInt = firstInt * secondInt;
				break;
			case "divide":
				if (secondInt == 0) {
					resultInt = Integer.MIN_VALUE;
				} else {
					resultInt = firstInt / secondInt;
				}
				break;
		}
		
		return resultInt;
	}
}
