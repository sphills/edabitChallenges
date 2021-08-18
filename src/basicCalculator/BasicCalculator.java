package basicCalculator;

public class BasicCalculator {

	public int calculator(int firstInputInt, char operator, int secondInputInt) {
		int firstInt = firstInputInt;
		int secondInt = secondInputInt;
		int finalValue = 0;
		
		// I know I could change the case to be case 'operator':, but I wanted to practice stringifying chars
		String stringifiedOperator = Character.toString(operator);
		
		switch (stringifiedOperator) {
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
				if (secondInt == 0) {
					System.out.println("Undefined/Divide by 0 error");
				} else {
					finalValue = (firstInt/secondInt);
				}
				break;
			default:
				System.out.println("Looks like you provided an operator that's not one of the supported types: \'+\', \'-\', \'*\', or \'/\'");
				break;
		}
		
		return finalValue;
  }
}
