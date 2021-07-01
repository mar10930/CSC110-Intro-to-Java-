/*
 * Program Name: MathTutor.java
 * Author: Mario Luja
 * Class: CSC110
 * Date: Feb 20, 2020
 * Brief Description: This program asks the user an addition
 * problem (numbers between 10 and 49) to which the use must input
 * the answer. Using conditional statements the program decides
 * whether the user was right or wrong.
 * Input: int numInput
 * Output: int sum and string literals.
 */
import java.util.Scanner;
import java.util.Random;
public class MathTutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		int numInput;
		int sum;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		//Input
		
		num1 = rand.nextInt(39)+10;
		num2 = rand.nextInt(39)+10;
		sum = num1 + num2;
		System.out.println("Math Tutor");
		System.out.println("-----------");
		System.out.println();
		System.out.println("    " + num1);
		System.out.println("+   " + num2);
		System.out.println("   " + "-----");
		System.out.print("    ");
		numInput = scan.nextInt();
		
		//Processing
		
		if(numInput == sum)
		{
			//Output
			
			System.out.println("Congratulations! That's correct.");
			System.out.println("Goodbye!");
		}
		
		else
		{
			//Output
			
			System.out.println("Sorry, the correct answer is " + sum);
			System.out.println("Goodbye!");
		}
		
	}

}
/* Output

Math Tutor
-----------

    29
+   27
   -----
    56
Congratulations! That's correct.
Goodbye!

Math Tutor
-----------

    22
+   11
   -----
    32
Sorry, the correct answer is 33
Goodbye!
*/
