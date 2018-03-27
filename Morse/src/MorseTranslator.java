
public class MorseTranslator {

	public static String translate(String words) {
		char[] wordsCharacters = words.toCharArray();
		String translatedWords = "";
		for (char character : wordsCharacters) {
			translatedWords += translateChar(character);
		}
		return translatedWords;
	}

	private static String translateChar(char character) {
		switch(character) {
			case 's': return "...";
			case 'o': return "---";
			default: return "";
		}
	}

}
