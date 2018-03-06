package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		 
	}
	
	public int[] ScoreHand()
	{
		int [] iScore = new int[2];
		
		iScore[0] = 0;
		iScore[1] = 0;
		
		Collections.sort(cards);
		
		int ace = 0;
		for (Card c: cards)
		{
			if(c.geteRank() == eRank.ACE)
			{
				ace++;
				iScore[0] += 1;
				iScore[1] += 11;
			}
			else if(c.geteRank().getiRankNbr() >= eRank.JACK.getiRankNbr())
			{
				iScore[0] += 10;
				iScore[1] += 10;
			}
			else
			{
				iScore[0] += c.geteRank().getiRankNbr();
				iScore[1] += c.geteRank().getiRankNbr();
			}
		}
		
		while(iScore[1] > 21 && ace > 0)
		{
			iScore[1] -= 10;
			--ace;
		}
		
		return iScore;
	}
	
	public void Draw(Deck d)
	{
		cards.add(d.draw());
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}
