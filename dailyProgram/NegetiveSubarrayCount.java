//https://www.hackerrank.com/challenges/java-negative-subarray/problem

package dailyProgram;

import java.util.Scanner;

public class NegetiveSubarrayCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < size; i++) {
			int sum = 0;
			for (int j = i; j < size; j++) {
				sum = sum + arr[j];
				if (sum < 0) {
					count++;
				}
			}
		}
		System.out.print(count);
		sc.close();
	}
}
