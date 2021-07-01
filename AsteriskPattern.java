/*
 * Program Name: AsteriskPattern.java
 * Author: Mario Luja
 * Class: CSC110
 * Date: Mar 2, 2020
 * Brief Description: This program creates an asterisk pattern
 * with the help of nested for loops, do - while loops, and while
 * loops for input validation.
 * Input: int maxAsterisk, and String confirm.
 * Output: String literals.
 */
import java.util.Scanner;
public class AsteriskPattern {

	public static void main(String[] args) {

		int maxAsterisk;
		String confirm;
		Scanner scan = new Scanner(System.in);
		
		do
		{
			//Input
			System.out.println("Welcome to the Asterisk Pattern Program");
			System.out.print("Enter the max number of asterisks(1-10): ");
			maxAsterisk = scan.nextInt();
			
			while(maxAsterisk < 1 || maxAsterisk > 10)
			{
				System.out.print("The number of asterisks must be ");
				System.out.print("between 1 and 10(inclusive) : ");
				maxAsterisk = scan.nextInt();
			}
			
			//Processing
			//Create part of the pattern
			for(int row =1; row <= maxAsterisk; row++)
			{
				for(int col =1; col <= row; col++)
				{
					//Output
					System.out.print("*");
				}
				System.out.println();
			}
			
			//Create second part of pattern
			for(int row =1; row <= maxAsterisk-1; row++)
			{
				for(int col = row;col <= maxAsterisk-1; col++)
				{
					//Output
					System.out.print("*");
				}
				System.out.println();
			}
			
			//Output
			System.out.print("Do you want to do it again? Press Y/N: ");
			scan.nextLine();
			confirm = scan.nextLine();
			System.out.println();
		}while(confirm.equalsIgnoreCase("Y"));
		
		System.out.println("Goodbye!");
		
	}
}
/*Output

Welcome to the Asterisk Pattern Program
Enter the max number of asterisks(1-10): 4
*
**
***
****
***
**
*
Do you want to do it again? Press Y/N: y

Welcome to the Asterisk Pattern Program
Enter the max number of asterisks(1-10): 12
The number of asterisks must be between 1 and 10(inclusive) : 3
*
**
***
**
*
Do you want to do it again? Press Y/N: y

Welcome to the Asterisk Pattern Program
Enter the max number of asterisks(1-10): 0
The number of asterisks must be between 1 and 10(inclusive) : 4
*
**
***
****
***
**
*
Do you want to do it again? Press Y/N: n

Goodbye!
*/
