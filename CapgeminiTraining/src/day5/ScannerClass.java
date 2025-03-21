//Scanner class-
//helps in taking input from files, userr and a string object
//present in java.util package

//shortcut for importing - ctrl + shift + o

//charAt method is not present in scanner class. 
//it is present in the string class whic is a part of the scanner class.

//util stands for utilities

//takes the user input in the form of string and returns the value in 
//integer form-nextInt()

//If we pass any different input other than the asked input
//we get an "InputMismatchException" and the program terminates

//next()-used to consume onlynone word
//nextLine()- consumes all the words seperated by spaces

package day5;

import java.util.*;

public class ScannerClass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// in-input from the user
		System.out.println("Enter you bio");
		System.out.println(sc.nextLine());
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the secon10d number");
		int num2 = sc.nextInt();
		System.out.println(num1 + num2);
		System.out.println(sc.nextBoolean());
		System.out.println(sc.nextByte());

		sc.close();

	}

}


