package array.model;

public class Bacon
{
//	Declaration Section
	private int strips;
	private Boolean taste;
	private int rating;
	
	public Bacon()
	{
		
	}
	
	public Bacon(int strips, boolean taste, int rating)
	{
		this.strips = strips;
		this.taste = taste;
		this.rating = rating;
	}

	public int getStrips()
	{
		return strips;
	}

	public Boolean getTaste()
	{
		return taste;
	}

	public int getRating()
	{
		return rating;
	}

	public void setStrips(int strips)
	{
		this.strips = strips;
	}

	public void setTaste(Boolean taste)
	{
		this.taste = taste;
	}

	public void setRating(int rating)
	{
		this.rating = rating;
	}
	
}
