
public class MorseDrawer {

	Drawer drawer;
	
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

}
