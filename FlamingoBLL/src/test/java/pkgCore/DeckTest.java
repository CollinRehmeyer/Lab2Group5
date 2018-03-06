package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void TestDeck() {
		
		
		Deck d1 = new Deck(1);
		
		assertEquals(d1.getCards().size(), 52);

		Deck d2 = new Deck(6);
		
		assertEquals(d2.getCards().size(), 312);
	}

}
