package day5;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
//		CalculatorApplication.addMenu();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to add\nEnter 2 to subtract\nEnter 3 to multiply\nEnter 4 to divide");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			CalculatorApplication.addMenu();
			break;
		case 2:
			CalculatorApplication.subMenu();
			break;
		case 3:
			CalculatorApplication.mulMenu();
			break;
		case 4:
			CalculatorApplication.divide();
			break;
		default:
			System.out.println("Invalid choice");

		}
		sc.close();

	}

}
