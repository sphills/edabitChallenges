package rockPaperScissors;

public class RockPaperScissors {

	public static String rps(String player1, String player2) {
		int rockValue = 0;
		int paperValue = 0;
		int scissorsValue = 0;
		
		// This int will not be touched, as it's the "control value" for player2Value to be tested against
		int player1Value = 0;
		
		// This int will be changed to either 1 or -1, as long as !player1.equals(player2). This int shouldn't stay 0 if they're not the same
		int player2Value = 0;
		
		// The return value, which will be set by the following if {} else {} that follows
		String winResult = "";
		
		// String comparison of the input for Player 1 and the input for Player 2, e.g., "rock", "rock". Also, normalize them to lower case to avoid false negatives, such as "RoCk", "rOcK".
		if (player1.toLowerCase().equals(player2.toLowerCase())) {

			// Set the String value that will be returned to "TIE"
			winResult = "TIE";
		} else {
			
			// 1) Put the input for Player 1 to lower case, then...
			switch (player1.toLowerCase()) {
			
				/* 1a) If their input is "rock", manipulate paperValue and scissorsValue for use with the final if in this function.
				 * The player's chosen move is left untouched, as the other half of the current if statement accounts for equal values between 
				 * players, which don't need to be covered by the if statement at the end of this else.
				 */
				case "rock":
					paperValue = 1;
					scissorsValue = -1;
					break;
					
				// 1b) If their input is "paper", manipulate scissorsValue and rockValue for use with the final if in this function. 
				case "paper":
					scissorsValue = 1;
					rockValue = -1;
					break;

				// 1c) If their input is "scissors", manipulate rockValue and paperValue for use with the final if in this function.
				case "scissors":
					rockValue = 1;
					paperValue = -1;
					break;
				
				// 1d) Validation: if their input wasn't one of the accepted Strings, the winResult is set to log that the value wasn't accepted 
				default:
					winResult = "The value entered for Player 1 wasn't 'rock,' 'paper,' or 'scissors'. Please only enter 'rock,' 'paper,' or 'scissors'.";
					System.out.println(winResult);
			}
			
			// 2) Then, with the environment set up based on the first move recorded (player1), we assign int player2Value a value for use in the forthcoming if statement
			switch (player2.toLowerCase()) {
				case "rock":
					player2Value = rockValue;
					break;
				case "paper":
					player2Value = paperValue;
					break;
				case "scissors":
					player2Value = scissorsValue;
					break;
				default:
					winResult = "The value entered for Player 2 wasn't 'rock,' 'paper,' or 'scissors'. Please only enter 'rock,' 'paper,' or 'scissors'.";
					System.out.println(winResult);
				}
			
			/* Compare the value of each player's input against each other. Since the initial if will have caught equal inputs, we don't need to test it here.
			 * Also, player1Value is 0 by default and untouched by the first switch, so the way this if reads is:
			 * "if (0 > player2Value(which will be either 1 or -1)) { // code } else if (0 < player2Value(1 or -1) { //code } }
			 */
			if (player1Value > player2Value) {
				winResult = "Player 1 wins";
			} else if (player1Value < player2Value) {
				winResult = "Player 2 wins";
			}
		}
		
		return winResult;
	}
}
