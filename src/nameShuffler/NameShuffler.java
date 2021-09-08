package nameShuffler;

public class NameShuffler {

	public String nameShuffle(String fullName) {
		
		String firstName = "";
		String lastName = "";
		String[] splitFullName = fullName.split(" ");
		firstName = splitFullName[0];
		lastName = splitFullName[1];
		
		return lastName + " " + firstName;
	}
}
