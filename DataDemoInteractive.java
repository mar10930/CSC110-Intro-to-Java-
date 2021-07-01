/*
Program Name: DataDemoInteractive.java
Author:         Mario Luja
Class:          CSC 110
Date Written:   January 27,2020 
Brief Description: This program introduces the scanner class, and how
to enter input.   
Description of inputs:  Enter an integer and double data type.
Description of outputs: Displays the inputed variables.
 */
import java.util.Scanner;
public class DataDemoInteractive {

	public static void main(String[] args) {

	//Declare Variables and creating objects
		
		int iNumber;
		double dNumber;
		String name;
		
		//Create scanner object
		Scanner scan = new Scanner(System.in);
		
	//Input
		
		System.out.print("Please enter an integer: ");
		iNumber = scan.nextInt();
		System.out.print("Please enter a decimal number: ");
		dNumber = scan.nextDouble();
		
	//Processing - none
		
	//Output
		
		System.out.println("Here is the integer " + iNumber);
		System.out.println("Here is the decimal " + dNumber);
		
	}

}
