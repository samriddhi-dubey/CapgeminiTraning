//multiple values of the same data type

//Properties of arrays-homogeneous, size is fixed, indexed based data structures, object of java
//array stores default values of their type
//array size cannot be changed after creation i.e array element cannot be deleted. It can only be modified.

//Syntax of creating an array- datatype [] identifier=new datatype[size];

//integer=4 bytes

//math class is a type of utility function

//Arrays class is for the array class

package day6;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int [] arr=new int[] {1,30,56};

//		int arr[]= {1,30,56};

		// insering elements from the user
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
//		System.out.println(arr);  This prints the reference of an array

		// printing the array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		sc.close();
	}

}
