import java.util.List;


public class MorseDrawer {

	Drawer drawer;
	
	public MorseDrawer() {
		drawer = new Drawer();
	}
	
	public void draw(String string) {
		String translatedMorse = MorseTranslator.translate(string);
		char[] morseCode = translatedMorse.toCharArray();
		for (char c : morseCode) {
			switch(c) {
				case '-': drawer.drawLine(); break;
				case '.': drawer.drawPoint(); break;
				case ' ': drawer.drawSpace(); break;
			}
		}
		
	}
	
	public void drawV2(String string) {
		List<MorseCode> morseCodes = MorseTranslator.translateV2(string);
		// TODO: FIND A WAY TO DRAW WITHOUT KNOWING IF IT'S ARE A LINE OR DOT.
	}

}
