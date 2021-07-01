import java.util.Scanner;
/*Program Name: Salary.java
Author:         
Class:          CSC 110
Date Written:   Today's Date
   
   Description:
		Demonstrates : Using if..else. Statements
		Demonstrates : Using switch statement.
		Demonstrates : boolean variable
		Review : generating random numbers

   Computes the raise and new salary for an employee.

     The input to the program includes the current annual salary
     for the employee and a number indicating the performance
     rating (1=excellent, 2=good, and 3=poor). An employee with a
     rating of 1 will receive a 6% raise, an employee with a rating
     of 2 will receive a 4% raise, and one with a rating of 3 will
     receive a 1.5% raise.  All other ratings are invalid and
	 the raise will be set to 0 and a message displayed.

  ***************************************************************/
public class Salary {

	public static void main(String[] args) {
		
		double currentSalary =0; // current annual salary
		int rating=0; // performance rating
		double raise=0; // dollar amount of the raise
		Scanner scan = new Scanner(System.in);
		// Get the current salary and performance rating
		System.out.print ("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		System.out.print ("Enter the performance rating: ");
		rating = scan.nextInt();
		
		// Compute the raise -- Use if ... else ... below
		
		switch(rating)
		{
			case 1:
				raise = currentSalary *= .06;
				break;
			case 2:
				raise = currentSalary *= .04;
				break;
			case 3:
				raise = currentSalary *= .015;
				break;
			default: 
				raise = currentSalary *= 0;
				System.out.println("Invalid rating: no raise calculated.");
		}
		
		// Print the results
		System.out.println ("Amount of your raise: $" + raise);
		System.out.println ("Your new salary: $" + (currentSalary + raise));
		
		//Computer the raise again using switch statement using the same variables
		
		if(rating == 1)
		{
			raise = currentSalary *= .06;
		}
		
		else if(rating == 2)
		{
			raise = currentSalary *= .04;
		}
		
		else if(rating == 3)
		{
			raise = currentSalary *= .015;
		}
		
		else
		{
			raise = currentSalary *= 0;
			System.out.println("Invalid rating: no raise calculated.");	
		}
		
		
		// Print the results
		System.out.println ("Amount of your raise: $" + raise);
		System.out.println ("Your new salary: $" + (currentSalary + raise));
		System.out.println("Both output are the same! Good Bye" );
		
	}

}
