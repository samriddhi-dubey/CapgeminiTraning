//statements used to execute a block of code based on a condition

package day5;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ELSE-IF LADDER
//		System.out.println("Enter a number");
//		int n = sc.nextInt();
//		if ((n % 2 == 0) && (n > 0)) {
//			System.out.println("Positive even");
//
//		} else if ((n % 2 == 0) && (n < 0)) {
//			System.out.println("Negetive even");
//		}
//
//		else if (n % 2 != 0 && n > 0) {
//			System.out.println("Positivee odd");
//		} else if (n % 2 != 0 && n < 0) {
//			System.out.println("Negetive odd");
//		}

		// SWITCH STATEMENTS

		// break-takes the control out of the currently executing block
		// order of case blocks does not matter
		// as choice-int, byte, short, character, string- only these types of data can
		// be passed as choice

		System.out.println("Enter 1 to add\nEnter 2 to subtract\nEnter 3 to multiply\nEnter 4 to divide");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("addition");
			break;
		case 2:
			System.out.println("subtraction");
			break;
		case 3:
			System.out.println("multiplication");
			break;
		case 4:
			System.out.println("Division");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		sc.close();

	}

}
