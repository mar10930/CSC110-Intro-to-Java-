/*
 * Program Name: DistanceCalculation.java
 * Author: Mario Luja
 * Class: CSC110
 * Date: Feb 6, 2020
 * Brief Description: This program asks for two coordinates and
 * calculates the distance between them using square root and
 * exponents under the math class.
 * Input: int x1, int x2, int y1, int y2.
 * Output: double dist(distance), int x1, int x2, int y1, int y2,
 * and string literals.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Distance {

	public static void main(String[] args) {
		
		//Declare all variables and objects
		int x1;
		int y1;
		int x2;
		int y2;
		Scanner scan = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("0.###");
		
		//Input
		
		System.out.println("Enter the first coordinate values:");
		System.out.print("x1 = ");
		x1 = scan.nextInt();
		System.out.print("y1 = ");
		y1 = scan.nextInt();
		System.out.println("Enter the first coordinate values:");
		System.out.print("x2 = ");
		x2 = scan.nextInt();
		System.out.print("x1 = ");
		y2 = scan.nextInt();
		
		//Process
		
		double xDif = x2 - x1;
		double yDif = y2- y1;
		double squareX = Math.pow(xDif,2);
		double squareY = Math.pow(yDif,2);
		double dist = Math.sqrt(squareX + squareY);
		
		//Output
		
		System.out.print("The distance between (" + x1 + "," + y1);
		System.out.println(") and (" + x2 + "," + y2 + ") is " + 
		dec.format(dist));
		System.out.println("Goodbye!");
	}

}
/* Output
 * Enter the first coordinate values:
x1 = 5
y1 = 3
Enter the first coordinate values:
x2 = 6
x1 = 7
The distance between (5,3) and (6,7) is 4.123
Goodbye!
*/
