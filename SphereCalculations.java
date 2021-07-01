/*
 * Program Name: SphereCalculations.java
 * Author: Mario Luja
 * Class: CSC110
 * Date: Feb 10, 2020
 * Brief Description: This program asks for the radius of a sphere
 * and using the math class it solves the volume and surface area of
 * the sphere and outputs it properly with the help of the 
 * DecimalFormat class.
 * Input:double radius.
 * Output: double volume, double surfaceArea, and string literals.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class SphereCalculations {

	public static void main(String[] args) 
	{
		double radius;
		double volume;
		double surfaceArea;
		Scanner scan = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("0.####");
		
		//Input
		
		System.out.print("Enter the raidus of the sphere: ");
		radius = scan.nextDouble();
		
		//Processing
		
		volume = (4.0/3.0)* Math.PI * Math.pow(radius,3);
		surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
		
		//Output
		System.out.println();
		System.out.println("Volume: " + dec.format(volume));
		System.out.println("Surface Area: " + dec.format(surfaceArea));
		System.out.println("Goodbye!!");
	}

}
/*Output
Enter the raidus of the sphere: 5.68

Volume: 767.5976
Surface Area: 405.4213
Goodbye!!
 */