/*
 * Program Name: Minutes.java
 * Author: Mario Luja
 * Class: CSC110
 * Date: Feb 4, 2020
 * Brief Description: This program asks for input on the amount of 
 * minutes worked and then the program calculates how many hours
 * and minutes make up the entered minutes.
 * Input: int minutes (minutes worked), enter the minutes worked.
 * Output: int minutes (minutes entered), int hours(hours worked), 
 * int calcMins (minutes worked)
 */
import java.util.Scanner;
public class Minutes {

	public static void main(String[] args) {

		int ans = 10;
		int x = 65;
		int y = 55;
		if (x >= y)
		{
		int ans = x + y;
		}
		System.out.println(ans);
	}
}
/* Output
Enter the number of minutes worked: 197
197 minutes becomes 3 hours and 17 minutes.
Goodbye!
*/