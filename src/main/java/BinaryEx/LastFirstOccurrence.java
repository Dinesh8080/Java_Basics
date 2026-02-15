package BinaryEx;
import java.util.Arrays;
public class LastFirstOccurrence {
	public static int LastOccurrenceMethod(int ar[], int target) {
		Arrays.sort(ar);
		int left = 0;
		int right = ar.length - 1;
		// int ans =-1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (ar[mid] == target) {
				// ans =mid;
				left = mid + 1;
				return mid; // return index
			} else if (ar[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
	 public static int countMethod(int ar[], int target) {
	        Arrays.sort(ar);
	        int left = 0;
	        int right = ar.length - 1;
	        int count = 0;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (ar[mid] == target) {
	                count++;
	                // move both sides so we can count all occurrences
	                left = mid + 1;
	                right = mid - 1;
	            }
	            else if (ar[mid] < target) {
	                left = mid + 1;
	            }
	            else {
	                right = mid - 1;
	            }
	        }

	        return count;
	    }

	public static void main(String[] args) {

		int ar[] = { 1, 2, 3, 4, 2, 4, 3, 4, 4, 6, 7, 7, 3 };
		int target = 4;

		// System.out.println(LastOccurrenceMethod(ar,target));
		int k = countMethod(ar, target);
		System.out.println(k);

	}

}
