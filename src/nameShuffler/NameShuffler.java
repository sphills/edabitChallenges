package nameShuffler;

public class NameShuffler {

	public String nameShuffle(String fullName) {
		
		String[] splitFullName = fullName.split(" ");
		String firstName = splitFullName[0];
		String lastName = splitFullName[1];
		
		return lastName + " " + firstName;
	}
}
