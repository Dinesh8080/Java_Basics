package DSA;

import java.util.Iterator;

public class WindowSlidingFIxed {
	public static void main(String[] args) {
		// window sliding - when we window size is fixed , we slide the window by removing left element , and adding right element
		// useful for max /min for subarray of size k
		int ar[] = { 2, 3, 4, 5, 8 };
		int k = 3;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			// ar {2,3,4}
			sum = sum + ar[i];
		}
		int high = sum; // update
		for (int i = k; i < ar.length; i++) {

			sum = sum + ar[i];// adding

			sum = sum - ar[i - k];// removing left

			high = Math.max(high, sum);
		}
		System.out.println(k + high);
	}
}
