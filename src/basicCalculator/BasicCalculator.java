package basicCalculator;

public class BasicCalculator {

	public int calculator(int firstInputInt, String operator, int secondInputInt) {
		int firstInt = firstInputInt;
		int secondInt = secondInputInt;
		int finalValue = 0;
		
		switch (operator) {
			case "+":
				finalValue = (firstInt + secondInt);
				break;
			case "-":
				finalValue = (firstInt - secondInt);
				break;
			case "*":
				finalValue = (firstInt * secondInt);
				break;
			case "/":
				if (firstInt/secondInt == 0) {
					System.out.println("Divide by 0 error");
				} else {
					finalValue = (firstInt/secondInt);
				}
		}
		
		return finalValue;
	}
}
