

import java.util.Scanner;
//Javadoc comments 
/** Program Name :  Loops
 * @author Dilshad Haleem
*We will use this demo to look at 3 different looping constructs
	    while
	    do..while
	    for

[1] With each looping construct we will display 1 2 3 4 4

[2] Show how to add up numbers 1- 4 in loop

*/

public class LoopingDemo
{

public static void main (String[] args)
{
	/**
	 *  Demo  while loop.  It displays 1 -  4 */
      

	System.out.println("\n*****do..while loop******");
	
	int counter = 1; //Step 1
	Scanner scan = new Scanner(System.in);
	


	
	do
	{
		System.out.print(counter + "\t");
		counter++;
		
	} while (counter <= 4);
	
	System.out.print("Please enter a positive numeber: ");
	int number = scan.nextInt();
	
	while(number < 0)
	{
		System.out.print("Only positive numbers are allowed: ");	
		number = scan.nextInt();
	}
	/**
	 *  Look for the do while loop and for loops Demo later in 
	 *  the module. 
	 *  Demo do while loop.  It displays 1 -  4 */

	System.out.println();
	System.out.println("\n*****do..while loop******");

	

	
	
	/**
	 * Demo for loop. It displays numbers in reverse order 4 3 2 1 
	 */
	System.out.println();
	System.out.println("\n*****for loop******");
	for(int count = 1; count <= 4; count++)
	{
		System.out.print(count + "\t");
	}
	
	
	
}

}