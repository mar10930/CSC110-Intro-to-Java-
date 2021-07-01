
/*Program Name: DataDemo.java
Author:         Mario Luja
Class:          CSC 110
Date Written:   January 23,2020 
Brief Description: This program introduces variables, constant and 
primitive data types int, double, char and boolean        
Description of inputs:  None
Description of outputs: Display string literals, variables and their values. 
*/
public class DataDemo1
{

	public static void main(String[] args)
	{
		
		//Variable Declaration
		
		int anInteger;
		double aDouble;
		double number;
		char aLetter;
		
		//Input: Assigning values to the variables
		
		anInteger = 67;
		aDouble = 9.89;
		aLetter = 'A';

		//Processing
		
		anInteger = anInteger + 3;
		aDouble =  aDouble * 3;
		number = aDouble * 2;
		
		//Output
		
		System.out.println("The integer plus 3 = " + anInteger);
		System.out.println("The aDouble times 6 = " + number);
		System.out.println("The letter is " + aLetter);
	}

}
