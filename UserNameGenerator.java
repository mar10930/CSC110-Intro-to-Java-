/*
 * Program Name: UserNameGenerator.java
 * Author: Mario Luja
 * Class: CSC110
 * Date: Feb 7, 2020
 * Brief Description: The purpose of this program is to create
 * a username by using the String methods in this case charATt,
 * and substring.We also use the random class to create a random
 * number between 10-99.
 * Input: String firstName, String lastName.
 * Output: char firstName1 (first character of the first name),
 * String lastSub(first 5 letters of the last name), int randomNum
 * (random number between 10-99), and string literals.
 */
import java.util.Scanner;
import java.util.Random;
public class UserNameGenerator {

	public static void main(String[] args) {

		//Variables and objects
		String firstName;
		String lastName;
		char firstName1;
		String lastSub;
		int randomNum;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		//Program intro
		System.out.println("******User Name Generator******");
		System.out.println();

		//Input
		System.out.print("Enter your first name: ");
		firstName = scan.nextLine();
		System.out.print("Enter your last name: ");
		lastName = scan.nextLine();
		
		//Processing 
		firstName1 = firstName.charAt(0);
		lastSub = lastName.substring(0,5);
		randomNum = rand.nextInt(89)+10;
		
		//Output
		System.out.print("Username generated: " + firstName1);
		System.out.println(lastSub + randomNum);
		System.out.println("Goodbye!");
			
	}

}
/*Output
******User Name Generator******
Enter your first name: Dennis
Enter your last name: Ritchie
Username generated: DRitch35
*/
