
// ****************************************************************
//   LoveCsWithForDo.java
//
//   Use a for loop to print many messages declaring your
//   passion for java
//
//  When completed show do loop.
// ****************************************************************

// ****************************************************************
//   LoveCsWithForDoSolution.java
//Author: Dilshad Haleem
//   Use a for loop to print many messages declaring your
//   passion for java
//
//  Also use a do loop
// ****************************************************************
import java.util.Scanner;

public class LoveCsWithForDo
{
    public static void main(String[] args)
    {
		int limit;
		int sum;
		String evenOrOdd;
		String again;  //make it a string not a char. 
	
		Scanner scan = new Scanner (System.in);
		
		do {
				
				System.out.print("Enter the number of times message printed: ");
				limit = scan.nextInt();
				
				sum = 0;
					
				for (int count = 1; count <= limit; count++)
				{
			
					evenOrOdd = (count % 2 == 0)? "even": "odd";
				
					System.out.println(count + " I love Java!!"
					    			+ " This number is " + evenOrOdd + ".");
				
				     sum += count; //needs to come before incrementing count
					    
				}
			
			System.out.println("Message was printed " + limit + " times.");
			System.out.println("The sum of the numbers from 1 to " + limit + " is " + sum + ".");
			System.out.print("Do you want to do  it again y for Yes and" +
			" n for No: ");
			scan.nextLine(); // To eat up the enter key
			again = scan.nextLine();
		}while(again.equalsIgnoreCase("y"));
		
		System.out.println("\nGood bye! \n" );


    }
}
