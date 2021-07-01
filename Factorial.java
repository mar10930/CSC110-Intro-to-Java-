/*
 * Program Name: Factorial.java
 * Author: Mario Luja
 * Class: CSC110
 * Date: Feb 27, 2020
 * Brief Description: The purpose of this program is to multiply the
 * value entered by the user by all of the values less than the input
 * value. We do this  by using many types of loops(for, while, do-while).
 * Input: int inputValue
 * Output: int answer, and string literals.
 */
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {

		//Variables and Objects declaration
		int inputValue;
		int answer = 0;
		Scanner scan = new Scanner(System.in);
		
		//Do while  loop
		do
		{
			//Input
			System.out.println("*******Factorial*******\n");
			System.out.print("Please enter a value between 1-10 " +
			"(0 to quit): ");
			inputValue = scan.nextInt();
			
			//Processing
			while(inputValue < 0 || inputValue > 10) // Validation
			{
				System.out.print("Value is out of range. Please ");
				System.out.print("Re-enter a value between 1-10: ");
				inputValue = scan.nextInt();
			}
			
			if(inputValue != 0)
			{
				answer = inputValue * (inputValue -1);
				for(int count = 1; count < inputValue -1 ; count++)
				{
					answer = answer * count;
				}
				//Output
				System.out.println(inputValue + "! = " + answer);
				System.out.println();
			}
			else
			{
				//Output
				System.out.println();
				System.out.println("Goodbye!!");
			}
		}while(inputValue != 0);
	}
}
/*Output
*******Factorial*******

Please enter a value between 1-10 (0 to quit): 4
4! = 24

*******Factorial*******

Please enter a value between 1-10 (0 to quit): -3
Value is out of range. Please Re-enter a value between 1-10: 5
5! = 120

*******Factorial*******

Please enter a value between 1-10 (0 to quit): 0

Goodbye!!

*/