/*
 * Program Name: StatsArray.java
 * Author: Mario Luja
 * Class: CSC110AB
 * Date: Apr 26, 2020
 * Brief Description: The purpose of this program is to 
 * analyze the data in an array(mean, minimum, maximum, etc)
 * in this case it is test scores, and we display the values
 * inside the array.
 */
import java.util.*;
public class StatsArray {

	public static void main(String[] args) {
		
		final int SIZE = 10;
		int[] stats = new int[SIZE];
		Scanner scan = new Scanner(System.in);
		String confirm = "";
		do
		{
			//Fill the array with values
			randomFill(stats);
			
			//Display the exam scores
			System.out.println("Exam Scores");
			System.out.println("-----------");
			displayData(stats);
			
			//Display minimum value
			System.out.println("The minimum value : " + 
			getSmallest(stats));
			
			//Display maximum value
			System.out.println("The maximum value : " +
			getLargest(stats));
			
			//Total of all scores
			System.out.println("The total is : " + 
			getTotal(stats));
			
			//Average of all scores
			System.out.println("The average is : " +
			getAvg(stats));
			
			//Number of letter grade #1 (A)
			System.out.println("Number of A's : " + 
			findLetterGrade(90,100,stats));
			
			//Number of letter grade #2 (B)
			System.out.println("Number of B's : " + 
			findLetterGrade(80,89,stats));
			
			//If there is a perfect score
			if(isNumberFound(100,stats))
			{
				System.out.println("You DO have perfect score(s)");
			}
			else
			{
				System.out.println("You DO NOT have perfect scores");
			}
			System.out.print("Please enter Y to continue or N to quit: ");
			confirm = scan.nextLine();
			System.out.println();
		}while(confirm.equalsIgnoreCase("Y"));
	}

	public static void randomFill(int[] data)
	{
		Random rand = new Random();
		for(int i = 0; i < data.length; i++)
		{
			data[i] = rand.nextInt(101);
		}
	}
	
	public static int getTotal(int[] data)
	{
		int sum;
		sum = 0;
		
		for(int i = 0; i < data.length; i++)
		{
			sum += data[i];
		}
		return sum;
	}
	
	public static double getAvg(int[] data)
	{
		int sum = 0;
		int arraySize = 0;
		double average = 0.0;
		sum = getTotal(data);
		arraySize = data.length;
		average = (double) sum / arraySize;
		return average;
	
	}
	
	public static int getLargest(int[] data)
	{
		int max = data[0];
		for(int i = 0; i < data.length; i++)
		{
			if(max < data[i])
			{
				max = data[i];
			}
		}
		return max;
	}
	
	public static int getSmallest(int[] data)
	{
		int min = data[0];
		for(int i = 0; i < data.length; i++)
		{
			if(min > data[i])
			{
				min = data[i];
			}
		}
		
		return min;
	}
	
	public static int findLetterGrade(int lowRange, int highRange, int[] data)
	{
		int counter = 0;
		for(int i = 0; i < data.length; i++)
		{
			if(data[i] >= lowRange && data[i] <= highRange)
			{
				counter++;
			}
		}
		return counter;
	}
	
	public static boolean isNumberFound(int someNumber, int[] data)
	{
		boolean found = false;
		for(int i = 0; i < data.length; i++)
		{
			if(someNumber == data[i])
			{
				found = true;
			}
		}
		
		return found;
	}
	
	public static void displayData(int[] data)
	{
		for(int i = 0; i < data.length; i++)
		{
			System.out.println("[" + i + "] " + data[i]);
		}
	}
	
	
	
}
/* Output

Exam Scores
-----------
[0] 6
[1] 15
[2] 89
[3] 58
[4] 50
[5] 6
[6] 38
[7] 46
[8] 2
[9] 100
The minimum value : 2
The maximum value : 100
The total is : 410
The average is : 41.0
Number of A's : 1
Number of B's : 1
You DO have perfect score(s)
Please enter Y to continue or N to quit: y

Exam Scores
-----------
[0] 9
[1] 73
[2] 58
[3] 14
[4] 25
[5] 86
[6] 81
[7] 60
[8] 54
[9] 50
The minimum value : 9
The maximum value : 86
The total is : 510
The average is : 51.0
Number of A's : 0
Number of B's : 2
You DO NOT have perfect scores
Please enter Y to continue or N to quit: n

*/