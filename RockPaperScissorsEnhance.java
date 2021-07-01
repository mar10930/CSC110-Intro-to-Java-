/*
 * Program Name: RockPaperScissors.java
 * Author: Mario Luja
 * Class: CSC110AB
 * Date: Mar 20, 2020
 * Brief Description: The purpose of this program is to modify the
 * original RockPaperScissors program, by using the do while loop
 * to repeat the programs execution if requested by the user. We use
 * the increment operator to keep a score of wins, ties, and losses.
 * Input: String userChoice, String confirm.
 * Output: int scoreTie, int scoreWin, int scoreLoss, and 
 * String literals.
 */
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissorsEnhance
{

	public static void main(String [] args)
	{
		//Variable and object declaration
		int cpuNum;
		int scoreTie = 0;
		int scoreWin = 0;
		int scoreLoss = 0;
		String userChoice;
		String paper = "paper";
		String rock = "rock";
		String scissors = "scissors";
		String confirm;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
      
      //Do-while loop
		do{
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
	   					
	   					if(userChoice.equalsIgnoreCase(paper))
	   					{
	   						System.out.println("You picked paper");
	   						System.out.println("Computer picked rock");
	   						System.out.println("Winner: Player");
	   						System.out.println("Good Bye!");
	                     scoreWin++;
	   					}
	   					
	   					if(userChoice.equalsIgnoreCase(scissors))
	   					{
	   						System.out.println("You picked scissors");
	   						System.out.println("Computer picked rock");
	   						System.out.println("Winner: Computer");
	   						System.out.println("Good Bye!");
	                     scoreLoss++;
	   					}
	   					if(userChoice.equalsIgnoreCase(rock))
	   					{
	   						System.out.println("You picked rock");
	   						System.out.println("Computer picked rock");
	   						System.out.println("Winner: Tie");
	   						System.out.println("Good Bye!");
	                     scoreTie++;
	   					}
	   					break;
	   					
	   				//CPU = paper
	   				case 1:
	   
	   					if(userChoice.equalsIgnoreCase(paper))
	   					{
	   						System.out.println("You picked paper");
	   						System.out.println("Computer picked paper");
	   						System.out.println("Winner: Tie");
	   						System.out.println("Good Bye!");
	                     scoreTie++;
	   					}
	   					
	   					if(userChoice.equalsIgnoreCase(scissors))
	   					{
	   						System.out.println("You picked scissors");
	   						System.out.println("Computer picked paper");
	   						System.out.println("Winner: Player");
	   						System.out.println("Good Bye!");
	                     scoreWin++;
	   					}
	   					if(userChoice.equalsIgnoreCase(rock))
	   					{
	   						System.out.println("You picked rock");
	   						System.out.println("Computer picked paper");
	   						System.out.println("Winner: Computer");
	   						System.out.println("Good Bye!");
	                     scoreLoss++;
	   					}
	   					break;
	   				//CPU = scissors
	   				case 2:
	   
	   					if(userChoice.equalsIgnoreCase(paper))
	   					{
	   						System.out.println("You picked paper");
	   						System.out.println("Computer picked scissors");
	   						System.out.println("Winner: Computer");
	   						System.out.println("Good Bye!");
	                     scoreLoss++;
	   					}
	   					
	   					else if(userChoice.equalsIgnoreCase(scissors))
	   					{
	   						System.out.println("You picked scissors");
	   						System.out.println("Computer picked scissors");
	   						System.out.println("Winner: Tie");
	   						System.out.println("Good Bye!");
	                     scoreTie++;
	   					}
	   					else if(userChoice.equalsIgnoreCase(rock))
	   					{
	   						System.out.println("You picked rock");
	   						System.out.println("Computer picked scissors");
	   						System.out.println("Winner: Player");
	   						System.out.println("Good Bye!");
	                     scoreWin++;
	   					}
	   					break;
	   				default:
	   					break;
	   			}
	   		}
	   		
	   		else
	   		{
	   
	   			System.out.println("Invalid Choice!");
	   		}
	         
	         System.out.println("Do you want to play again: Y/N ?");
	         confirm = scan.nextLine();
         
		}while(confirm.equalsIgnoreCase("Y"));
      
      //Output
      System.out.println("You won " + scoreWin + " times.");
      System.out.println("You lost " + scoreLoss + " times.");
      System.out.println("We tied " + scoreTie + " times.");
      System.out.println("Goodbye !!");
	}   
}
/* Output

  ----jGRASP exec: java RockPaperScissorsEnhance
 ***** Rock Paper Scissors *****
 Enter one of the following:
 -- Rock
 -- Paper
 -- Scissors
 
 rock
 
 You picked rock
 Computer picked rock
 Winner: Tie
 Good Bye!
 Do you want to play again: Y/N ?
 y
 ***** Rock Paper Scissors *****
 Enter one of the following:
 -- Rock
 -- Paper
 -- Scissors
 
 paper
 
 You picked paper
 Computer picked paper
 Winner: Tie
 Good Bye!
 Do you want to play again: Y/N ?
 paper
 You won 0 times.
 You lost 0 times.
 We tied 2 times.
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java RockPaperScissorsEnhance
 ***** Rock Paper Scissors *****
 Enter one of the following:
 -- Rock
 -- Paper
 -- Scissors
 
 rock
 
 You picked rock
 Computer picked paper
 Winner: Computer
 Good Bye!
 Do you want to play again: Y/N ?
 y
 ***** Rock Paper Scissors *****
 Enter one of the following:
 -- Rock
 -- Paper
 -- Scissors
 
 Scissors
 
 You picked scissors
 Computer picked paper
 Winner: Player
 Good Bye!
 Do you want to play again: Y/N ?
 y
 ***** Rock Paper Scissors *****
 Enter one of the following:
 -- Rock
 -- Paper
 -- Scissors
 
 paper
 
 You picked paper
 Computer picked paper
 Winner: Tie
 Good Bye!
 Do you want to play again: Y/N ?
 N
 You won 1 times.
 You lost 1 times.
 We tied 1 times.
  Goodbye !!
  
    ***** Rock Paper Scissors *****
 Enter one of the following:
 -- Rock
 -- Paper
 -- Scissors
 
 Scissors
 
 You picked scissors
 Computer picked paper
 Winner: Player
 Good Bye!
 Do you want to play again: Y/N ?
 y
 ***** Rock Paper Scissors *****
 Enter one of the following:
 -- Rock
 -- Paper
 -- Scissors
 
 rack
 
 Invalid Choice!
 Do you want to play again: Y/N ?
 y
 ***** Rock Paper Scissors *****
 Enter one of the following:
 -- Rock
 -- Paper
 -- Scissors
 
 rock
 
 You picked rock
 Computer picked paper
 Winner: Computer
 Good Bye!
 Do you want to play again: Y/N ?
 n
 You won 1 times.
 You lost 1 times.
 We tied 0 times.
 Goodbye !!
  
*/
