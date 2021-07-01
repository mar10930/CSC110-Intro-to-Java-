/*
 * Program Name: GeometryCalculator.java
 * Author: Mario Luja
 * Class: CSC110
 * Date: Feb 20, 2020
 * Brief Description: This program calculates the area or volume
 * of certain shape by using a menu which is operated using the
 * switch statement. We also validate input using the if else if
 * chain.
 * Input: double radius, double height, double length, double width,
 * double base, and double volume.
 * Output: double area, and string literals.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class GeometryCalculator {

	public static void main(String[] args) {

		//Declare variables and objects
		int userChoice;
		double radius;
		double height;
		double length;
		double width;
		double base;
		double area;
		double volume;

		Scanner scan = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("0.####");
		
		
		//Input
		System.out.println("*** Geometry Calculator ***\n");
		System.out.println("1.\tCalculate the area of a Circle");
		System.out.println("2.\tCalculate the area of a Rectangle");
		System.out.println("3.\tCalculate the area of a Triangle");
		System.out.println("4.\tCalculate the volume of a Cylinder");
		System.out.println("5.\tQuit\n");
		System.out.print("Enter your choice (1-5): ");
		userChoice = scan.nextInt();
		
		//Processing
		switch(userChoice)
		{
			case 1:
				System.out.print("Enter the circle's radius: ");
				radius = scan.nextDouble();
				
				if(radius < 0)
				{
					//Output
					System.out.print("Only positive values are ");
					System.out.println("accepted for the radius.");
					System.out.print("Thanks for using the Geometry ");
					System.out.println("Calculator!");
				}
				else
				{
					//Output
					area = Math.PI * Math.pow(radius,2);
					System.out.println("The area is " + 
					dec.format(area));
					System.out.print("Thanks for using the Geometry ");
					System.out.println("Calculator!");
				}
				break;
			case 2:
				System.out.print("Enter the rectangle's length: ");
				length = scan.nextDouble();
				System.out.print("Enter the rectangle's width: ");
				width = scan.nextDouble();
				if(length < 0 && width < 0)
				{
					//Output
					System.out.print("Only positive values are ");
					System.out.print("accepted for the length ");
					System.out.println("and width.");
					System.out.print("Thanks for using the Geometry ");
					System.out.println("Calculator!");	
				}
				else if(length < 0)
				{
					//Output
					System.out.print("Only positive values are ");
					System.out.println("accepted for the base.");
					System.out.print("Thanks for using the Geometry ");
					System.out.println("Calculator!");
				}
				else if(width < 0)
				{
					//Output
					System.out.print("Only positive values are ");
					System.out.println("accepted for the height.");
					System.out.print("Thanks for using the Geometry ");
					System.out.println("Calculator!");
				}
			
				else
				{
					//Output
					area = length * width;
					System.out.println("The area is " + 
							dec.format(area));
					System.out.print("Thanks for using the Geometry ");
					System.out.println("Calculator!");
				}
				break;
			case 3:
				System.out.print("Enter the length of the base: ");
				base = scan.nextDouble();
				System.out.print("Enter the triangle's height: ");
				height = scan.nextDouble();
				
				if(base < 0 && height < 0)
				{
					//Output
					System.out.print("Only positive values are ");
					System.out.print("accepted for the base ");
					System.out.println("and height.");
					System.out.print("Thanks for using the Geometry ");
					System.out.println("Calculator!");	
				}
				else if(base < 0)
				{
					System.out.print("Only positive values are ");
					System.out.println("accepted for the base.");
					System.out.print("Thanks for using the Geometry ");
					System.out.println("Calculator!");
				}
				else if(height < 0)
				{
					System.out.print("Only positive values are ");
					System.out.println("accepted for the height.");
					System.out.print("Thanks for using the Geometry ");
					System.out.println("Calculator!");
				}
				else
				{
					volume = (base * height) / 2;
					System.out.println("The area is " + 
							dec.format(volume));
					System.out.print("Thanks for using the Geometry ");
					System.out.println("Calculator!");
				}
				break;
			case 4:
				System.out.print("Enter the cylinder's radius: ");
				radius = scan.nextDouble();
				System.out.print("Enter the cylinder's height: ");
				height = scan.nextDouble();
				if(radius < 0 && height < 0)
				{
					//Output
					System.out.print("Only positive values are ");
					System.out.print("accepted for the radius ");
					System.out.println("and height.");
					System.out.print("Thanks for using the Geometry ");
					System.out.println("Calculator!");	
				}
				else if(radius < 0)
				{
					//Output
					System.out.print("Only positive values are ");
					System.out.println("accepted for the radius.");
					System.out.print("Thanks for using the Geometry ");
					System.out.println("Calculator!");
				}
				else if(height < 0)
				{
					//Output
					System.out.print("Only positive values are ");
					System.out.println("accepted for the height.");
					System.out.print("Thanks for using the Geometry ");
					System.out.println("Calculator!");
				}
				else
				{
					//Output
					volume = Math.PI * Math.pow(radius,2) *
					height;
					System.out.println("The volume is " + 
							dec.format(volume));
					System.out.print("Thanks for using the Geometry ");
					System.out.println("Calculator!");
				}
				break;
			case 5:
				
				//Output
				System.out.println("Quitting program now.");
				System.out.print("Thanks for using the Geometry ");
				System.out.println("Calculator!");
				break;
			default:
				
				//Output
				System.out.print("You may only enter 1, 2, 3, 4,");
				System.out.println(" or 5.");
				System.out.print("Thanks for using the Geometry ");
				System.out.println("Calculator!");
				break;
		}
		
	}

}
/*

*** Geometry Calculator ***

1.	Calculate the area of a Circle
2.	Calculate the area of a Rectangle
3.	Calculate the area of a Triangle
4.	Calculate the volume of a Cylinder
5.	Quit

Enter your choice (1-5): 1
Enter the circle's radius: 4.3
The area is 58.088
Thanks for using the Geometry Calculator!

*** Geometry Calculator ***

1.	Calculate the area of a Circle
2.	Calculate the area of a Rectangle
3.	Calculate the area of a Triangle
4.	Calculate the volume of a Cylinder
5.	Quit

Enter your choice (1-5): 2
Enter the rectangle's length: 32
Enter the rectangle's width: 12.2
The area is 390.4
Thanks for using the Geometry Calculator!

*** Geometry Calculator ***

1.	Calculate the area of a Circle
2.	Calculate the area of a Rectangle
3.	Calculate the area of a Triangle
4.	Calculate the volume of a Cylinder
5.	Quit

Enter your choice (1-5): 3
Enter the length of the base: 4.3
Enter the triangle's height: 6.7
The area is 14.405
Thanks for using the Geometry Calculator!

*** Geometry Calculator ***

1.	Calculate the area of a Circle
2.	Calculate the area of a Rectangle
3.	Calculate the area of a Triangle
4.	Calculate the volume of a Cylinder
5.	Quit

Enter your choice (1-5): 4
Enter the cylinder's radius: 32.2
Enter the cylinder's height: 12
The volume is 39087.9471
Thanks for using the Geometry Calculator!

*** Geometry Calculator ***

1.	Calculate the area of a Circle
2.	Calculate the area of a Rectangle
3.	Calculate the area of a Triangle
4.	Calculate the volume of a Cylinder
5.	Quit

Enter your choice (1-5): 5
Quitting program now.
Thanks for using the Geometry Calculator!

*** Geometry Calculator ***

1.	Calculate the area of a Circle
2.	Calculate the area of a Rectangle
3.	Calculate the area of a Triangle
4.	Calculate the volume of a Cylinder
5.	Quit

Enter your choice (1-5): 43
You may only enter 1, 2, 3, 4, or 5.
Thanks for using the Geometry Calculator!

*** Geometry Calculator ***

1.	Calculate the area of a Circle
2.	Calculate the area of a Rectangle
3.	Calculate the area of a Triangle
4.	Calculate the volume of a Cylinder
5.	Quit

Enter your choice (1-5): 4
Enter the cylinder's radius: -3
Enter the cylinder's height: 2
Only positive values are accepted for the radius.
Thanks for using the Geometry Calculator!

*/
