package day6;

import java.util.Arrays;

public class ArraysUtility {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 45, 67, 78 };
		int arr2[] = { 1, 4, 45, 67, 78 };
		// use of binarySearch method
//		int target = 45;
//      System.out.println(Arrays.binarySearch(arr, target));

		// Use of copyOf mmethod
//		int[] array = Arrays.copyOf(arr, 7);
//		for (int i : array) {
//			System.out.println(i);

		// use of copyOfRange method
//		int[] array = Arrays.copyOfRange(arr, 1, 5);
//		for (int i : array) {
//			System.out.println(i);
//
//		}

		// use of equlas method in an array
//		System.out.println(Arrays.equals(arr, arr2));

		// use of sort method-can sort any type of an array in ascending order
		int arr3[] = { 4, 2, 67, 7, 9, 36 };
		Arrays.sort(arr3);
//		for (int i : arr3) {
//			System.out.println(i);
//		}
		
		System.out.println(Arrays.toString(arr3));

	}

}
