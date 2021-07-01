/*
 * Program Name: Exam.java
 * Author: Mario Luja
 * Class: CSC110
 * Date: Feb 4, 2020
 * Brief Description: This program obtains 3 test scores and finds
 * the average of all 3 scores.
 * Input: int score1, int score2, int score3; the test scores.
 * Output: double average; the average of all three scores.
 */
import java.util.Scanner;
public class Exam {

	public static void main(String[] args) {

		//Variables and objects
		int score1;
		int score2;
		int score3;
		double average;
		Scanner scan = new Scanner(System.in);
		
		//Input
		System.out.print("Enter test 1 score: ");
		score1 = scan.nextInt();
		System.out.print("Enter test 2 score: ");
		score2 = scan.nextInt();
		System.out.print("Enter test 3 score: ");
		score3 = scan.nextInt();
		
		//Processing
		
		average = (double)(score1 + score2 + score3) / 3;
		
		//Output
		System.out.print("The average of the 3 scores is " + average);
		
	}
}
/* Output
Enter test 1 score: 90
Enter test 2 score: 91
Enter test 3 score: 100
The average of the 3 scores is 93.66666666666667
*/
