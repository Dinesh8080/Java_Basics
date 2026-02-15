package DSA_14;
public class BinarySearch {
	public static int binarySearchMethod(int ar[], int target) {
		int left = 0;
		int right = ar.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (ar[mid] == target) {
				return mid; // return index
			}
			else if (ar[mid] < target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return -1; // not found
	}
	public static void main(String[] args) {
		int ar[] = { 1, 3, 4, 5, 6, 7 }; // must be sorted
		int target = 3;
		int k = binarySearchMethod(ar, target);
		System.out.println("Target found at index: " + k);
	}
}