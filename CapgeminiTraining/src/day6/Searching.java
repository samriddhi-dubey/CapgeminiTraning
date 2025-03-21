//Binary search-divide and conquer-divides the array in two parts-useful for large data

//Linear search-countable data-then go for linear search

package day6;

import java.util.Scanner;
import java.util.Arrays;

public class Searching {
	public static void main(String[] args) {
		int k = binarySearch();
		if (k == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found");

	}

	public static int binarySearch() {
		Scanner sc = new Scanner(System.in);
		int array[] = { 2, 7, 9, 15, 20, 75 };
		Arrays.sort(array);
		int left = 0;
		int right = array.length - 1;
		int target = 25;
		sc.close();

		while (left <= right) {
			int mid = (left + right) / 2;

			if (array[mid] == target) {
				return mid;

			} else if (array[mid] > target) {
				right = mid - 1;

			} else {
				left = mid + 1;
			}
		}

		return -1;
	}

}
