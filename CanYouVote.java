
import java.util.Scanner;
/*Program Name: CanYouVoteSolution.java
Author:        Dilshad Haleem 
Class:         CSC 110
Date Written:  Today�s date
Brief Description: This program tells you whether you are eligible to vote or not
Description of inputs: Age
Description of outputs: A messages
*/
import java.util.Scanner;
public class CanYouVote {

	public static void main(String[] args) {
		
	//Define variables
		double age;
		String message;
		final double VOTING_AGE = 18;
		Scanner scan = new Scanner(System.in);
		
	//Input
	
	System.out.print("Please enter your age: ");
	age = scan.nextDouble();
		
	//Process - Check if age is greater than or equal to 18
		
	if(age < 18)
	{
		System.out.println("Sorry you cannot vote");
	}
	
	else
	{
		System.out.println("You can vote");
	}
		
	//Display output message
	
	
	
	
	//Say Goodbye
		System.out.println("Goodbye");
	
		
	}

}
