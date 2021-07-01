
public class ArrayTesting {

	public static void main(String[] args)
	{
		int[] testScores = {78, 90, 34, 57, 95, 87};
		findMin(testScores);
		
	}
	
	public static int findMin(int [] testScores)
	{
		int min = 0;
		for(int i = 0; i < testScores.length; i++)
		{
			if(testScores[i] < testScores[i++])
			{
				min = testScores[i];
			}
		}
		return min;
	}
	
}
