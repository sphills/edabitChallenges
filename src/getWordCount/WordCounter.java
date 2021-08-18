package getWordCount;

public class WordCounter {

	public int countWords(String inputSentence){

		String[] sentenceWords = inputSentence.split(" ");
		
		return sentenceWords.length;
	}
}
