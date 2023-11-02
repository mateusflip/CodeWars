package codewars.essentials.VowelCount;

public class Vowels {
	public static int getCount(String str) {
		int contador = 0;
		char[] chars = str.toCharArray();
		for (char letra : chars) {
			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			contador++;
		}
	  }
		return contador;
	}
}


