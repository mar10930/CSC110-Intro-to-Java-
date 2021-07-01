//**********************************************************
//  In class Activity - Ch 7 Arrays - 2D/Multidimensional
//  Program Name : ArrayActivity2D.java  Starting File
//
//  Author: Mario Luja
//  Date Written : Apr 29, 2020
//  Class: CSC110AB
//
//  Brief Description : Intro to 2 dimensional arrays in a java
//  
//**********************************************************

public class ArrayActivity2D
{
    public static void main(String[] args)
    {
		double value = 0.0;
		double sum = 0.0;
		double average = 0.0;
		int countValues = 0;
		
		//Declare an array called myExams that keeps track of exam scores for 10 students.
		//Each student has 3 quiz scores.
		
		double[][] myExams = new double[10][3];

    	//load the array with the values 0 - 29, in order
		value = 0;
    	
    	for(int row = 0; row < myExams.length; row++)
    	{
    		for(int col = 0; col < myExams[row].length; col++)
    		{
    			myExams[row][col] = value;
    			value++;
    		}
    	}
		
		// display all the components of the array
		System.out.println("Display the array\n");

		for(int row = 0; row < myExams.length; row++)
    	{

    		for(int col = 0; col < myExams[row].length; col++)
    		{
    			System.out.print(myExams[row][col] + "  ");
    		}
    		System.out.println();
    	}
		
		// add up all the element values in the array
		sum = 0.0;
		
		for(int row = 0; row < myExams.length; row++)
    	{
    		for(int col = 0; col < myExams[row].length; col++)
    		{
    			sum += myExams[row][col];
    		}
    	}
		
		System.out.println("The sum of the array: " + sum);

		// challenge : calculate the average
		
		for(int row = 0; row < myExams.length; row++)
    	{
    		for(int col = 0; col < myExams[row].length; col++)
    		{
    			countValues++;
    		}
    	}
		
		average = (double) sum/countValues;
		
		System.out.println("\nChallenge: Calculate the average ");
		System.out.println("The average is :" + average);
		
		
		
		System.out.println("\nChallenge: Count how many values that are greater than 22: ");
		
		countValues = 0;
		
		for(int row = 0; row < myExams.length; row++)
    	{
    		for(int col = 0; col < myExams[row].length; col++)
    		{
    			if(myExams[row][col] > 22)
    			{
    				countValues++;
    			}
    		}
    	}
		
		System.out.println("Number of values greater than 22: " + countValues);
		


    }
}
/* Output

Display the array

0.0  1.0  2.0  
3.0  4.0  5.0  
6.0  7.0  8.0  
9.0  10.0  11.0  
12.0  13.0  14.0  
15.0  16.0  17.0  
18.0  19.0  20.0  
21.0  22.0  23.0  
24.0  25.0  26.0  
27.0  28.0  29.0  
The sum of the array: 435.0

Challenge: Calculate the average 
The average is :14.5

Challenge: Count how many values that are greater than 22: 
Number of values greater than 22: 7
 
*/
