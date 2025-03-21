package day7;

import java.util.Scanner;

public class GreatestElementofthe2DArray {
	public static void main(String[] args) {
		System.out.println(checkForGreatestElement(createArray())); 
	}

	public static int[][] createArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size");
		int a = sc.nextInt();
		System.out.println("Enter coloumn size");
		int b = sc.nextInt();
		int arr[][] = new int[a][b];
		int r = arr.length;
		int c = arr[0].length;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

	public static int checkForGreatestElement(int arr[][]) {
		int r = arr.length;
		int c = arr[0].length;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				max = Math.max(arr[i][j], max);
			}
		}
		return max;

	}

}
