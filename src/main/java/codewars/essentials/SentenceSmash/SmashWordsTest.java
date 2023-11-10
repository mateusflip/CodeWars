package codewars.essentials.SentenceSmash;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SmashWordsTest {
	@Test
	public void validateNull() {
		assertEquals(null, SmashWords.smash(null));
	}
	
	@Test
	public void validate() {
		assertEquals("Bilal Djaghout", SmashWords.smash(new String[] { "Bilal", "Djaghout" }));
	}
	
	@Test
	public void validateEmpty() {
		assertEquals("", SmashWords.smash(new String[] {}));
	}

	
	@Test
	public void validateOneWord() {
		assertEquals("Bilal", SmashWords.smash(new String[] {"Bilal"}));
	}
	

}
