package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 23, 2, 56, 4, 32, 7 };
		int n = arr.length;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
