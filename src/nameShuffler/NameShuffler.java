package nameShuffler;

public class NameShuffler {

	public String nameShuffle(String fullName) {
		
		String[] splitFullName = fullName.split(" ");
		
		return splitFullName[1] + " " + splitFullName[0];
	}
}
