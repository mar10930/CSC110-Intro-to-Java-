
// ****************************************************************
//   Program Name : LoveCS.java
//	  Author : Mario Luja and Alan 
//   Date:
//   Description:
//     Use a while loop to print many messages declaring your
//     passion for Computer Science.
//   
// ****************************************************************

import java.util.Scanner;
public class LoveCS
{
    public static void main(String[] args)
    {
		int limit;
		int count;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		count = 1;                //1.Initialize count to 1
		
		System.out.print("How many times do you want to print " +
				"the message? ");
		limit = scan.nextInt();
		while(limit % 2 != 0)
		{
			System.out.print("Only even numbers are allowed : please enter"
					+ "an even number: ");
			limit = scan.nextInt();
		}
		while (count <= limit && limit % 2 == 0)    //2.Condition
		{
          
		  System.out.println(count + " I love Computer Science!!");
		  count++;               //3.Increment count 
		  sum += count;
		}
		System.out.println("Message was printed " + (count-1) + 
		" times");
		System.out.println("The sum of the numbers from 1 to " + count
		+ " is " + sum);



    }
}

/* Example output

 I love Computer Science!!
I love Computer Science!!
I love Computer Science!!
I love Computer Science!!
I love Computer Science!!


*/
