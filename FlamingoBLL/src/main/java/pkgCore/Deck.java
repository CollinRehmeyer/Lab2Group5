package pkgCore;
import java.util.ArrayList;
import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {


	private ArrayList<Card> cards = new ArrayList<Card>();

	public Deck(int n)
	{
		for(int i = 0; i < n; i++)
		{
			for(eSuit Suit : eSuit.values())
			{
				for(eRank Rank : eRank.values()) 
				{
					cards.add(new Card(Rank, Suit));
				}
			}
		}
	}
	
	public ArrayList<Card> getCards()
	{
		return cards;
	}
	
	
	public Card draw()
	{
		Card ret = cards.get(0);
		cards.remove(0);
		return ret;
	}
	
}
