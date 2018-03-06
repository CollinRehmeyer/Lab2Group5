package pkgCore;
import pkgEnum.*;
public class Card implements Comparable 
{
	private eRank eRank;
	private eSuit eSuit;

	
	public Card(eRank r, eSuit s)
	{
		eRank = r;
		eSuit = s;
	}
	
	
	public eRank geteRank()
	{
		return eRank;
	}
	
	public eSuit geteSuit()
	{
		return eSuit;
	}
	
	private void seteRank(eRank r)
	{
		eRank = r;
	}
	
	private void setSuit(eSuit s)
	{
		eSuit = s;
	}
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteRank().compareTo(this.geteRank());

}
	
}
