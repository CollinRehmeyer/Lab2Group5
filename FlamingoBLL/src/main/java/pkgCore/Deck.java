package pkgCore;
import java.util.ArrayList;
import java.util.Collections;

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
		Collections.shuffle(cards);
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
	
	public int getRemaining(Object e)
	{
		int count = 0;
		for(int i = 0; i < cards.size(); i++)
		{
			if(cards.get(i).geteRank() == e || cards.get(i).geteSuit() == e)
				count++;
		}
		return count;
		
		
	}
	
}
