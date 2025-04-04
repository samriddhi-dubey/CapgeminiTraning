//If you are using any scanner methods begore using the nextLine() then
//the nextLine() has to be used twice, once to store the "/n" character
//other one to store the string input from the user.
//If not then the compiler takes the "/n" character as the string
//without allowing the user to input a string.

//scanner class a default delimter of space, and therefore stops accepting data therafter.

//but we can change the default deliemeter by using "sc.useDelimeter(",");

package day5;

import java.util.Scanner;

public class ScannerClassTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println(num1);
//		sc.nextLine();
		System.out.println("Enter a string");
		String s = sc.nextLine();
		System.out.println(s);
		sc.close();

	}
}
//iF we pass a string instead of "system.in" then the console will not wait for the user to input the data after compilation.
//hasnextInt()-function to check if data entered can be converted to an integer or not. if yes it will return true else false
//we do not hava hasnextChar()