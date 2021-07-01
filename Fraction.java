import java.util.Scanner;
public class Fraction {

	public static void main(String[] args) {

		int numerator;
		int denominator;
		double fraction;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the numerator of the fraction: ");
		numerator = scan.nextInt();
		System.out.print("Please enter the denominator of the fraction: " );
		denominator = scan.nextInt();
		
		fraction = (double)numerator/denominator;
		
		System.out.println(numerator + "/" + denominator + "=" + fraction );
		
	}

}
