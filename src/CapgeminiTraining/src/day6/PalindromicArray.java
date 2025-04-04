package day6;

import java.util.Scanner;

public class PalindromicArray {
	public static void main(String[] args) {
		checkPalindrome(createArray());

	}

	public static void checkPalindrome(int[] arr) {
		int size = arr.length;
		int num;
		for (int i = 0; i < size; i++) {
			num = arr[i];
			int r = 0;
			int num1 = num;
			while (num1 > 0) {
				int d = num1 % 10;
				r = r * 10 + d;
				num1 /= 10;

			}
			if (r == num)
				System.out.println("Plaindrome");
			else
				System.out.println("not");
		}

	}

	public static int[] createArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;

	}
}
