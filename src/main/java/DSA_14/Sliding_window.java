package DSA_14;
//case 1: Find the maximum sum of a subarray of size "k" in an array.
//salag 
public class Sliding_window {
	public static int slidingwindowmethod(int ar[], int k) {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + ar[i];
		}
		int maxi = sum;
		
			for (int i = k; i < ar.length; i++) {
			sum = sum + ar[i];
			sum = sum - ar[i - k];
			maxi = Math.max(sum, maxi);
			}
		return maxi;
}
		public static void main(String[] args) {
		
		int ar[] = { 1, 4, 1, 3, 5 };
		int k = 2;
		int m =slidingwindowmethod(ar, k);
		System.out.println(m);
	}
}
