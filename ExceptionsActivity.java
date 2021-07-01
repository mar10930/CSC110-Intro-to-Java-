//Program Name : ExceptionsActivity  - Student Starting Code
//Author : Mario Luja
//Date: May 3, 2020
//Description : arrays and catching various exceptions


import java.util.Scanner;
import java.util.InputMismatchException; //need to import this exception class

/* Step 1:  Starting code executes. Complete all new code as indicated by comments.  Assume no bad input at this time. 
 *          Output should resemble expected output below
 */

/* Step 2:  Now run code and enter 15 for the number of values to load in the array.  
 *          Will generate an exception.  Handle the exception. System.out. a message indicating the issue.
 */

/* Step 3:  Run code and enter 0 for the number of values to load in the array.
 *          Will generate an exception.  Handle the exception. System.out. a message indicating the issue.
 */

/* Step 4:  Run code and enter "hello" for the number of values to load in the array.
 *          Will generate an exception.  Handle the exception. System.out. a message indicating the issue.
 *          Important: Will need to clear buffer with the following statement inside the catch statement:
 *          keyboard.nextLine();
 * 
 */

/* Step 5:  Catch any unexpected exceptions. System.out. a message indicating the issue.
 * 
 */

/* Step 6:  Submit your completed code with output included.
 * 
 */

public class ExceptionsActivity {

	public static void main(String[] args) 
	
	{
		int numOfValues = 10;
		int size = 10;
		int values;
		int[] dataArray = new int[size];
		Scanner keyboard = new Scanner(System.in);
		String tryAgain = "N";
		
		System.out.println("Welcome to our Exceptions Activity");
		do {
				try
				{	
					
					System.out.println("Loading the array");
					System.out.print("How many values do you want to load?");
					numOfValues = keyboard.nextInt();
					resetArray(dataArray);
						
					/**New code here**/
					/**inside the loop fill the array with 0, 10, 20,30, 40, 
					 * 50, 60....**/
					values = 0;
					for(int x = 0; x < numOfValues; x++)
					{
						dataArray[x] = values;
						values += 10;
					}
								
					System.out.println("My Array");
					System.out.println("-------");
								
					displayArray(dataArray)	;
					System.out.println("The average is: " + 
					calculateIntAverage(dataArray, numOfValues));					
		
				}
				//Catch input exception
				catch(InputMismatchException exp)
				{
					System.out.println("Oops that is not an integer");
					System.out.println(exp);
					keyboard.next();
				}
				//Catch array index exception
				catch(ArrayIndexOutOfBoundsException exp)
				{
					System.out.println("Tried to write outside the array. "
							+ "Enter a number less than 11.");
					System.out.println(exp);
				}
					
				//catch divide by zero exception
				catch(ArithmeticException exp)
					{
						System.out.println("Tried to divide by zero.");
						System.out.println(exp);
					}
				//Catch unknown exception
				catch(Exception exp)
				{
					System.out.println("An unknown exception occured");
					System.out.println(exp);
				}
				System.out.print("\nTry again? Y or N: ");
				tryAgain = keyboard.next();
				
			}while(tryAgain.equalsIgnoreCase("Y"));
			keyboard.close();	
			System.out.println("\nSee you later!");
		
				
	}
	
	
	/**new code here - complete this method so that the display looks like output 
	 * below**/
	public static void displayArray(int[] someArray)
	{
		for(int i = 0; i < someArray.length; i++)
		{
			System.out.println("[" + i + "]: " + someArray[i]);
		}
	
	}
	
	/**new code here - to calculate the integer average. average should be sum/num.  both sum and num are int **/
	public static int calculateIntAverage(int[] someArray,int num)
	{
		int sum = 0;
		int average = 0;
		
		for(int i = 0; i < someArray.length; i++)
		{
			sum += someArray[i];
		}
		average = sum/num;
		
		return average;
		
	}
	
	/**new code here - load all elements of the array with 0 **/
	public static void resetArray(int[] someArray)
	{		
		
		for(int i = 0; i < someArray.length; i++)
		{
			someArray[i] = 0;
		}
		
		
	}
	

}

/******STEP 1 OUTPUT ***************
Welcome to our Exceptions Activity
Loading the array
How many values do you want to load?5
My Array
-------
[0]: 0
[1]: 10
[2]: 20
[3]: 30
[4]: 40
[5]: 0
[6]: 0
[7]: 0
[8]: 0
[9]: 0
The average is: 20

Try again? Y or N: y
Loading the array
How many values do you want to load?7
My Array
-------
[0]: 0
[1]: 10
[2]: 20
[3]: 30
[4]: 40
[5]: 50
[6]: 60
[7]: 0
[8]: 0
[9]: 0
The average is: 30

******STEP 2 OUTPUT ***************
Try again? Y or N: y
Loading the array
How many values do you want to load?15

Tried to write outside the array. Enter a number less than 11.
java.lang.ArrayIndexOutOfBoundsException: 10

******STEP 3 OUTPUT ***************
Try again? Y or N: y
Loading the array
How many values do you want to load?0
My Array
-------
[0]: 0
[1]: 0
[2]: 0
[3]: 0
[4]: 0
[5]: 0
[6]: 0
[7]: 0
[8]: 0
[9]: 0

Tried to divide by zero
java.lang.ArithmeticException: / by zero

******STEP 4 OUTPUT ***************
Try again? Y or N: y
Loading the array
How many values do you want to load?hello

Oops that is not an integer
java.util.InputMismatchException

Try again? Y or N: n
******STEP 5  ***************
See you later!

*/