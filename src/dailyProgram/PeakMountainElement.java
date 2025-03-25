//https://leetcode.com/problems/peak-index-in-a-mountain-array

package dailyProgram;

public class PeakMountainElement {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,3,2,1};
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int mid=(start+end)/2;
			if(arr[mid]>arr[mid+1]) {
				end=mid;
				
			}else {
				start=mid+1;
			}
		}
		System.out.println(start);
	}

}
