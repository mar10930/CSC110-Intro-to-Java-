
import java.io.* ;
import java.util.Scanner;
/*Files Activity 1 : Writing to a text file  STARTING CODE
Program Name : WritingToFiles.java
 Author : Mario Luja
Date : Mar 3, 2020
Class : CSC110AB

Brief Description : This program writes 5 floating-point numbers to a file */


public class WritingToFiles {


   public static void  main(String arg []) throws FileNotFoundException
	{
		//Variables to store exam scores before writing them file
	
		
		double num1, num2 , num3 , num4 , num5 ;
		
		//Prompt user for all five scores and store them
		//in the above variables
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter exam score 1: ");
		num1 = scan.nextDouble();
		System.out.print("Enter exam score 2: ");
		num2 = scan.nextDouble();
		System.out.print("Enter exam score 3: ");
		num3 = scan.nextDouble();
		System.out.print("Enter exam score 4: ");
		num4 = scan.nextDouble();
		System.out.print("Enter exam score 5: ");
		num5 = scan.nextDouble();
		
		//Define a PrintWriter object reference outFile and 
		//create a PrintWriter object by passing file name StudentData.txt
		PrintWriter outFile = new PrintWriter("StudentData.txt");
	

	    //Use the opened file and write all the exam scores 
	
		outFile.println(num1);
		outFile.println(num2);
		outFile.println(num3);
		outFile.println(num4);
		outFile.println(num5);

		//write a message back to the user
		System.out.println("Your numbers have been written to the StudentData.txt file.\n");
		
	    //Close the output file

		outFile.close();
		
	    System.out.println("Goodbye\n");;

	}
}

/*Please answers the questions below as comments 
Save file with your answers and then upload to Canvas

   1.	Where is StudentData.txt located?
   
   	In my computer the file is located under my created folder called
   	"Chapter4Programs" but it is not under the src folder.

   2.	What happens to data that is StudentData.txt when you run your
         program again with different exam values?
         
    The data values are overwritten with the new values.
         
Output:

Enter exam score 1: 65
Enter exam score 2: 87.6
Enter exam score 3: 54
Enter exam score 4: 97.6
Enter exam score 5: 56.7
Your numbers have been written to the StudentData.txt file.


Goodbye      
*/



