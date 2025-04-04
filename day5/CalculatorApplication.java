package day5;

import java.util.Scanner;

public class CalculatorApplication {
//	public static void main(String[] args) {
//
//	}

	public static void addMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to add 2 nos\nEnter 2 to add 3 nos\n Enter 3 to add 3 nos");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
			break;
		case 2:
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(x + y + c);
			break;
		case 3:
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			int l = sc.nextInt();
			System.out.println(i + j + k + l);
			break;
		default:
			System.out.println("Invalid choice");

		}
		sc.close();

	}

	public static void subMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to subtract 2 nos\nEnter 2 to subtract 3 nos\n Enter 3 to subtract 3 nos");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a - b);
			break;
		case 2:
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(x - y - c);
			break;
		case 3:
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			int l = sc.nextInt();
			System.out.println(i - j - k - l);
			break;
		default:
			System.out.println("Invalid choice");

		}
		sc.close();

	}

	public static void mulMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to multiply 2 nos\nEnter 2 to multiply 3 nos\n Enter 3 to multiply 3 nos");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a * b);
			break;
		case 2:
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(x * y * c);
			break;
		case 3:
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			int l = sc.nextInt();
			System.out.println(i * j * k * l);
			break;
		default:
			System.out.println("Invalid choice");

		}
		sc.close();

	}

	public static void divide() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers to divide");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a / b);
		sc.close();

	}
}
