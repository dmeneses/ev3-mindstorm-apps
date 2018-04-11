import java.util.ArrayList;
import java.util.List;


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
			case ' ': return " ";
			default: return "";
		}
	}

	public static List<MorseCode> translateV2(String words) {
		char[] wordsCharacters = words.toCharArray();
		List<MorseCode> codes = new ArrayList<MorseCode>();
		for (char character : wordsCharacters) {
			codes.add(MorseCode.getMorseCodeFor(character));
		}
		return codes;
		
	}

}
