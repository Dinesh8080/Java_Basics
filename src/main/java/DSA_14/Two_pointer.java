package DSA_14;

public class Two_pointer {

	public static int twopointermethod(int ar[], int target) {
		int left = 0;
		int right = ar.length - 1;
		while (left < right) {

			int sum = ar[left] + ar[right];

			if (sum == target) {
				System.out.println(ar[left] + " " + ar[right]);
				break;
			}

			else if (sum < target) {
				left++;

			} else {
				right--;
			}

		}
		return target;

	}

	public static void main(String[] args) {

		int ar[] = { 1, 2, 3, 4, 5 };
		int target = 9;

		int u = twopointermethod(ar, target);
		System.out.println(u);
	}

}
