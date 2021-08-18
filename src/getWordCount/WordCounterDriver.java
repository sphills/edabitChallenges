package getWordCount;

public class WordCounterDriver {

	public static void main(String[] args) {
		WordCounter testCounter = new WordCounter();
		System.out.println(testCounter.countWords("Where did you come from, where did you go, where did you come from Cotton-Eye Joe?"));
	}
}
