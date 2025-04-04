//Synatx- for(datatype identifier: datastructure reference)
//not used to manipulate the array
//no loops are used to mainpulate the data structure

//In lists, the size is variable. 
//ConcurrentModificationError

package day6;

import java.util.Scanner;

public class ForEachLoop {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i: arr) {
			System.out.println(i);
		}
		sc.close();

	}

}
