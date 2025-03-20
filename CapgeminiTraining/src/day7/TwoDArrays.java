//Jagged arrays

//arr[row index].length - length of the coloumns in that row
//arr.length - access length of rows in 2d array
//arr[row][coloumn]

package day7;

import java.util.Scanner;

public class TwoDArrays {
	public static void main(String[] args) {
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
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
