package DSA_14;

import java.lang.reflect.Array;
import java.util.Arrays;
public class Fast_SlowPointer {
	public static int Fast_SlowPointerMethod(int ar[]) {
		Arrays.sort(ar);
		int slow = ar[0];
		int fast = ar[0];
		do {
			slow = ar[slow];
			fast = ar[ar[fast]];
		} while (slow != fast);

		fast = ar[0];
		while (slow != fast) {
			slow = ar[slow];
			fast = ar[fast];
		}
		return slow;
	}
	public static void main(String[] args) {

		int ar[] = { 2, 2, 6, 5, 3, 1, 3 };

		int k = Fast_SlowPointerMethod(ar);

		System.out.println(k);

	}

}
