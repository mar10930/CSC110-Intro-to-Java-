/*
 * Program Name: ReadingFile.java
 * Author: Mario Luja
 * Class: CSC110AB
 * Date: Mar 5, 2020
 * Brief Description: This program reads a file, and
 * if the file contains doubles it calculates the average
 * of the doubles.
 * Input: none
 * Output: double values, double average, and string literals.
 */
import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;
public class ReadingFIle {

	public static void main(String[] args) throws IOException
	{
		//Declare variables and create objects
		double values;
		double sum = 0;
		double average;
		int count = 0;
		DecimalFormat dec = new DecimalFormat("0.##");
		File myFile = new File("StudentData.txt");
		Scanner inFile = new Scanner(myFile);
		
		//Reading file
		//Processing
		while(inFile.hasNext())
		{
			values = inFile.nextDouble();
			System.out.println(values);
			count++;
			sum += values;
		}
		
		//Calculate average
		average  = sum / count;
		
		//Display average
		//Output
		System.out.println("Average: " + dec.format(average));
		
		//Close the file
		inFile.close();
	}

}

/*

1.)What happens if the data in StudentData.txt is separated by spaces
on a single line instead of a new Line?

A: Since we are using the hasNext() method the blank spaces will
be ignored. Since the variable "values" is "inFile.nextDouble()"
only doubles will be stored in the variable.

2.)What happens if the data in StudentData.txt is separated by tabs?

A: Since tabs is also a whitespace it will be ignored by the 
scanner.

3.)What happens if the data in StudentData.txt is separated by commas?

A: Since we are using the hasNext() method and the commas act
like  a string, the commas will be read.
 
*/
