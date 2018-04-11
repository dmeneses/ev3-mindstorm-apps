
public enum MorseCode {
	A('a', ".-"),
	S('s', "..."),
	O('o', "---");
	
	char letter;
	String morseCode;
	
	MorseCode(char letter, String morseCode) {
		this.letter = letter;
		this.morseCode = morseCode;
	}
	
	static MorseCode getMorseCodeFor(char letter) {
		MorseCode[] codes = MorseCode.values();
		for (MorseCode morseCode : codes) {
			if (morseCode.letter == letter)
                return morseCode;        
		}
		return null;
	}
}
