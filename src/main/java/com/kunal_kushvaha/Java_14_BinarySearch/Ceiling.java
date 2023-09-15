
package com.kunal_kushvaha.Java_14_BinarySearch;

public class Ceiling {
	public static void main(String[] args) {
		Ceiling c = new Ceiling();
		int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 4;

		int ans = c.celing(arr, target);
		System.out.println(ans);

	}

	public int celing(int arr[], int target) {
		// but what if the target is greater than the greatest number in the array
		if (target > arr[arr.length - 1]) {
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			// find the middle element
			//int mid = (start + end) / 2; 
			// might be possible that (start + end) exceeds the range of int in java
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				// ans found
				return mid;
			}
		}
		return start;

	}

}
