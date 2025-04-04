//Jagged arrays

//arr[row index].length - length of the coloumns in that row
//arr.length - access length of rows in 2d array
//arr[row][coloumn]

// int arr[][]={{1,2,3},
//              {4,5,6},
//              {7,8,9}}

//Arrays.deepEquals(arr1,aar2)

package day7;

//import java.util.Arrays;
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
//		for (int i = 0; i < r; i++) {
//			for (int j = 0; j < c; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		for (int[] i : arr) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();

		}

//		System.out.println(Arrays.deepToString(arr));
//
//		for (int i : arr[r - 1]) {
//			for (int j : arr[c - 1]) {
//				System.out.print(i);
//			}
//			System.out.println();
//
//		}

		sc.close();
	}

}
