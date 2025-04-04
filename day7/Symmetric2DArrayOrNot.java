package day7;

import java.util.Scanner;

public class Symmetric2DArrayOrNot {
	public static void main(String[] args) {
		int[][] matrix = createArray();
		if (matrix.length != matrix[0].length) {
			System.out.println("Matrix is not square, hence not symmetric.");
		} else {
			System.out.println(checkSymmetry(matrix) ? "Matrix is Symmetric" : "Matrix is Not Symmetric");
		}
		transposeArray(matrix);
	}

	public static int[][] createArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size:");
		int rows = sc.nextInt();
		System.out.println("Enter column size:");
		int cols = sc.nextInt();

		int[][] arr = new int[rows][cols];

		System.out.println("Enter matrix elements:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		sc.close();
		return arr;
	}

	public static void transposeArray(int[][] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				  int temp = arr[i][j];
	                arr[i][j] = arr[j][i];
	                arr[j][i] = temp;
			}
		}
		
		
		for (int[] i : arr) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
		

	}

	public static boolean checkSymmetry(int[][] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] != arr[j][i]) {
					return false;
				}
			}
		}
		return true;
	}
}
