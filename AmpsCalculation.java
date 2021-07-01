/*
 * Program Name: AmpsCalculation.java
 * Author: Mario Luja
 * Class: CSC110
 * Date: Feb 4, 2020
 * Brief Description: This program asks for voltage and resistance
 * as input and gives the current(amps) by dividing the voltage by
 * the resistance.
 * Input: double voltage, double resistance.
 * Output: double current and string literals.
 */
import java.util.Scanner;
public class AmpsCalculation {
	public static void main(String[] args) {

		double voltage;
		double resistance;
		double current;
		Scanner scan = new Scanner(System.in);
		
		//Input
		
		System.out.print("Enter the voltage: ");
		voltage = scan.nextDouble();
		System.out.print("Enter the resistance: ");
		resistance = scan.nextDouble();
		
		//Processing=
		
		current = voltage / resistance;
		
		//Output
		System.out.println();		
		System.out.println("Given a voltage (V) of " + voltage);
		System.out.println();
		System.out.println("Given a resistance (R) of " + resistance);
		System.out.println();
		System.out.println("The amps (I) are: " + current);
		
	}
}
/* Output
Enter the voltage: 120
Enter the resistance: 9.29

Given a voltage (V) of 120.0

Given a resistance (R) of 9.29

The amps (I) are: 12.917115177610334
*/
