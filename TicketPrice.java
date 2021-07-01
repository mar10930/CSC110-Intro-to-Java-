/*
 * Program Name: TicketPrice.java
 * Author: Mario Luja
 * Class: CSC110
 * Date: Feb 20, 2020
 * Brief Description: This program asks for the age of the buyer
 * and using the age through conditional statements calculates the
 * ticket price.
 * Input: int age, double ticketPrice.
 * Output: double ticketPrice, and string literals.
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class TicketPrice {

	public static void main(String[] args) {

		//Variable and object declaration
		int age;
		double ticketPrice;
		Scanner scan = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("0.##");
		
		//Input
		
		System.out.print("You're age please: ");
		age = scan.nextInt();
		
		System.out.print("Enter ticket price: ");
		ticketPrice = scan.nextDouble();
		
		//Process
		
		if(age <= 5)
		{
			//Output
			ticketPrice *= 0;
			System.out.println("You pay nothing!");
			System.out.println("Price: " + ticketPrice);
			System.out.print("Your price (formatted) is $");
			System.out.println(dec.format(ticketPrice));
			System.out.println("Goodbye!");
			
		}
		
		else if(age >= 21)
		{
			//Output
			System.out.println("You pay full price!");
			System.out.println("Price: " + ticketPrice);
			System.out.print("Your price (formatted) is $");
			System.out.println(dec.format(ticketPrice));
			System.out.println("Goodbye!");
		}
		
		else
		{
			//Output
			ticketPrice *= (1.0/2.0);
			System.out.println("You pay half price");
			System.out.println("Price: " + ticketPrice);
			System.out.print("Your price (formatted) is $");
			System.out.println(dec.format(ticketPrice));
			System.out.println("Goodbye!");
		}
	}

}
/* Output

You're age please: 21
Enter ticket price: 21.32
You pay full price!
Price: 21.32
Your price (formatted) is $21.32
Goodbye!

You're age please: 16
Enter ticket price: 23.3
You pay half price
Price: 11.65
Your price (formatted) is $11.65
Goodbye!

*/
