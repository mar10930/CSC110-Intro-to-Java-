import java.util.Scanner;   // Needed for Scanner class

/**
   Name: Mario Luja
   Date:  April 6, 2020
   Description: This program shows values being stored in an array's
   elements and displayed.
*/

public class ArrayDemo1
{
   public static void main(String[] args)
   {
      final int EMPLOYEES = 3;  // Number of employees
         // declare and instantiate an Array of hours
      
      double[] hours = new double[EMPLOYEES];
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the hours worked by " +
                         EMPLOYEES + " employees.");

      // Get the hours worked by employee 1.
      System.out.print("Employee 1: ");
      
      hours[0] = keyboard.nextDouble();
      
      // Get the hours worked by employee 2.
      System.out.print("Employee 2: ");
     
      hours[1] = keyboard.nextDouble();

      // Get the hours worked by employee 3.
      System.out.print("Employee 3: ");
     
      hours[2] = keyboard.nextDouble();

      // Display the values entered.
      System.out.println("The hours you entered are:");
      System.out.println(hours[0]);
     //display hours sub 1 and hours sub 2
      System.out.println(hours[1]);
      System.out.println(hours[2]);
   }
}     
/* Example Output

Enter the hours worked by 3 employees.
Employee 1: 45
Employee 2: 12
Employee 3: 10.5
The hours you entered are:
45.0
12.0
10.5

*/