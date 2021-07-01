/*
 * Program Name: RockPaperScissors.java
 * Author: Mario Luja
 * Class: CSC110
 * Date: Feb 19, 2020
 * Brief Description: The purpose of this program is to use the decision
 * statements(if else and switch) in order to create a simple game 
 * of rock paper scissors.
 * Input: String userChoice.
 * Output: String literals.
 */
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String [] args)
	{
		//Variable and object declaration
		int cpuNum;
		String userChoice;
		String confirm;
		String paper = "paper";
		String rock = "rock";
		String scissors = "scissors";
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		do
		{
			//Input
			System.out.println("***** Rock Paper Scissors *****");
			
			System.out.println("Enter one of the following:");
			System.out.println("-- Rock");
			System.out.println("-- Paper");
			System.out.println("-- Scissors");
			System.out.println();
			userChoice = scan.nextLine();
			System.out.println();
			
			//Processing
			
			if(userChoice.equalsIgnoreCase(scissors)||
				userChoice.equalsIgnoreCase(rock)||
				userChoice.equalsIgnoreCase(paper))
			{
				cpuNum = rand.nextInt(3);
				
				switch(cpuNum)
				{
					// CPU = rock
					case 0:
						//Output
						
						if(userChoice.equalsIgnoreCase(paper))
						{
							System.out.println("You picked paper");
							System.out.println("Computer picked rock");
							System.out.println("Winner: Player");
							System.out.println("Good Bye!");
						}
						
						if(userChoice.equalsIgnoreCase(scissors))
						{
							System.out.println("You picked scissors");
							System.out.println("Computer picked rock");
							System.out.println("Winner: Computer");
							System.out.println("Good Bye!");
						}
						if(userChoice.equalsIgnoreCase(rock))
						{
							System.out.println("You picked rock");
							System.out.println("Computer picked rock");
							System.out.println("Winner: Tie");
							System.out.println("Good Bye!");
						}
						break;
						
					//CPU = paper
					case 1:
						//Output
	
						if(userChoice.equalsIgnoreCase(paper))
						{
							System.out.println("You picked paper");
							System.out.println("Computer picked paper");
							System.out.println("Winner: Tie");
							System.out.println("Good Bye!");
						}
						
						if(userChoice.equalsIgnoreCase(scissors))
						{
							System.out.println("You picked scissors");
							System.out.println("Computer picked paper");
							System.out.println("Winner: Player");
							System.out.println("Good Bye!");
						}
						if(userChoice.equalsIgnoreCase(rock))
						{
							System.out.println("You picked rock");
							System.out.println("Computer picked paper");
							System.out.println("Winner: Computer");
							System.out.println("Good Bye!");
						}
						break;
					//CPU = scissors
					case 2:
						//Output
	
						if(userChoice.equalsIgnoreCase(paper))
						{
							System.out.println("You picked paper");
							System.out.println("Computer picked scissors");
							System.out.println("Winner: Computer");
							System.out.println("Good Bye!");
						}
						
						else if(userChoice.equalsIgnoreCase(scissors))
						{
							System.out.println("You picked scissors");
							System.out.println("Computer picked scissors");
							System.out.println("Winner: Tie");
							System.out.println("Good Bye!");
						}
						else if(userChoice.equalsIgnoreCase(rock))
						{
							System.out.println("You picked rock");
							System.out.println("Computer picked scissors");
							System.out.println("Winner: Player");
							System.out.println("Good Bye!");
						}
						break;
					default:
						break;
				}
			}
			
			else
			{
				//Output
	
				System.out.println("Invalid Choice!");
			}
			System.out.print("Do you want to play again(y/n): ");
			confirm = scan.nextLine();
		}while(confirm.equalsIgnoreCase("Y"));
		System.out.println("Good bye!");	
	}
}
/* Output

***** Rock Paper Scissors *****
Enter one of the following:
-- Rock
-- Paper
-- Scissors

rock

You picked rock
Computer picked scissors
Winner: Player
Good Bye!

***** Rock Paper Scissors *****
Enter one of the following:
-- Rock
-- Paper
-- Scissors

pApeR

You picked paper
Computer picked paper
Winner: Tie
Good Bye!

***** Rock Paper Scissors *****
Enter one of the following:
-- Rock
-- Paper
-- Scissors

peaper

Invalid Choice!
Good bye!

*/
