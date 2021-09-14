package likesVsDislikes;

public class LikesVsDislikes {

	public static String likeOrDislike(String[] inputCommands) {

		String lastButton = "";
		
		if ((inputCommands.length >= 1)) {
			for (int i = 0; i < inputCommands.length; i++) {
				lastButton = (inputCommands[i].equals(lastButton)) ? "Nothing": inputCommands[i];
			}
		} else {
			lastButton = "Nothing";
		}
		
		return lastButton;
	}
}
