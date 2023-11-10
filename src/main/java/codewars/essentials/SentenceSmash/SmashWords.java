package codewars.essentials.SentenceSmash;

public class SmashWords {
	
	public static String smash(String... words) {
		if(words == null) return null;
		StringBuilder frase = new StringBuilder();
		for (String string : words) {
			frase.append(string);
			frase.append(" ");
		}
		return frase.toString().trim();
	  }

}
