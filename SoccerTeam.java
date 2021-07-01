import java.util.Scanner;

public class SoccerTeam {
		
	/* Program Name : DataValidationDemo.cpp  Student Starting File
	Author: Mario Luja and Alan Perez
	Date: Feb 27, 2020
	Class : CSC110AB
	Brief Description:
	This program calculates the number of soccer teams a youth
	league may create from the number of available players.
	Input: int players, int teamSize
	Output: int teams, int leftOver, and string literals.
	*/
	

		//Input validation is done with while loops.
		//Players per team : 9 - 15
		//Players available : >1	

    public static void main(String[] args)
     {
		      final int MIN_PLAYERS = 9;  // Minimum players per team
		      final int MAX_PLAYERS = 15; // Maximum players per team
		      int players;                // Number of available players
		      int teamSize;               // Number of players per team
		      int teams;                  // Number of teams
		      int leftOver;               // Number of leftover players
		      String input;               // To hold the user input

          Scanner scan = new Scanner(System.in);
		// Get the number of players per team
		System.out.println( "How many players do you wish per team?");
		System.out.println( "(Enter a value in the range 9 - 15): ");
		 teamSize = scan.nextInt();
		
		// Below write code to validate the input using a while loop-
		//Note that a team can have players in the range of 9-15.
		//Therefore if user enters anything that is less than 9 OR 
		//greater than 15 then the loop repeats; prompting user to enter again
		//once teamPlayers is in the range loop terminates. 
		
		while(teamSize < 9 || teamSize > 15) 
		{
			System.out.print("Team size hould be 9 to 15 players: ");
			teamSize = scan.nextInt();
		}
		 
		
		// Get the number of players available
		System.out.println( "How many players are available? ");
		players = scan.nextInt();
		
		// Below write code to validate the input using a while loop
		//Note that number of players must be greater than 1
		
		while(players < 1)
		{
			System.out.print("Please enter a positive number: ");
			players = scan.nextInt();
		}
		
		// Calculate the number of teams.
		teams = players / teamSize;
		
		// Calculate the number of leftover players.
		leftOver = players % teamSize;
		
		// Display the results.
		System.out.println( "There will be "+ teams +  " teams with "+
		                   leftOver + " players left over.");
		}
		
    /*  Expected Output
		
		How many players do you wish per team?
		(Enter a value in the range 9 - 15): 18
		Team size should be 9 to 15 players.
		How many players do you wish per team? 10
		How many players are available? -5
		Please enter a positive number: 15
		
		There will be 1 teams with 5 players left over.

		
		*/
		
			
		}
