package pkgCore;
import static org.junit.Assert.*;

import org.junit.Test;
public class getRemainingTest 
{
	
	
	@Test
	public void theTest()
	{
		Deck d1 = new Deck(1);
		
		Card aCard = d1.draw();
		
		Object e = aCard.geteRank();
		Object f = aCard.geteSuit();
		
		assertEquals(d1.getRemaining(e), 3);
		assertEquals(d1.getRemaining(f), 12);
		
	}
	
}
