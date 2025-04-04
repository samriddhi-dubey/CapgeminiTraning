//a 2d array in which  number of cols in each row is different

//int arr[][]=new int[3][];
//arr[0]=new int[3];
//arr[1]=new int[2];

package day7;

import java.util.Scanner;

public class JaggedArrays {
	public static void main(String[] args) {
		printJaggedArray(createJaggedArray());
	}

	public static int[][] createJaggedArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r = sc.nextInt();
		int arr[][] = new int[r][];
	    for(int i=0;i<r;i++) {
	    	System.out.println("Enter the coloumn size");
	    	int c=sc.nextInt();
	    	arr[i]=new int[c];
	    }
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println("Enter the elements for row "+(i+1)+" ");
	    	for(int j=0;j<arr[i].length;j++) {
	    		arr[i][j]=sc.nextInt();
	    	}
	    }
		return arr;
	}
	
	public static void printJaggedArray(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
