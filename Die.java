import java.util.Random;

public class Die {

	private int sides;
	private int face;
	Random rand = new Random();
	
	
	public Die()
	{
		sides = 6;
		
	}
	
	public int roll()
	{
		face = rand.nextInt(sides);
		return face;
	}
	
	public int getFace()
	{
		return face;
		
	}

	public String toString()
	{
		String display;
		display = "" + face;
		return display;
	}
	

}
